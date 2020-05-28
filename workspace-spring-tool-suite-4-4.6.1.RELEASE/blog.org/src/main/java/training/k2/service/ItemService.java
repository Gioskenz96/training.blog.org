package training.k2.service;

import java.util.List;

import training.k2.dao.Item;

public interface ItemService {
	
	Item getItem(int code);
	
	int saveItem(Item it);
	
	List<Item> viewAllItems();
	
	void update(int code, Item it);
	void delete(int code);

}
