package justlike.loan.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import justlike.loan.dao.LoanMapper;
import justlike.loan.model.Loan;

@Transactional
@Service
public class LoanService extends BaseService<Loan, Long> implements LoanMapper{
	
}
