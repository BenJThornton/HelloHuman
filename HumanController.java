package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
public class HumanController {
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if (searchQuery == null) {
			searchQuery = "human";
		}
        return "Hello " + searchQuery;
	}
}
