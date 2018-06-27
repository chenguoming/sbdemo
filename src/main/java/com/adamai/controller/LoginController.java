package com.adamai.controller;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adamai.domain.SysUser;
import com.adamai.service.user.IUserService;
import com.adamai.utils.StringUtil;
import com.adamai.utils.EncDec.MD5Util;

@Controller
public class LoginController {
	
	@Autowired
	private IUserService userService;

	/**
	 * 跳到登录页面
	 * @return
	 */
	@RequestMapping("/system")
	public String toSystem(){
		return "login";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		SysUser sysUser = userService.findByName(name);
		map.put("status", 1);
		if(null != sysUser){
			if(!new MD5Util().getMD5ofStr(pwd).equals(sysUser.getPwd())){
				map.put("status", 0);
				map.put("msg", "密码错误");
			}else{
				request.getSession().setAttribute("user", sysUser);
			}
		}else{
			map.put("status", 0);
			map.put("msg", "没有此用户");
		}
		return map;
	}
	
	/**
	 * 跳到首页
	 * @return
	 */
	@RequestMapping("/system/home")
	public String toHome(){
		return "home";
	}
}
