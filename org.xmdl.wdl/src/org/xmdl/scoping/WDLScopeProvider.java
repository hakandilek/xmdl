/*
 * generated by Xtext
 */
package org.xmdl.scoping;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopedElement;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.ScopedElement;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Entity;
import org.xmdl.wdl.Query;
import org.xmdl.wdl.QueryFilter;
import org.xmdl.wdl.QueryOrder;
import org.xmdl.wdl.QueryParameter;
import org.xmdl.wdl.Type;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class WDLScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_QueryFilter_entity(QueryFilter qf, EReference ref) {
		Query q = (Query) qf.eContainer();
		List<Entity> entities = q.getEntities();
		IScope scope = entityScope(entities);
		return scope;
	}

	public IScope scope_QueryFilter_attribute(QueryFilter qf, EReference ref) {
		Entity entity = qf.getEntity();
		Query query = (Query) qf.eContainer();
		return entityScope(entity, query);
	}

	public IScope scope_QueryOrder_entity(QueryOrder qo, EReference ref) {
		Query q = (Query) qo.eContainer();
		List<Entity> entities = q.getEntities();
		IScope scope = entityScope(entities);
		return scope;
	}

	public IScope scope_QueryOrder_attribute(QueryOrder qo, EReference ref) {
		Entity entity = qo.getEntity();
		Query query = (Query) qo.eContainer();
		return entityScope(entity, query);
	}

	public IScope scope_QueryFilter_value(QueryFilter qf, EReference ref) {
		Query query = (Query) qf.eContainer();
		List<QueryParameter> parameters = query.getParameters();
		Attribute attribute = qf.getAttribute();
		if (attribute != null) {
			Type type = attribute.getType();
			List<QueryParameter> list = new ArrayList<QueryParameter>();
			for (QueryParameter parameter : parameters) {
				if (type.equals(parameter.getType())) {
					list.add(parameter);
				}
			}
			return listScope(list);
		} else {
			return listScope(parameters);
		}
	}

	private IScope entityScope(Entity entity, Query q) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		if (entity != null) {
			attributes.addAll(entity.getAttributes());
		} else {
			List<Entity> entities = q.getEntities();
			for (Entity ent : entities) {
				attributes.addAll(ent.getAttributes());
			}
		}
		IScope scope = attributeScope(attributes);
		return scope;
	}

	private <T extends EObject> IScope listScope(List<T> list) {
		int size = list.size();
		List<IScopedElement> l = new ArrayList<IScopedElement>(size);
		for (T e : list) {
			String name = e.toString();
			try {
				Method method = e.getClass().getMethod("getName",
						new Class<?>[] {});
				Object o = method.invoke(e, new Object[] {});
				name = o.toString();
			} catch (Exception e1) {
				// just ignore
			}
			l.add(ScopedElement.create(name, e));
		}
		SimpleScope scope = new SimpleScope(l);
		return scope;
	}

	private IScope attributeScope(List<Attribute> attributes) {
		return listScope(attributes);
	}

	private IScope entityScope(List<Entity> entities) {
		return listScope(entities);
	}
}
