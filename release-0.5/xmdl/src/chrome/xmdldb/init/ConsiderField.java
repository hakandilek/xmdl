package chrome.xmdldb.init;

import chrome.xmdl.init.*;

public class ConsiderField extends CompositeORAssertion {

	public ConsiderField(){
		addChild(new NegativeAssertion(new IsManyToOne()));
		addChild(new IsForeignKey());
	}	

}
