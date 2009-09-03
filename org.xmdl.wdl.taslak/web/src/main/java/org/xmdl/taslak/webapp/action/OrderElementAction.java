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
 * The action class for OrderElement
 */
public class OrderElementAction extends BaseAction implements Preparable {

	private OrderElementManager orderElementManager;

	private OrderManager orderManager;

	private Collection<OrderElement> orderElements;

	private OrderElement orderElement;

	private Long id;

	private Long idToCopy;

	private OrderElementSearch orderElementSearch = new OrderElementSearch();

	private Order order;

	private Long orderID;

	public void setOrderElementManager(OrderElementManager orderElementManager) {
		this.orderElementManager = orderElementManager;
	}

	public Collection<OrderElement> getOrderElements() {
		return orderElements;
	}

	public void prepare() {
		if (getRequest().getMethod().equalsIgnoreCase("post")) {
			// prevent failures on new
			if (id != null) {
				orderElement = orderElementManager.get((long) id);
			} else {
				orderElement = new OrderElement();
				if (orderID == null) {
					try {
						String parameter = getRequest().getParameter(
								"orderElement.order.id");
						orderID = Long.parseLong(parameter);
					} catch (NumberFormatException e) {
						log.info("no id");
					}
				}

				if (orderID != null) {
					order = orderManager.get(orderID);
					orderElementSearch.setOrder(order);
					orderElements = orderElementManager
							.search(orderElementSearch);
				} else {
					order = new Order();
				}
			}
		}

	}

	@SkipValidation
	public String list() {
		if (log.isDebugEnabled())
			log.debug("list() <-");

		orderElements = orderElementManager.search(orderElementSearch);

		if (log.isDebugEnabled())
			log.debug("listing items:" + orderElements == null
					? null
					: orderElements.size());
		if (log.isDebugEnabled())
			log.debug("list() ->");
		return SUCCESS;
	}

	@SkipValidation
	public String delete() {
		if (log.isDebugEnabled())
			log.debug("delete() <-");

		orderElementManager.remove(orderElement.getId());
		saveMessage(getText("orderElement.deleted"));

		if (log.isDebugEnabled())
			log.debug("deleting orderElement: " + orderElement);
		if (log.isDebugEnabled())
			log.debug("delete() ->");

		return SUCCESS;
	}

	public String copy() {
		if (log.isDebugEnabled())
			log.debug("copy() <-");

		if (idToCopy != null) {
			orderElement = orderElementManager.get(idToCopy);
		}

		orderElement.setId(null);

		if (log.isDebugEnabled())
			log.debug("copying orderElement: " + orderElement);
		if (log.isDebugEnabled())
			log.debug("copy() ->");

		return SUCCESS;
	}

	public String edit() {
		if (log.isDebugEnabled())
			log.debug("edit() <-");

		if (id != null) {
			orderElement = orderElementManager.get(id);
		} else {
			orderElement = new OrderElement();
		}

		if (log.isDebugEnabled())
			log.debug("editing orderElement: " + orderElement);
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
					orderElementManager.remove(new Long(idStr));
					anyDeleted = true;

					if (log.isDebugEnabled())
						log.debug("deleting orderElement with id: " + idStr);
				} catch (DataIntegrityViolationException e) {
					e.printStackTrace();
					cannotDeleted = true;

					if (log.isDebugEnabled())
						log.debug("could not delete orderElement with id: "
								+ idStr);
				}
			}
		}
		if (cannotDeleted)
			saveMessage(getText("OrderElement.cannotBeDeleted"));
		if (anyDeleted)
			saveMessage(getText("OrderElement.deleted"));

		orderElements = orderElementManager.search(orderElementSearch);

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

		boolean isNew = (orderElement.getId() == null);

		orderElementManager.save(orderElement);

		String key = (isNew) ? "orderElement.added" : "orderElement.updated";
		saveMessage(getText(key));

		String logMessage = (isNew)
				? "adding orderElement: " + orderElement
				: "updating orderElement: " + orderElement;
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

	public OrderElement getOrderElement() {
		return orderElement;
	}

	public void setOrderElement(OrderElement orderElement) {
		this.orderElement = orderElement;
	}

	public OrderElementSearch getOrderElementSearch() {
		return orderElementSearch;
	}

	public void setOrderElementSearch(OrderElementSearch orderElementSearch) {
		this.orderElementSearch = orderElementSearch;
	}

	public Long getIdToCopy() {
		return idToCopy;
	}

	public void setIdToCopy(Long idToCopy) {
		this.idToCopy = idToCopy;
	}

	public OrderElementManager getOrderElementManager() {
		return orderElementManager;
	}

	/*PROTECTED REGION ID(OrderElement.act.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
