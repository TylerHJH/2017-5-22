package project;

public class FlightOrder {
	private String passengerName;
	private String identityID;
	private int seatNumber;
	private Date orderTime;
	private String orderStatus;
	public String getpassengerName(){
		return passengerName;
		
	}
	public void setpassengerName(String name){
		this.passengerName = name;
	}
	public String getidentityID(){
		return identityID;
		
	}
	public void setidentityID(String identityID){
		this.identityID = identityID;
	}
	public int getseatNumber(){
		return seatNumber;
		
	}
	public void setseatNumber(int seatNumber){
		this.seatNumber = seatNumber;
	}
	public Date getorderTime(){
		return orderTime;
		
	}
	public void setorderTime(Date orderTime){
		this.orderTime = orderTime;
	}
	public String getorderStatus(){
		return orderStatus;
		
	}
	public void setorderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}
	public FlightOrder(String passengerName, String identityID, int seatNumber, Date orderTime, String orderStatus){
		this.passengerName = passengerName;
		this.identityID = identityID;
		this.seatNumber = seatNumber;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
	}
}
