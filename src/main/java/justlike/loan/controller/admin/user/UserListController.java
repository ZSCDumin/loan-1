package justlike.loan.controller.admin.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import justlike.loan.controller.BaseController;
import justlike.loan.model.User;
import justlike.loan.service.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserListController extends BaseController{
	@Autowired
	private UserService userService;

	@RequestMapping(value="/list",method={RequestMethod.GET,RequestMethod.POST})
	public String list(HttpServletRequest request ,Model model) {	
		Map<String, Object> param = this.queryPageParamInit(request,model,userService.count());
		List<User> entitys = userService.queryPageList(param);
		model.addAttribute("entitys", entitys);
		return "admin/user/userList";
	}		
}
