package com.adamai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adamai.domain.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, String> {

	@Query(value="select u from SysUser u where name = ?1")
	SysUser findByName(String name);
}
