package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Passenger 
{
    private int passengerID;
	private String realName;
	private String identityID;
	private String password;
	ArrayList<Order> orderList;
	//乘客属性
	public int getPassengerID() 
	{
		return passengerID;
	}
	//get或set方法
	public void setPassengerID(int passengerID) 
	{
		this.passengerID = passengerID;
	}
	//get或set方法
	public String getRealName() 
	{
		return realName;
	}
	//get或set方法
	public void setRealName(String realName) 
	{
		this.realName = realName;
	}
	//get或set方法
	public String getIdentityID() 
	{
		return identityID;
	}
	//get或set方法
	public void setIdentityID(String identityID) 
	{
		this.identityID = identityID;
	}
	//get或set方法
	public String getPassword() 
	{
		return password;
	}
	//get或set方法
	public void setPassword(String password) 
	{
		this.password = password;
	}
	//get或set方法
	public Passenger( int passengerID, String realName, String identityID,
			String password)
	{
		this.passengerID = passengerID;
		this.realName = realName;
		this.identityID = identityID;
		this.password = password;
	}
	//构造方法，对乘客初始化
}
