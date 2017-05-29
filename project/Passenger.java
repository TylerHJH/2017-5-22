package project;

import java.util.ArrayList;
public class Passenger 
{
	private int passengerID;
	private String realName;
	private String identityID;
	private String password;
	ArrayList<Order> orderList = new ArrayList<Order>();
	//�˿�����
	public int getPassengerID() 
	{
		return passengerID;
	}
	//get��set����
	public void setPassengerID(int passengerID) 
	{
		this.passengerID = passengerID;
	}
	//get��set����
	public String getRealName() 
	{
		return realName;
	}
	//get��set����
	public void setRealName(String realName) 
	{
		this.realName = realName;
	}
	//get��set����
	public String getIdentityID() 
	{
		return identityID;
	}
	//get��set����
	public void setIdentityID(String identityID) 
	{
		this.identityID = identityID;
	}
	//get��set����
	public String getPassword() 
	{
		return password;
	}
	//get��set����
	public void setPassword(String password) 
	{
		this.password = password;
	}
	//get��set����
	
	public Passenger(int passengerID, String realName, String identityID,
			String password){
		this.passengerID = passengerID;
		this.realName = realName;
		this.identityID = identityID;
		this.password = password;
	}
	//���췽�����Գ˿ͳ�ʼ��
	public static void initializePassengerData(){
	Passenger p1 = new Passenger(0001, "Tom", "10001", "Tom");
	Passenger p2 = new Passenger(0002, "Pat", "10002", "Pat");
	Passenger p3 = new Passenger(0003, "Coco", "10003", "Coco");
	Data.ListOfPassenger.add( p1 );
	Data.ListOfPassenger.add( p2 );
	Data.ListOfPassenger.add( p3 );
	}
}
