package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Administrator 
{
	private String adminName;
	private String password;
	private  static String superAdminName = "Tyler";
	private static String superAdminPassword = "Tyler";
	//管理员属性以及超级管理员属性
	Scanner input = new Scanner( System.in );
	
	public String toString() {
		return "Administrator [adminName=" + adminName + ", password=" + password + "]";
	}
	public Administrator(){}
	public Administrator( String adminName, String password)
	{
		this.adminName = adminName;
		this.password = password;
	}
	//管理员构造方法
	public String getAdminName() {
		return adminName;
	}
	//get方法
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	//set方法
	public String getPassword() {
		return password;
	}
	//get方法
	public void setPassword(String password) {
		this.password = password;
	}
	//set方法
	public static String getSuperAdminName() {
		return superAdminName;
	}
	//get方法
	public static void setSuperAdminName(String superAdminName) {
		Administrator.superAdminName = superAdminName;
	}
	//set方法
	public static String getSuperAdminPassword() {
		return superAdminPassword;
	}
	//get方法
	public static void setSuperAdminPassword(String superAdminPassword) {
		Administrator.superAdminPassword = superAdminPassword;
	}
	//set方法
}	
