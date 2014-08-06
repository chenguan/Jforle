package com.jeffy.jforle.service;

import com.jeffy.jforle.common.pojos.Users;



public interface LoginService {
	public Users Customerlogin(String name,String password) throws Exception;
}
