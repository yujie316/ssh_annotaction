package com.ydcun.dao;

import java.util.List;

import com.ydcun.entity.Users;

public interface IUserDao {
	public void AddUser(Users user);
	public void modifyUser(Users user);
	public void deleteUser(Users user);
	public List<Users> findAllUser();
}
