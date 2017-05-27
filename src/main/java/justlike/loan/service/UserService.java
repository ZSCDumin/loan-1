package justlike.loan.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import justlike.loan.dao.UserMapper;
import justlike.loan.model.User;

@Transactional
@Service
public class UserService extends BaseService<User, Integer> implements UserMapper{
	
}
