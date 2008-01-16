package org.xmdl.xmdldb.init;

import org.xmdl.xmdl.init.*;

public class ConsiderField extends CompositeORAssertion {

	public ConsiderField(){
		addChild(new NegativeAssertion(new IsManyToOne()));
		addChild(new IsForeignKey());
	}	

}
