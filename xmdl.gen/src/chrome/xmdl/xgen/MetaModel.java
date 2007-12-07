package chrome.xmdl.xgen;

import chrome.xmdl.XModel;
import chrome.xmdl.XmdlFactory;
import chrome.xmdlbo.XmdlboFactory;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdlgen.XmdlgenFactory;

public enum MetaModel {

    XMDL(new ModelFactory() {
        @Override
        public XModel create() {
            return XmdlFactory.eINSTANCE.createXMDLModel();
        }
    }),

    XMDL_GEN(new ModelFactory() {
        @Override
        public XModel create() {
            return XmdlgenFactory.eINSTANCE.createXMDLGenModel();
        }
    }),

    XMDL_DB(new ModelFactory() {
        @Override
        public XModel create() {
            return XmdldbFactory.eINSTANCE.createXMDLDBModel();
        }
    }),

    XMDL_BO(new ModelFactory() {
        @Override
        public XModel create() {
            return XmdlboFactory.eINSTANCE.createXMDLBOModel();
        }
    }),

    ;

    private final ModelFactory factory;

    private MetaModel(ModelFactory factory) {
        this.factory = factory;
    }

    public XModel createInstance() {
        return factory.create();
    }

    private interface ModelFactory {
        XModel create();
    }
}
