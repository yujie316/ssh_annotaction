package com.ydcun.service;

import java.util.List;

import com.ydcun.entity.Users;

public interface IUserManage {
	public void addUser(Users user);
	public void modifyUser(Users user);
	public void deleteUser(Users user);
	public List<Users> getAllUser();
	public Users getUserById(String id);
	public void updateUser(Users user);
	public void deleteUser(String id);
}
