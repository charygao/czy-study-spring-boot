package org.czy.com.jsp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {


	// jsp案例
	// http://localhost:8080/czy/jsp
	@RequestMapping(value = "/jsp")
	public String welcome() {
		return "index";
	}



}
