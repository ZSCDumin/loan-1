package justlike.loan.controller.admin.loan;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import justlike.loan.controller.BaseController;
import justlike.loan.model.Loan;
import justlike.loan.service.LoanService;

@Controller
@RequestMapping("/admin/loan")
public class LoanListController extends BaseController{
	@Autowired
	private LoanService loanService;

	@RequestMapping(value="/list",method={RequestMethod.GET,RequestMethod.POST})
	public String list(HttpServletRequest request ,Model model) {	
		Map<String, Object> param = this.queryPageParamInit(request,model,loanService.count());
		List<Loan> entitys = loanService.queryPageList(param);
		model.addAttribute("entitys", entitys);
		return "admin/loan/loanList";
	}		
}
