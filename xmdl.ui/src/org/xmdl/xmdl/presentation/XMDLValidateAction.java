package org.xmdl.xmdl.presentation;

import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.xmdl.xmdl.ui.XMDLUIPlugin;


public class XMDLValidateAction extends ValidateAction {

    public XMDLValidateAction() {
        setText(XMDLUIPlugin.INSTANCE.getString("_UI_Validate_menu_item"));
        setDescription(XMDLUIPlugin.INSTANCE
                .getString("_UI_Validate_simple_description"));
    }

}
