package training.k2.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class ItemDAOImpl implements ItemDAO<Item>{
	
	private List<Item> itemList = new ArrayList<>();
	

	@Override
	public Optional<Item> get(int code) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(itemList.get(code));
	}

	@Override
	public Collection<Item> getAll() {
		// TODO Auto-generated method stub
		return itemList.stream()
		          .filter(Objects::nonNull)
		          .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
	}

	@Override
	public int save(Item t) {
		// TODO Auto-generated method stub
		itemList.add(t);
		int index = itemList.size()-1;
		t.setCode(index);
		return index;
	}

	@Override
	public void update(Item t) {
		// TODO Auto-generated method stub
		itemList.set(t.getCode(), t);
		
	}

	@Override
	public void delete(Item t) {
		// TODO Auto-generated method stub
		itemList.set(t.getCode(), null);
		
	}

}
