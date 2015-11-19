package com.ydcun.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ydcun.entity.Users;
@Repository
public class UserDaoImp implements IUserDao {
	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void AddUser(Users user) {
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().save(user);
	}

	@Override
	public void modifyUser(Users user) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ user.getName());
		getSession().update(user);
	}

	@Override
	public void deleteUser(Users user) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ user.getName());
		getSession().delete(user);
	}

	@Override
	public List<Users> findAllUser() {
		String hql = "from Users";
		Query query = getSession().createQuery(hql);
		return query.list();
	}

}
