package com.grocerystore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroceryStoreController {

	/**
	 * Test
	 * @return
	 */
	@RequestMapping("/start")
	public String start() {
		return "start";
	}

}