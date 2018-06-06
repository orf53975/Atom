package com.maven.entity;

import java.io.Serializable;

/**
 * Model class of activity_template.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class ActivityTemplate implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 活动编码. */
	private Integer activitycode;

	/** 活动名称. */
	private String name;

	/** 状态 (1启用，2禁用). */
	private String status;
	
	/** 活动描述 */
	private String activitydesc;
	
	/* 唯一标识列 */
	private String sign;

	public enum Enum_status{
		启用("1","启用"),
		禁用("2","禁用");
		public String value;
		public String desc;
		
		private Enum_status(String value,String desc){
			this.value=value;
			this.desc=desc;
		}
	}
	
	public enum Enum_activity{
		//需要对应数据库记录ID，表格：activity_template
		
		注册彩金(1,"注册彩金"),
		充值赠送(3,"充值赠送"),
		输钱返利(4,"输钱返利"),
		幸运抽奖(5,"幸运抽奖"),
		充值大抽奖(6,"充值大抽奖"),
		充值赠送高级版(7,"充值赠送高级版"),
		日投注返水高级版(8,"日投注返水高级版"),
		签到领红包(11,"签到领红包"),
		首存赠送(12,"首存赠送"),//正式
		注册领红包(13,"注册领红包"),
		完善资料领红包(14,"完善资料领红包"),
		每日充值享受抽奖(15,"每日充值享受抽奖"),
		
		
		
//		首存赠送(10,"首存赠送"),//测试
		;
		public Integer activitycode;
		public String desc;
		
		private Enum_activity(Integer activitycode,String desc){
			this.activitycode=activitycode;
			this.desc=desc;
		}
	}
	
	/**
	 * Constructor.
	 */
	public ActivityTemplate() {
	}

	/**
	 * Set the 活动编码.
	 * 
	 * @param activitycode
	 *            活动编码
	 */
	public void setActivitycode(Integer activitycode) {
		this.activitycode = activitycode;
	}

	/**
	 * Get the 活动编码.
	 * 
	 * @return 活动编码
	 */
	public Integer getActivitycode() {
		return this.activitycode;
	}

	/**
	 * Set the 活动名称.
	 * 
	 * @param name
	 *            活动名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 活动名称.
	 * 
	 * @return 活动名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 状态 (1启用，2禁用).
	 * 
	 * @param status
	 *            状态 (1启用，2禁用)
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getActivitydesc() {
		return activitydesc;
	}

	public void setActivitydesc(String activitydesc) {
		this.activitydesc = activitydesc;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * Get the 状态 (1启用，2禁用).
	 * 
	 * @return 状态 (1启用，2禁用)
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activitycode == null) ? 0 : activitycode.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ActivityTemplate other = (ActivityTemplate) obj;
		if (activitycode == null) {
			if (other.activitycode != null) {
				return false;
			}
		} else if (!activitycode.equals(other.activitycode)) {
			return false;
		}
		return true;
	}

}
