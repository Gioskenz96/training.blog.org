package training.k2.service;

import training.k2.dao.Item;
import java.util.List;

public interface ItemService {
	
	List<Item> findAll();
	Item findID(int id);
	Item create(Item item);
	Item edit(Item item);
	void deleteById(int id);
	

}
