package chrome.xmdl.xgen.util;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("deprecation")
public class URIHelper {

	protected static URI fix(URL url, String fragment) throws IOException {
		// Only file-scheme URIs will be re-encoded. If a URI was decoded in the
		// workaround
		// above, and Platform.resolve() didn't return a file-scheme URI, then
		// this will return
		// an decoded URI.
		//
		URI result = "file".equalsIgnoreCase(url.getProtocol()) ? URI
				.createFileURI(URI.decode(url.getFile())) : URI.createURI(url
				.toString());
		if (fragment != null) {
			result = result.appendFragment(fragment);
		}
		return result;
	}

	/**
	 * Use the platform to convert to a local URI.
	 */
	public static URI resolve(URI uri) {
		String fragment = uri.fragment();
		URI uriWithoutFragment = uri.trimFragment();
		String uriWithoutFragmentToString = uriWithoutFragment.toString();

		URL url = null;
		try {
			url = Platform.resolve(new URL(uriWithoutFragmentToString));
		} catch (IOException exception1) {
			// Platform.resolve() doesn't work if the project is encoded.
			//
			try {
				uriWithoutFragmentToString = URI
						.decode(uriWithoutFragmentToString);
				url = Platform.resolve(new URL(uriWithoutFragmentToString));
			} catch (IOException exception2) {
			}
		}
		if (url != null) {
			try {
				return fix(url, fragment);
			} catch (IOException exception) {
			}
		}

		return uri;
	}

	/**
	 * Use the platform to convert to a local URI.
	 */
	public static URI asLocalURI(URI uri) {
		try {
			String fragment = uri.fragment();
			URL url = Platform
					.asLocalURL(new URL(uri.trimFragment().toString()));
			return fix(url, fragment);
		} catch (IOException exception) {
		}
		return uri;
	}

}
