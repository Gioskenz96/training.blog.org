package training.k2.dao;

import java.util.List;

public interface ItemDAO {
	
	Item getItem(int code);
	
	int saveItem(Item it);
	
	List<Item> viewAllItems();
	
	void update(Item it);
	void delete(Item it);

}
