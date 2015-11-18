package com.ydcun.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users{
	private int id;
	private String name;
	private String password;
	private int age;

	public Users() {
	}

	public Users(String string, int i, int j) {
		this.name = string;
		this.id = i;
		this.age = j;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = 0;
		if (age != null) {
			this.age = age;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
