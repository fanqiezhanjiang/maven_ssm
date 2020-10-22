package com.lyj.model;

public class User {
	private int id;
	/*
	 * 姓名/用户名
	 */
	private String username;
	/*
	 * 密码
	 */
	private String password;
	/*
	 * 昵称
	 */
	private String nickname;
	/*
	 * 1 表示男，0 表示女
	 */
	private int sex;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public User() {
		super();
	}
	
	public User(int id, String uername, String password, String nickname,
			int sex, int age){
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.sex = sex;
		this.age = age;
	}
	
	public User(String username, String password, String nicknamString,
			int age, int sex) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.sex = sex;
		this.age = age;
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User[id = "+id+" ,username"+username+",password"
		+password+",nickname="+nickname+",sex="+sex+",age"+age+"]";
	}
}
