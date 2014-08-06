package com.jeffy.jforle.dao;

import com.jeffy.jforle.common.exception.CommonException;
import com.jeffy.jforle.common.pojos.Users;

public interface CustomerDao {
	Users findUserinfoByName(String name) throws CommonException;

}
