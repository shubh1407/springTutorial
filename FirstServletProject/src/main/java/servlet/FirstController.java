package servlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FirstController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView getFirstPage() {
		return new ModelAndView("first");
	}
}
