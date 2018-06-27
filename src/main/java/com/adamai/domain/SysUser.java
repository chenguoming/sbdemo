package com.adamai.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 系统管理员
 * @author Administrator
 *
 */
@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable{
	//springdatajpa通过注解方式自动生成表时字段的顺序问题
	@Id
	@GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id ;
	
	//用户名
	@Column(length=16)
	private String name ;
	
	//密码
	@Column(length=64)
	private String pwd ;
	
	//状态
	@Column(length=1)
	private int status ;
	
	//创建时间
	@Column(length=19)
	private String createTime ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
}
