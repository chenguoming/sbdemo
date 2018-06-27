package com.adamai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adamai.domain.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, String> {

}
