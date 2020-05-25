package training.k2.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import training.k2.dao.Item;
import training.k2.dao.ItemDAO;

@Component(value = "itemService")
public class ItemService {
	
	@Autowired
	private ItemDAO<Item> itemDAO;
	private Item item = new Item();
	
	public void save() {
		itemDAO.save(item);
		item = new Item();
	}
	
	public Collection<Item> getAllItems(){
		return itemDAO.getAll();
	}
	
	public int saveItem(Item item) {
		validate(item);
		return itemDAO.save(item);
	}
	
	private void validate(Item item) {
		//
	}
	
	public Item getItem() {
		return item;
	}

}
