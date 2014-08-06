package com.jeffy.jforle.service.impl;

import com.jeffy.jforle.common.pojos.Users;
import com.jeffy.jforle.dao.CustomerDao;
import com.jeffy.jforle.service.LoginService;

public class LoginServiceImpl implements LoginService {
    private CustomerDao customerDao;
	@Override
	public Users Customerlogin(String name, String password)
			throws Exception {
		try {
			Users user = customerDao.findUserinfoByName(name);
			if (user == null) {
				throw new Exception("用户不存在！");
			}
			if (!password.equals(user.getLoginPassword())) {
				throw new Exception("密码不正确！");
			}
			return user;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	

}
