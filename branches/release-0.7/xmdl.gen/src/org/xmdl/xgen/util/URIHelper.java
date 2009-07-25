package org.xmdl.xgen.util;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;

/**
 * This helper class is used for various URI related operations.
 * 
 * @author Hakan Dilek
 */
public class URIHelper {

	/**
	 * Used to fix the given URL scheme, and return it as a URI.
	 * 
	 * Only file-scheme URIs will be re-encoded. If a URI was decoded in the
	 * workaround above, and Platform.resolve() didn't return a file-scheme URI,
	 * then this will return an decoded URI.
	 * 
	 * @param url
	 *            the URL scheme
	 * @param fragment
	 *            fragment appended at the end of result URI
	 * @return the result URI
	 * @throws IOException
	 *             on problems
	 */
	protected static URI fix(URL url, String fragment) throws IOException {
		String protocol = url.getProtocol();
		URI result = "file".equalsIgnoreCase(protocol) ? URI.createFileURI(URI
				.decode(url.getFile())) : URI.createURI(url.toString());
		if (fragment != null) {
			result = result.appendFragment(fragment);
		}
		return result;
	}

	/**
	 * Use the platform to convert to a local URI.
	 * 
	 * @param uri
	 *            the URI to resolve
	 * @return the resolved URI
	 */
	public static URI resolve(URI uri) {
		String fragment = uri.fragment();
		URI uriWithoutFragment = uri.trimFragment();
		String uriWithoutFragmentToString = uriWithoutFragment.toString();

		URL url = null;
		try {
			URL unresolvedURL = new URL(uriWithoutFragmentToString);
			url = FileLocator.resolve(unresolvedURL);
		} catch (IOException exception1) {
			// Platform.resolve() doesn't work if the project is encoded.
			//
			try {
				String decoded = URI.decode(uriWithoutFragmentToString);
				URL decodedURL = new URL(decoded);
				url = FileLocator.resolve(decodedURL);
			} catch (IOException exception2) {
				// ignore this
			}
		}
		if (url != null) {
			try {
				return fix(url, fragment);
			} catch (IOException exception) {
				// ignore this
			}
		}
		return uri;
	}

	/**
	 * Use the platform to convert to a local URI.
	 * 
	 * @param uri
	 *            the URI to convert
	 * @return the converted URI
	 */
	public static URI asLocalURI(URI uri) {
		try {
			String fragment = uri.fragment();
			uri = resolve(uri);
			URI trimmed = uri.trimFragment();
			URL url = new URL(trimmed.toString());
			url = FileLocator.resolve(url);
			URL localURL = FileLocator.toFileURL(url);
			return fix(localURL, fragment);
		} catch (IOException exception) {
			// ignore this
		}
		return uri;
	}

}
