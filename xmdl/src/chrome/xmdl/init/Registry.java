package chrome.xmdl.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

class Registry implements Task {
	private final static Logger LOGGER = Logger.getLogger(Registry.class);
	
	private Map<Class<?>, List<Task>> tasks = new HashMap<Class<?>, List<Task>>();

	public void removeTask(Class<?> clazz, Task task) {
		List<Task> list = tasks.get(clazz);
		if (list != null){
			list.remove(task);
		}
		tasks.remove(task);
	}

	public void addTask(Class<?> clazz, Task task) {
		List<Task> list = tasks.get(clazz);
		if (list == null){
			list = new ArrayList<Task>();
		}
		list.add(task);
		tasks.put(clazz, list);
	}

	public void initialize(Object source, Object destination) {
		LOGGER.debug("source = " + source);
		LOGGER.debug("destination = " + destination);
		if (source != null){
			Class<?> cls = source.getClass();
			LOGGER.debug("cls = " + cls);
			Set<Class<?>> superTypes = getClasses(cls);
			for (Class<?> superType : superTypes) {			
				List<Task> list = tasks.get(superType);
				if (list != null && list.size() > 0) {
					for (Task task : list) {
						task.initialize(source, destination);
					}
				}						
			}			
		}
	}

	protected Set<Class<?>> getClasses(Class<?> cls) {
		Set<Class<?>> set = new HashSet<Class<?>>();
		Class<?>[] ifcs = cls.getInterfaces();
		for (int i = 0; i < ifcs.length; i++) {
			Class<?> class1 = ifcs[i];
			set.add(class1);
		}
		
		Class<?> superCls = cls.getSuperclass();
		if (superCls != null){
			Set<Class<?>> superSet = getClasses(superCls);
			set.addAll(superSet);
		}
		return set;
	}

}
