package com.ydcun.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.google.gson.Gson;
import com.ydcun.entity.Users;
import com.ydcun.service.IUserManage;

@Controller
@RequestMapping("/loginAction")
public class UserController {
	@Resource
	private IUserManage userManageImp;

	@RequestMapping("/login")
	public String addUser(Users user,HttpServletRequest request){
		userManageImp.addUser(user);
		request.setAttribute("message", "message");
		this.userManageImp.getAllUser();
		return "login";
	}
	
	@RequestMapping("/getAllUser")
	public void getAllUser(HttpServletRequest request,HttpServletResponse response){
		WebApplicationContext ac1 = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		WebApplicationContext ac2 = RequestContextUtils.getWebApplicationContext(request);
		
		PrintWriter out = null;
		response.setContentType("application/json");
		
		List<Users> userList = userManageImp.getAllUser();
		Gson gson = new Gson();
		
		try {
			out =response.getWriter();
			String result=gson.toJson(userList);
			System.out.println(result);
			out.write(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("/delUser")
	public String delUser(String id,HttpServletRequest request){
		userManageImp.deleteUser(id);
		request.setAttribute("message", "message");
		return "person";
	}
	@RequestMapping("/getUserById")
	public String getUserById(String id,HttpServletRequest request){
		Users user = userManageImp.getUserById(id);
		request.setAttribute("user", user);
		return "updataUser";
	}
	@RequestMapping("/updataUser")
	public String delUser(Users user,HttpServletRequest request){
		userManageImp.updateUser(user);
		request.setAttribute("message", "message");
//		return "redirect:/user/getAllUser";
		return "person";
	}
}
