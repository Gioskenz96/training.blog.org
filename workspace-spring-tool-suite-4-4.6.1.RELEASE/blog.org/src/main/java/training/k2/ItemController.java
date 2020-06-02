package training.k2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/edit")
	public String editItem(Item item) {
		itemService.edit(item);
		return "edit";
	}
	
		
	
	
}
