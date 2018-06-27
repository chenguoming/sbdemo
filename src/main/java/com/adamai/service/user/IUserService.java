package com.adamai.service.user;

import org.springframework.data.jpa.repository.Query;

import com.adamai.domain.SysUser;

public interface IUserService {
	
	SysUser findByName(String name);
	
	
}
