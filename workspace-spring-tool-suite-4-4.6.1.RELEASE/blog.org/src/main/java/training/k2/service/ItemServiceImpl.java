package training.k2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import training.k2.dao.Item;
import training.k2.dao.ItemDAO;

public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemDAO itemDAO;

	@Override
	public Item getItem(int code) {
		// TODO Auto-generated method stub
		return itemDAO.getItem(code);
	}

	@Override
	public int saveItem(Item it) {
		// TODO Auto-generated method stub
		return itemDAO.saveItem(it);
	}

	@Override
	public List<Item> viewAllItems() {
		// TODO Auto-generated method stub
		return itemDAO.viewAllItems();
	}

	@Override
	public void update(int code, Item it) {
		// TODO Auto-generated method stub
		Item itm = itemDAO.getItem(code);
		if(itm != null) {
			itemDAO.update(itm);
		}
	}
		
	@Override
	public void delete(int code) {
		// TODO Auto-generated method stub
		Item itm = itemDAO.getItem(code);
		if(itm != null) {
			itemDAO.delete(itm);
		}
		
	}


}
