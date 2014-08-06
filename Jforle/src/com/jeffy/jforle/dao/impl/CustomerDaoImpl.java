package com.jeffy.jforle.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jeffy.jforle.common.exception.CommonException;
import com.jeffy.jforle.common.pojos.Users;
import com.jeffy.jforle.dao.CustomerDao;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
     @Override
	public Users findUserinfoByName(String name) throws CommonException {
		Users user = new Users();
		user.setAddress("111");
		user.setId(12345l);
		user.setLoginName("tom");
		user.setLoginPassword("111111");
		return user;
	}

}
