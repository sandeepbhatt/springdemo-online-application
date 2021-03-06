
package com.mycompany.sos.service;

import com.mycompany.sos.model.Item;

import java.util.List;

/**
 * {@link ItemService} interface
 *
 * @author Sandeep Bhatt
 */
public interface ItemService {

	/**
	 * Adds a new item
	 *
	 * @param item the new item to add
	 * @return true if successfully added false otherwise
	 */
	boolean addItem(Item item);

	/**
	 * Retrieves a list of items
	 *
	 * @return list of items
	 */
	List<Item> getItems();
}
