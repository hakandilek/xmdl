package org.xmdl.xgen;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XProject;


public interface TaskFactory {
	
	/**
	 * Creates tasks before generation
	 * @param project the project
	 * @param list list of model root oblects
	 * @return list of tasks
	 */
	List<Task> createPredecessorTasks(XProject project, List<EObject> list);

	/**
	 * Creates generation tasks
	 * @param project the project
	 * @param list list of model root oblects
	 * @return list of tasks
	 */
	List<GenerationTask> createTasks(XProject project, List<EObject> list);

	/**
	 * Creates tasks that will be run after generation
	 * @param project the project
	 * @param list list of model root oblects
	 * @return list of tasks
	 */
	List<Task> createSuccessorTasks(XProject project, List<EObject> list);

}
