package com.adamai.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.adamai.domain.SysUser;
import com.adamai.repository.SysUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private SysUserRepository userRepository;

	public SysUser findByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}

	

}
