package chrome.xmdl.xgen;


public class GenerationTask {
	private Template template;
	private Object source;

	

	
	public GenerationTask(Object source, Template template) {
		super();
		this.source = source;
		this.template = template;
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}


}
