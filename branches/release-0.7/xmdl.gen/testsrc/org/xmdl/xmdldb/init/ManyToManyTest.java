package org.xmdl.xmdldb.init;

import java.io.IOException;
import java.util.List;

import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdldb.DModel;
import org.xmdl.xmdldb.DPackage;
import org.xmdl.xmdldb.DTable;


public class ManyToManyTest extends AbstractTestCase {


	public void testRelationTable() throws IOException {
		DModel dModel = ResourceHelper.loadDModel("testsrc/test.xmdldb");
		DPackage pack = (DPackage) dModel.getDPackages().get(0);

		DTable relationTable = null;
		List<DTable> tables = pack.getDTables();
		for (DTable table : tables) {
			String name = table.getName();
			if (name.startsWith("TBL_CUSTOMER")
					&& !name.equalsIgnoreCase("TBL_CUSTOMER")
					|| name.startsWith("TBL_LOCATION")
					&& !name.equalsIgnoreCase("TBL_LOCATION")) {
				relationTable = table;
				continue;
			}
		}

		assertNotNull(relationTable);
		assertEquals(2, relationTable.getDFields().size());
	}

	public void testReRun() throws IOException {
		DModel dModel = ResourceHelper.loadDModel("testsrc/test.xmdldb");
		DPackage pack = (DPackage) dModel.getDPackages().get(0);

		DTable relationTable = null;
		List<DTable> tables = pack.getDTables();
		for (DTable table : tables) {
			String name = table.getName();
			if (name.startsWith("TBL_CUSTOMER")
					&& !name.equalsIgnoreCase("TBL_CUSTOMER")
					|| name.startsWith("TBL_LOCATION")
					&& !name.equalsIgnoreCase("TBL_LOCATION")) {
				relationTable = table;
				continue;
			}
		}

		assertNotNull(relationTable);
		assertEquals(2, relationTable.getDFields().size());
	}

}
