package mycafecontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	
	@RequestMapping("/cafe")
	public String getOrder(Model model) {
		model.addAttribute("heading", "MY MOM'S CAFE");
		return "Order";
	}
	@RequestMapping("/processorder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		//handle the data received from the user
		String uservalue=request.getParameter("foodType");
		
		//adding the captured value to the model
		model.addAttribute("userinput", uservalue);
		
		return "process-order";
	}
	
}
