package org.xmdl.gen.util;


import java.util.List;

import org.xmdl.gen.util.MasterChildHelper;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;

import junit.framework.TestCase;

public class MasterChildHelperTest extends TestCase {

	/*
	 * Test method for 'org.xmdl.gen.util.MasterChildHelper.isChild(XClass)'
	 */
	public void testIsChild() {
		XProject project = ResourceHelper.loadProject("testsrc/test.xmdl");
		for ( int i=0;i<project.getPackages().size();i++ ){
			XPackage packet=(XPackage) project.getPackages().get(i);
			for ( int j=0 ; j<packet.getClasses().size();j++){
				XClass clss=(XClass) packet.getClasses().get(j);
				
				if(clss.getName().equals("Customer")){
					assertFalse(MasterChildHelper.INST.isChild(clss));
				}else if(clss.getName().equals("Location")){
					assertFalse(MasterChildHelper.INST.isChild(clss));
				}else if(clss.getName().equals("Many")){
					assertTrue(MasterChildHelper.INST.isChild(clss));
				}else if(clss.getName().equals("Many2")){
					assertTrue(MasterChildHelper.INST.isChild(clss));
				} 
			}
		}
	}

	/*
	 * Test method for 'org.xmdl.gen.util.MasterChildHelper.isParent(XClass)'
	 */
	public void testIsMaster() {
		XProject project = ResourceHelper.loadProject("testsrc/test.xmdl");
		for ( int i=0;i<project.getPackages().size();i++ ){
			XPackage packet=(XPackage) project.getPackages().get(i);
			for ( int j=0 ; j<packet.getClasses().size();j++){
				XClass clss=(XClass) packet.getClasses().get(j);
				
				if(clss.getName().equals("Customer")){
					assertTrue(MasterChildHelper.INST.isMaster(clss));
				}else if(clss.getName().equals("Location")){
					assertTrue(MasterChildHelper.INST.isMaster(clss));
				}else if(clss.getName().equals("Many")){
					assertFalse(MasterChildHelper.INST.isMaster (clss));
				}else if(clss.getName().equals("Many2")){
					assertFalse(MasterChildHelper.INST.isMaster(clss));
				} 
			}
		}
	}

	/*
	 * Test method for 'org.xmdl.gen.util.MasterChildHelper.getParent(XClass)'
	 */
	public void testGetParent() {
		XProject project = ResourceHelper.loadProject("testsrc/test.xmdl");
		for ( int i=0;i<project.getPackages().size();i++ ){
			XPackage packet=(XPackage) project.getPackages().get(i);
			for ( int j=0 ; j<packet.getClasses().size();j++){
				XClass clss=(XClass) packet.getClasses().get(j);
				XClass parent=MasterChildHelper.INST.getMaster(clss);
				
				if(clss.getName().equals("Customer")){
					assertNull(parent);
				}else if(clss.getName().equals("Location")){
					assertNull(parent);
				}else if(clss.getName().equals("Many")){
					assertEquals(parent,(XClass)packet.getClasses().get(0));
				}else if(clss.getName().equals("Many2")){
					assertEquals(parent,(XClass)packet.getClasses().get(0));
				} 
			}
		}

	}

	/*
	 * Test method for 'org.xmdl.gen.util.MasterChildHelper.getChildren(XClass)'
	 */
	public void testGetChildren() {
		XProject project = ResourceHelper.loadProject("testsrc/test.xmdl");
		for ( int i=0;i<project.getPackages().size();i++ ){
			XPackage packet=(XPackage) project.getPackages().get(i);
			for ( int j=0 ; j<packet.getClasses().size();j++){
				XClass clss=(XClass) packet.getClasses().get(j);
				List<XClass> list=MasterChildHelper.INST.getChildren(clss);
				
				if(clss.getName().equals("Customer")){
					assertEquals(2,list.size());
					XClass firstChild=list.get(0);
					XClass secondChild=list.get(1);
					assertEquals(firstChild,packet.getClasses().get(2));
					assertEquals(secondChild,packet.getClasses().get(3));
				}else if(clss.getName().equals("Location")){
					assertEquals(list.size(),0);
				}else if(clss.getName().equals("Many")){
					assertEquals(list.size(),0);
				}else if(clss.getName().equals("Many2")){
					assertEquals(list.size(),0);
				} 
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void testIsChildForAttribute(){
		
		XProject project = ResourceHelper.loadProject("testsrc/test.xmdl");
		for ( int i=0;i<project.getPackages().size();i++ ){
			XPackage packet=(XPackage) project.getPackages().get(i);
			for ( int j=0 ; j<packet.getClasses().size();j++){
				XClass clss=(XClass) packet.getClasses().get(j);
				
				if(clss.getName().equals("Customer")){
					List<XAttribute> atts= (List<XAttribute>)(clss.getAttributes());
					assertFalse(MasterChildHelper.INST.isChild(atts.get(0)));
					assertFalse(MasterChildHelper.INST.isChild(atts.get(1)));
					assertTrue(MasterChildHelper.INST.isChild(atts.get(2)));
					assertTrue(MasterChildHelper.INST.isChild(atts.get(3)));
					break;
				} 
			}
		}
	}

}
