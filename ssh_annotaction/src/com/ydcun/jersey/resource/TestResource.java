package com.ydcun.jersey.resource;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ydcun.entity.Users;
import com.ydcun.service.IUserManage;
import com.ydcun.service.UserManageImpl;

@Path("test")
public class TestResource {
	@Autowired
    private UserManageImpl  userManageImpl;

	@Path("getText")
	@GET
	@Produces("text/plain")
	public String getText() {
		// 实例化 
		userManageImpl.getAllUser(); 
		return "hello lucky";
	}

	@Path("getAllUserfromJson")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)  
    @Produces(MediaType.APPLICATION_JSON) 
	public List<Users> getJson() {
		System.out.println("获取用户");
		//return this.userManage.getAllUser();
		Users u = new Users("ddd", 3, 3);
		List<Users> list = new ArrayList<Users>();
		list.add(u);
		return list;
	}
	@Path("addUser")
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes(MediaType.APPLICATION_JSON) 
	public Users addUser(@FormParam("userID") List<String> userID) {
		return new Users("a", 26, 62);
	}
}
