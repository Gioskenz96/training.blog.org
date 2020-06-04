package training.k2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import training.k2.dao.Item;


@Service
public class ItemServiceImpl implements ItemService {
	private List<Item> item = new ArrayList<Item>() {{
		add(new Item("Titolo", "Prova Articolo", 1));
		add(new Item("Titolo2", "Prova Articolo2", 2));
	}};
	
	public List<Item> Item(){
		return item;
	}
	
	@Override
	public List<Item> findAll(){
		return this.item;
	}
	
	@Override
	public Item findID(int id) {
		return this.item.stream()
                .filter(p -> Objects.equals(p.getID(), id))
                .findFirst()
                .orElse(null);
	}
	
	@Override
	public Item create(Item item) {
		item.setID(this.item.stream().mapToInt(
                p -> p.getID()).max().getAsInt() + 1);
        this.item.add(item);
        return item;
	}
	
	@Override
	public Item edit(Item item) {
		for (int i = 0; i < this.item.size(); i++) {
			if (Objects.equals(this.item.get(i).getID(), item.getID())) {
				this.item.set(i, item);
				return item;
			}
		}
		throw new RuntimeException("Articolo non trovato: "+ item.getID());
	}
	
	@Override
	public void deleteById(int id) {
		for (int i = 0; i < this.item.size(); i++) {
            if (Objects.equals(this.item.get(i).getID(), id)) {
                this.item.remove(i);
                return;
            }
        }
        throw new RuntimeException("Articolo non trovato: " + id);
	}

}
