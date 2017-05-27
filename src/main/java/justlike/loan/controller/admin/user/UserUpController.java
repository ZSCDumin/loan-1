package justlike.loan.controller.admin.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import justlike.loan.controller.BaseController;
import justlike.loan.model.User;
import justlike.loan.service.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserUpController extends BaseController{
	@Autowired
	private UserService userService;

	@RequestMapping("/up")
	public String index(HttpSession session) {
		return "admin/user/userUp";
	}
	
	/*
	 新增客户
	 */
	@RequestMapping("/up.do")
	public @ResponseBody Map<String,Object> save(HttpServletRequest request){
		Map<String,Object> result = new HashMap<String,Object>();
		User user = new User();
		user.setMobile(request.getParameter("mobile"));
		user.setName(request.getParameter("name"));
		user.setAddress(request.getParameter("address"));
		userService.insert(user);
		result.put("success", true);
		result.put("msg", "添加成功");
		result.put("url", "/admin/user/list");
		return result;
	}	
}
