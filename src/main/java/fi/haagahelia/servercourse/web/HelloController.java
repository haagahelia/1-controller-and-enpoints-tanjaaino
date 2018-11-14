package fi.haagahelia.servercourse.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/index")
	public String indexPage() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String contactPage() {
		return "This is the contact page";
	}
}
