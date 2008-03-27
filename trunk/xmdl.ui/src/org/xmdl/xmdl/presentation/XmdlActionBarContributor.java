/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlActionBarContributor.java,v 1.27 2006/04/26 07:44:43 tr001\tr1a3571 Exp $
 */
package org.xmdl.xmdl.presentation;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.xmdl.gen.mark.MarkElement;
import org.xmdl.gen.mark.PlatformElement;
import org.xmdl.gen.mark.PlatformMarkRegistry;
import org.xmdl.gen.mark.PlatformMarkingListener;
import org.xmdl.gen.util.MetadataHelper;
import org.xmdl.meta.MetaModelHolder;
import org.xmdl.xgen.AssociationManager;
import org.xmdl.xgen.Generator;
import org.xmdl.xgen.Platform;
import org.xmdl.xmdl.XBase;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.ui.Platforms;
import org.xmdl.xmdl.ui.XMDLUIPlugin;

/**
 * This is the action bar contributor for the Xmdl model editor. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XmdlActionBarContributor extends EditingDomainActionBarContributor
		implements ISelectionChangedListener {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	private static final Logger LOGGER = Logger
			.getLogger(XmdlActionBarContributor.class);

	/**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected IAction showPropertiesViewAction = new Action(
			XMDLUIPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
		@Override
		public void run() {
			try {
				getPage().showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException exception) {
				XMDLUIPlugin.INSTANCE.log(exception);
			}
		}
	};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction refreshViewerAction = new Action(XMDLUIPlugin.INSTANCE
			.getString("_UI_RefreshViewer_menu_item")) {
		@Override
		public boolean isEnabled() {
			return activeEditorPart instanceof IViewerProvider;
		}

		@Override
		public void run() {
			if (activeEditorPart instanceof IViewerProvider) {
				Viewer viewer = ((IViewerProvider) activeEditorPart)
						.getViewer();
				if (viewer != null) {
					viewer.refresh();
				}
			}
		}
	};

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createChildActions;

	/**
	 * This will contain one
	 * {@link org.xmdl.xmdl.presentation.XmdlActionBarContributor.GenerateAction} corresponding to
	 * each descriptor generated for the current selection by the item provider.
	 * 
	 */
	protected Collection<IAction> generateActions;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateChild actions. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createSiblingActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createSiblingMenuManager;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for Generate actions.
	 * @author hd
	 */
	protected IMenuManager generateMenuManager;

	// private GenerateAction generateAction;

	private InitializeAction initializeAction;

	private XMDLValidateAction xmdlValidateAction;

	/**
	 * This creates an instance of the contributor. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public XmdlActionBarContributor() {

		LOGGER.debug(" new instance");
		// init();
		loadResourceAction = new LoadResourceAction();
		validateAction = null;
		xmdlValidateAction = new XMDLValidateAction();
		// generateAction = new GenerateAction();
		// generateAction = new GenerateAction();
		initializeAction = new InitializeAction();
	}

	public abstract class ProjectAction extends Action {
		protected XProject getProject(EObject selected) {
			MetadataHelper helper = new MetadataHelper();
			return helper.getProject(selected);
		}

		public void run() {
			final XmdlEditor editor = (XmdlEditor) activeEditorPart;

			IRunnableWithProgress operation = createOperation(editor);
			// Do the work within an operation.
			try {
				new ProgressMonitorDialog(editor.getSite().getShell()).run(
						true, false, operation);
			} catch (Exception exception) {
				LOGGER.warn("fault ", exception);
			}
		}

		protected Generator createGenerator(XmdlEditor editor,
				IProgressMonitor progressMonitor) {

			IStructuredSelection ss = (IStructuredSelection) editor
					.getSelection();
			final EObject selected = (EObject) ss.getFirstElement();
			LOGGER.debug("selected object :" + selected);

			XProject project = getProject(selected);

			LOGGER.debug("project = " + project);

			Generator generator = new Generator(project);
			generator.addListener(new ProgressListener(progressMonitor));
			generator.addListener(new PlatformMarkingListener());
			generator.addListener(AssociationManager.getInstance());
			return generator;
		}

		protected abstract IRunnableWithProgress createOperation(
				XmdlEditor editor);
	}

	public class InitializeAction extends ProjectAction {
		public InitializeAction() {
			setText(XMDLUIPlugin.INSTANCE
					.getString("_UI_XMDL_OnlyInit_menu_item"));
		}

		protected IRunnableWithProgress createOperation(final XmdlEditor editor) {
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				protected void execute(IProgressMonitor progressMonitor)
						throws CoreException {
					Generator generator = createGenerator(editor,
							progressMonitor);
					XProject project = generator.getProject();
					MetaModelHolder.initialize(project);
				}
			};
			return operation;
		}

	}

	public class GenerateAction extends ProjectAction {

		private final Platform platform;

		public GenerateAction(Platform platform) {
			super();
			this.platform = platform;
			// setText(XMDLUIPlugin.INSTANCE
			// .getString("_UI_XMDL_InitAndGenerate_menu_item"));
		}

		protected IRunnableWithProgress createOperation(final XmdlEditor editor) {
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				protected void execute(IProgressMonitor progressMonitor)
						throws CoreException {
					Generator generator = createGenerator(editor,
							progressMonitor);
					generator.generate(platform);
				}
			};
			return operation;
		}

	}

	/**
	 * This adds Separators for editor additions to the tool bar. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("xmdl-settings"));
		toolBarManager.add(new Separator("xmdl-additions"));
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor
	 * additions, as well as the sub-menus for object creation items. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(XMDLUIPlugin.INSTANCE
				.getString("_UI_XmdlEditor_menu"), "org.xmdl.xmdl.xmdlMenuID");
		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(XMDLUIPlugin.INSTANCE
				.getString("_UI_CreateChild_menu_item"));
		submenuManager.insertBefore("additions", createChildMenuManager);

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(XMDLUIPlugin.INSTANCE
				.getString("_UI_CreateSibling_menu_item"));
		submenuManager.insertBefore("additions", createSiblingMenuManager);

		generateMenuManager = new MenuManager(XMDLUIPlugin.INSTANCE
				.getString("_UI_Generate_menu_item"));
		submenuManager.insertBefore("additions", generateMenuManager);

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager menuManager) {
				menuManager.updateAll(true);
			}
		});

		addGlobalActions(submenuManager);
	}

	/**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		} else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider,
						selectionProvider.getSelection()));
			}
		}
	}

	/**
	 * This implements
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}, handling
	 * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for
	 * the children and siblings that can be added to the selected object and
	 * updating the menus accordingly. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			depopulateManager(createSiblingMenuManager, createSiblingActions);
		}

		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection
				&& ((IStructuredSelection) selection).size() == 1) {
			Object object = ((IStructuredSelection) selection)
					.getFirstElement();

			EditingDomain domain = ((IEditingDomainProvider) activeEditorPart)
					.getEditingDomain();

			newChildDescriptors = domain.getNewChildDescriptors(object, null);
			newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(newChildDescriptors,
				selection);
		createSiblingActions = generateCreateSiblingActions(
				newSiblingDescriptors, selection);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingActions,
					null);
			createSiblingMenuManager.update(true);
		}
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
	 * for each object in <code>descriptors</code>, and returns the
	 * collection of these actions. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected Collection<IAction> generateCreateChildActions(
			Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(activeEditorPart, selection,
						descriptor));
			}
		}
		return actions;
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateSiblingActions(
			Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(activeEditorPart,
						selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void populateManager(IContributionManager manager,
			Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
	}

	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager,
			Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem)
							.getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem)
							.getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(XMDLUIPlugin.INSTANCE
				.getString("_UI_CreateChild_menu_item"));
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("additions", submenuManager);

		MenuManager generateSubmenuManager = new MenuManager(
				XMDLUIPlugin.INSTANCE.getString("_UI_Generate_menu_item"));
		populateManager(generateSubmenuManager, generateActions, null);
		menuManager.insertBefore("additions", generateSubmenuManager);

		ISelection s = ((XmdlEditor) activeEditorPart).getSelection();
		if ((s instanceof IStructuredSelection)) {
			IStructuredSelection ss = (IStructuredSelection) s;
			if (ss.size() == 1) {
				Object selected = ss.getFirstElement();
				// menuManager.insertAfter("additions", generateXMDLAction);

				if (selected instanceof XBase) {
					XBase selElement = (XBase) selected;
					menuManager.insertBefore("additions", initializeAction);
					initializeAction.setEnabled(initializeAction.isEnabled());

					//determine platformID
					PlatformMarkRegistry registry = PlatformMarkRegistry
							.getInstance();
					String platformID = null;
					final MarkElement platformMark = registry
							.getMarkFor(selElement);
					if (platformMark != null) {
						final PlatformElement p = platformMark.getPlatform();
						platformID = p == null ? null : p.getId();
					}
					if (LOGGER.isDebugEnabled())
						LOGGER.debug("platformID=" + platformID);

					Platform markPlatform = null;
					Collection<Platform> platforms = Platforms.INST.values();
					if (platformID != null) {
						for (Platform platform : platforms) {
							String id = platform.id();
							if (platformID.equals(id)) {
								markPlatform = platform;
								addGenerateActionFor(platform, generateSubmenuManager, true);
								break;
							}
						}
					}
					
					for (Platform platform : platforms) {
						if (platform.equals(markPlatform))
							continue;
						//determine dimming
						boolean enabled = true;
						if (markPlatform != null) {
							enabled = false;
						}
						
						addGenerateActionFor(platform, generateSubmenuManager, enabled);
					}
				}
			}
		}

		if (xmdlValidateAction != null) {
			menuManager.insertBefore("additions", new ActionContributionItem(
					xmdlValidateAction));
		}
	}

	private void addGenerateActionFor(Platform platform,
			MenuManager menuManager, boolean enabled) {
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("Adding platform(" + enabled + "): " + platform);

		IAction generateAction = new GenerateAction(platform);
		generateAction.setEnabled(enabled);
		generateAction.setText(platform.name() + " " + platform.version());
		menuManager.add(generateAction);
		generateAction.setEnabled(generateAction.isEnabled());
	}

	@Override
	public void activate() {
		super.activate();

		if (xmdlValidateAction != null) {
			xmdlValidateAction.setActiveWorkbenchPart(activeEditor);
		}

		ISelectionProvider selectionProvider = activeEditor instanceof ISelectionProvider ? (ISelectionProvider) activeEditor
				: activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null) {
			if (xmdlValidateAction != null) {
				selectionProvider
						.addSelectionChangedListener(xmdlValidateAction);
			}
		}
	}

	@Override
	public void deactivate() {
		super.deactivate();
		if (xmdlValidateAction != null) {
			xmdlValidateAction.setActiveWorkbenchPart(null);
		}

		ISelectionProvider selectionProvider = activeEditor instanceof ISelectionProvider ? (ISelectionProvider) activeEditor
				: activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null) {
			if (xmdlValidateAction != null) {
				selectionProvider
						.removeSelectionChangedListener(xmdlValidateAction);
			}
		}

	}

	@Override
	public void update() {
		super.update();

		ISelectionProvider selectionProvider = activeEditor instanceof ISelectionProvider ? (ISelectionProvider) activeEditor
				: activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null) {
			ISelection selection = selectionProvider.getSelection();
			IStructuredSelection structuredSelection = selection instanceof IStructuredSelection ? (IStructuredSelection) selection
					: StructuredSelection.EMPTY;

			if (xmdlValidateAction != null) {
				xmdlValidateAction.updateSelection(structuredSelection);
			}
		}
	}

	/**
	 * This inserts global actions before the "additions-end" separator. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());
		menuManager.insertAfter("ui-actions", refreshViewerAction);

		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

}
