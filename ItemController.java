package training.k2;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import training.k2.dao.Item;
import training.k2.service.ItemService;
*/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class ItemController {
	
	/*@Autowired
	ItemService itemService;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveItem(Model model, Item item) {
		System.out.println("Title"+ item.getTitle());
		System.out.println("Content"+ item.getContent());
		System.out.println("ReleaseData"+ item.getReleaseData());
		System.out.println("Code"+ item.getCode());
		
		return "newItem";
	}
*/
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
