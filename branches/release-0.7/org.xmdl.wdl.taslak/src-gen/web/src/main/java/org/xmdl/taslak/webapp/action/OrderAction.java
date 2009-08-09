package org.xmdl.taslak.webapp.action;

import org.xmdl.taslak.service.*;
import org.xmdl.taslak.model.*;
import org.xmdl.taslak.model.search.*;
import java.util.*;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.dao.DataIntegrityViolationException;
import org.xmdl.ida.lib.web.action.BaseAction;
import com.opensymphony.xwork2.Preparable;

/**
 * The action class for Order
 */
public class OrderAction extends BaseAction implements Preparable {

	private OrderManager orderManager;

	private Collection<Order> orders;

	private Order order;

	private Long id;

	private Long idToCopy;

	private OrderSearch orderSearch = new OrderSearch();

	public void setOrderManager(OrderManager orderManager) {
		this.orderManager = orderManager;
	}

	public Collection<Order> getOrders() {
		return orders;
	}

	public void prepare() {
		if (getRequest().getMethod().equalsIgnoreCase("post")) {
			// prevent failures on new
			if (id != null) {
				order = orderManager.get((long) id);
			} else {
				order = new Order();
			}
		}

	}

	@SkipValidation
	public String list() {
		if (log.isDebugEnabled())
			log.debug("list() <-");

		orders = orderManager.search(orderSearch);

		if (log.isDebugEnabled())
			log.debug("listing items:" + orders == null ? null : orders.size());
		if (log.isDebugEnabled())
			log.debug("list() ->");
		return SUCCESS;
	}

	@SkipValidation
	public String delete() {
		if (log.isDebugEnabled())
			log.debug("delete() <-");

		orderManager.remove(order.getId());
		saveMessage(getText("order.deleted"));

		if (log.isDebugEnabled())
			log.debug("deleting order: " + order);
		if (log.isDebugEnabled())
			log.debug("delete() ->");

		return SUCCESS;
	}

	public String copy() {
		if (log.isDebugEnabled())
			log.debug("copy() <-");

		if (idToCopy != null) {
			order = orderManager.get(idToCopy);
		}

		order.setId(null);

		if (log.isDebugEnabled())
			log.debug("copying order: " + order);
		if (log.isDebugEnabled())
			log.debug("copy() ->");

		return SUCCESS;
	}

	public String edit() {
		if (log.isDebugEnabled())
			log.debug("edit() <-");

		if (id != null) {
			order = orderManager.get(id);
		} else {
			order = new Order();
		}

		if (log.isDebugEnabled())
			log.debug("editing order: " + order);
		if (log.isDebugEnabled())
			log.debug("edit() ->");

		return SUCCESS;
	}

	@SkipValidation
	public String deleteMass() throws Exception {
		if (log.isDebugEnabled())
			log.debug("deleteMass() <-");

		boolean cannotDeleted = false;
		boolean anyDeleted = false;
		if (getDeleteId() != null) {
			for (String idStr : getDeleteId()) {
				try {
					orderManager.remove(new Long(idStr));
					anyDeleted = true;

					if (log.isDebugEnabled())
						log.debug("deleting order with id: " + idStr);
				} catch (DataIntegrityViolationException e) {
					e.printStackTrace();
					cannotDeleted = true;

					if (log.isDebugEnabled())
						log.debug("could not delete order with id: " + idStr);
				}
			}
		}
		if (cannotDeleted)
			saveMessage(getText("Order.cannotBeDeleted"));
		if (anyDeleted)
			saveMessage(getText("Order.deleted"));

		orders = orderManager.search(orderSearch);

		if (log.isDebugEnabled())
			log.debug("deleteMass() ->");

		return SUCCESS;
	}

	public String save() throws Exception {
		if (log.isDebugEnabled())
			log.debug("save() <-");

		if (cancel != null) {
			if (log.isDebugEnabled())
				log.debug("save() ->");
			return "cancel";
		}

		if (delete != null) {
			if (log.isDebugEnabled())
				log.debug("save() ->");
			return delete();
		}

		boolean isNew = (order.getId() == null);

		orderManager.save(order);

		String key = (isNew) ? "order.added" : "order.updated";
		saveMessage(getText(key));

		String logMessage = (isNew)
				? "adding order: " + order
				: "updating order: " + order;
		if (log.isDebugEnabled())
			log.debug(logMessage);
		if (log.isDebugEnabled())
			log.debug("save() ->");

		if (!isNew) {
			return INPUT;
		} else {
			return SUCCESS;
		}
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderSearch getOrderSearch() {
		return orderSearch;
	}

	public void setOrderSearch(OrderSearch orderSearch) {
		this.orderSearch = orderSearch;
	}

	public Long getIdToCopy() {
		return idToCopy;
	}

	public void setIdToCopy(Long idToCopy) {
		this.idToCopy = idToCopy;
	}

	public OrderManager getOrderManager() {
		return orderManager;
	}

}