package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Administrator 
{
	private String adminName;
	private String password;
	private  static String superAdminName = "Tyler";
	private static String superAdminPassword = "Tyler";
	//����Ա�����Լ���������Ա����
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
	//����Ա���췽��
	public String getAdminName() {
		return adminName;
	}
	//get����
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	//set����
	public String getPassword() {
		return password;
	}
	//get����
	public void setPassword(String password) {
		this.password = password;
	}
	//set����
	public static String getSuperAdminName() {
		return superAdminName;
	}
	//get����
	public static void setSuperAdminName(String superAdminName) {
		Administrator.superAdminName = superAdminName;
	}
	//set����
	public static String getSuperAdminPassword() {
		return superAdminPassword;
	}
	//get����
	public static void setSuperAdminPassword(String superAdminPassword) {
		Administrator.superAdminPassword = superAdminPassword;
	}
	//set����
}	
