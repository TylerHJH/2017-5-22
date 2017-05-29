package project;

import java.util.ArrayList;
public class Passenger 
{
	private int passengerID;
	private String realName;
	private String identityID;
	private String password;
	ArrayList<Order> orderList = new ArrayList<Order>();
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
	
	public Passenger(int passengerID, String realName, String identityID,
			String password){
		this.passengerID = passengerID;
		this.realName = realName;
		this.identityID = identityID;
		this.password = password;
	}
	//构造方法，对乘客初始化
	public static void initializePassengerData(){
	Passenger p1 = new Passenger(0001, "Tom", "10001", "Tom");
	Passenger p2 = new Passenger(0002, "Pat", "10002", "Pat");
	Passenger p3 = new Passenger(0003, "Coco", "10003", "Coco");
	Data.ListOfPassenger.add( p1 );
	Data.ListOfPassenger.add( p2 );
	Data.ListOfPassenger.add( p3 );
	}
}
