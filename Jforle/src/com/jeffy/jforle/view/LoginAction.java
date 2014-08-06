package com.jeffy.jforle.view;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.jeffy.jforle.common.pojos.Users;
import com.jeffy.jforle.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private LoginService loginService;

	private String loginName;
	private String loginPassword;
	private String authCode;
	private String errorMsg;
	private String isManager;

	public String execute() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		String code = (String) session.getAttribute("authCode");
		if (code == null || !authCode.equals(code)) {
			this.setErrorMsg("验证码错误！");
			return ERROR;
		}
		try {
			Users user = loginService.Customerlogin(loginName,
					loginPassword);
			session.setAttribute("isLogin", "true");
			session.setAttribute("userinfo",user );
			return "customer";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}

}
