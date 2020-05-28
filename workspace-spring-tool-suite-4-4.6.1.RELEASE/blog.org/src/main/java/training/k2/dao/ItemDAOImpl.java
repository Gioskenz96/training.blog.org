package training.k2.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("itemDAO")
public class ItemDAOImpl implements ItemDAO{

	@Override
	public Item getItem(int code) {
		// TODO Auto-generated method stub
		return getItem(code);
	}

	@Override
	public int saveItem(Item it) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Item> viewAllItems() {
		// TODO Auto-generated method stub
		return viewAllItems();
	}

	@Override
	public void update(Item it) {
		// TODO Auto-generated method stub
		update(it);
		
	}

	@Override
	public void delete(Item it) {
		// TODO Auto-generated method stub
		delete(it);
		
	}

}
