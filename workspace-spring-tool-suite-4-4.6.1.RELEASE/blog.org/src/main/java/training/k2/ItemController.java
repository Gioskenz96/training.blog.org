package training.k2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import training.k2.dao.Item;
import training.k2.service.ItemService;
import training.k2.service.ItemServiceImpl;
import java.util.List;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@Autowired
	private ItemServiceImpl item;
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
	public String showItemEditForm(@PathVariable("id") Integer id, Model model) {
		Item item = new Item();
		itemService.findID(item.getID());
		itemService.edit(item);
		model.addAttribute("item", item);
		return "edit";
	}
	
		
	
	
}
