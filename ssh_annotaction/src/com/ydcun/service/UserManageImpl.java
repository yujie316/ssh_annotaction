package com.ydcun.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ydcun.dao.IUserDao;
import com.ydcun.entity.Users;
@Service
@Transactional
public class UserManageImpl implements IUserManage {
	
	@Resource  
	private IUserDao UserDaoImp;
	
	
	@Override
	public void addUser(Users user) {
		System.out.println("------UserManageImp.adddUser--------"+user.getName());
		UserDaoImp.AddUser(user);
	}

	@Override
	public void modifyUser(Users user) {
		System.out.println("------UserManageImp.modifyUser--------"+user.getName());
		UserDaoImp.modifyUser(user);
	}

	@Override
	public void deleteUser(Users user) {
		System.out.println("------UserManageImp.deleteUser--------"+user.getName());
		UserDaoImp.deleteUser(user);
	}

	@Override
	public List<Users> getAllUser() {
		return this.UserDaoImp.findAllUser();
	}

	@Override
	public Users getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}
}
