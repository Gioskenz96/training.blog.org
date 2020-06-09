package training.k2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import training.k2.dao.Item;
import training.k2.service.ItemService;
import training.k2.service.ItemServiceImpl;
import java.util.List;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/posts")
	public String posts(Model model) {
		List<Item> latestItem = itemService.findAll();
		model.addAttribute("latestItem", latestItem);
		return "posts";
	}
	
	@RequestMapping("/create")
	public String createItem(Item item) {
		itemService.create(item);
		return "create";
	}

	@RequestMapping("/edit/{id}")
	public String editItem(@PathVariable("id") Integer id, Model model, Item item) {
		item.setID(id);
		itemService.edit(item);
		model.addAttribute("item", item);
		return "edit";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteItem(@PathVariable("id") Integer id, Item item) {
		item.setID(id);
		itemService.deleteById(id);
		return "delete";
	}
	
	
	
		
	
	
}
