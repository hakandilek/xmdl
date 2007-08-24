package chrome.xmdl.ui.perspective;

import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * The XMDL Modeling Perspective
 * 
 * @author hakan
 */
public class XmdlModelingPerspective implements IPerspectiveFactory {

	/**
	 * Perspective ID
	 */
	public static final String ID_PERSPECTIVE = "chrome.xmdl.ui.XmdlModelingPerspective";

	/**
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID_PERSPECTIVE);

		String editorArea = layout.getEditorArea();

		IFolderLayout topLeft = layout.createFolder("topLeft",
				IPageLayout.LEFT, 0.25f, editorArea);
		topLeft.addView(IPageLayout.ID_RES_NAV);
		topLeft.addPlaceholder(JavaUI.ID_PACKAGES);

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT,
				(float) 0.66, editorArea);
		right.addView(IPageLayout.ID_OUTLINE);

		IFolderLayout bottonRight = layout.createFolder("bottonRight",
				IPageLayout.BOTTOM, (float) 0.60, "right");
		bottonRight.addView(IPageLayout.ID_PROP_SHEET);
		
		layout.setEditorAreaVisible(true);
	}

}
