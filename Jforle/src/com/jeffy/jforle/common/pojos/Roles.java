package com.jeffy.jforle.common.pojos;

import java.util.HashSet;
import java.util.Set;

/**
 * WossRoles generated by MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Long pid;
	private String remark;
	private Set wossAdminses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String name, Long pid, String remark, Set wossAdminses) {
		this.name = name;
		this.pid = pid;
		this.remark = remark;
		this.wossAdminses = wossAdminses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getWossAdminses() {
		return this.wossAdminses;
	}

	public void setWossAdminses(Set wossAdminses) {
		this.wossAdminses = wossAdminses;
	}

}