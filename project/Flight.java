package project;

import java.util.ArrayList;

public class Flight 
{
	private String FlightID;
	private String startTime;
	private String arrivalTime;
	private String startCity;
	private String arrivalCity;
	private int departureYear;
	private int departureMonth;
	private int departureDate;
	private int price;
	private int currentPassengers;
	private int seatCapacity;
	private String flightStatus;
	ArrayList<Order> orderOfFlight = new ArrayList<Order>();
	ArrayList<Boolean> seatnumber = new ArrayList<Boolean>(seatCapacity);
	public String getFlightID() 
	{
		return FlightID;
	}
	public void setFlightID(String flightID) 
	{
		FlightID = flightID;
	}
	public String getStartTime() 
	{
		return startTime;
	}
	public void setStartTime(String startTime) 
	{
		this.startTime = startTime;
	}
	public String getArrivalTime() 
	{
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) 
	{
		this.arrivalTime = arrivalTime;
	}
	public String getStartCity() 
	{
		return startCity;
	}
	public void setStartCity(String startCity) 
	{
		this.startCity = startCity;
	}
	public String getArrivalCity() 
	{
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) 
	{
		this.arrivalCity = arrivalCity;
	}
	public int getDepartureYear() 
	{
		return departureYear;
	}
	public void setDepartureYear(int departureYear) 
	{
		this.departureYear = departureYear;
	}
	public int getDepartureMonth() 
	{
		return departureMonth;
	}
	public void setDepartureMonth(int departureMonth) 
	{
		this.departureMonth = departureMonth;
	}
	public int getDepartureDate() 
	{
		return departureDate;
	}
	public void setDepartureDate(int departureDate) 
	{
		this.departureDate = departureDate;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public int getCurrentPassengers() 
	{
		return currentPassengers;
	}
	public void setCurrentPassengers(int currentPassengers) 
	{
		this.currentPassengers = currentPassengers;
	}
	public int getSeatCapacity() 
	{
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) 
	{
		this.seatCapacity = seatCapacity;
	}
	public String getFlightStatus() 
	{
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) 
	{
		this.flightStatus = flightStatus;
	}
	public int getSeatNumber(){
		int a = 0;
		while(a < seatnumber.size()){
			if (seatnumber.get(a) == false){
				seatnumber.remove(a);
				seatnumber.add(a, true);
				break;
			}
			a = a + 1;
		}
		return a + 1;
	}
	public Flight(String flightID, String startTime, String arrivalTime, String startCity, String arrivalCity,
			int departureYear, int departureMonth, int departureDate, int price, int currentPassengers, int seatCapacity, String flightStatus) 
	{
		super();
		FlightID = flightID;
		this.startTime = startTime;
		this.arrivalTime = arrivalTime;
		this.startCity = startCity;
		this.arrivalCity = arrivalCity;
		this.departureYear = departureYear;
		this.departureMonth = departureMonth;
		this.departureDate = departureDate;
		this.price = price;
		this.currentPassengers = currentPassengers;
		this.seatCapacity = seatCapacity;
		this.flightStatus = flightStatus;
	}
	public static void initializeFlightData(){
		Flight f1=new Flight("A1000","07:00:00","09:00:00","ShenZhen","ShangHai",2017,6,1,740,150,200,"AVAILABLE");
		Flight f2=new Flight("A1001","19:00:00","21:00:00","ShangHai","ShenZhen",2017,6,1,650,100,200,"AVAILABLE");
		Flight f3=new Flight("A1002","02:25:00","05:30:00","ShenZhen","BeiJing",2017,6,1,860,178,200,"TERMINATE");
		Flight f4=new Flight("A1003","08:15:00","11;35:00","BeiJing","ShenZhen",2017,6,1,1400,200,200,"FULL");
		Flight f5=new Flight("A1004","20:55:00","23:05:00","ShangHai","BeiJing",2017,6,1,480,50,200,"AVAILABLE");
		Flight f6=new Flight("A1005","06:40:00","08:55:00","BeiJing","ShangHai",2017,6,1,510,100,200,"AVAILABLE");
		Flight f7=new Flight("A1006","07:00:00","09:00:00","ShenZhen","ShangHai",2017,6,2,840,150,200,"AVAILABLE");
		Flight f8=new Flight("A1007","19:00:00","21:00:00","ShangHai","ShenZhen",2017,6,2,650,100,200,"AVAILABLE");
		Flight f9=new Flight("A1008","02:25:00","05:30:00","ShenZhen","BeiJing",2017,6,2,960,200,200,"FULL");
		Flight f10=new Flight("A1009","08:15:00","11;35:00","BeiJing","ShenZhen",2017,6,2,1400,190,200,"AVAILABLE");
		Flight f11=new Flight("A1010","20:55:00","23:05:00","ShangHai","BeiJing",2017,6,2,480,50,200,"AVAILABLE");
		Flight f12=new Flight("A1011","06:40:00","08:55:00","BeiJing","ShangHai",2017,6,2,510,100,200,"AVAILABLE");
		Flight f13=new Flight("A1012","07:00:00","09:00:00","ShenZhen","ShangHai",2017,6,3,840,150,200,"AVAILABLE");
		Flight f14=new Flight("A1013","19:00:00","21:00:00","ShangHai","ShenZhen",2017,6,3,750,0,200,"UNPUBLISHED");
		Flight f15=new Flight("A1014","02:25:00","05:30:00","ShenZhen","BeiJing",2017,6,3,860,140,200,"AVAILABLE");
		Flight f16=new Flight("A1015","08:15:00","11;35:00","BeiJing","ShenZhen",2017,6,3,1400,200,200,"FULL");
		Flight f17=new Flight("A1016","20:55:00","23:05:00","ShangHai","BeiJing",2017,6,3,480,50,200,"AVAILABLE");
		Flight f18=new Flight("A1017","06:40:00","08:55:00","BeiJing","ShangHai",2017,6,3,510,100,200,"AVAILABLE");
		Data.ListOfFlight.add(f1);
		Data.ListOfFlight.add(f2);
		Data.ListOfFlight.add(f3);
		Data.ListOfFlight.add(f4);
		Data.ListOfFlight.add(f5);
		Data.ListOfFlight.add(f6);
		Data.ListOfFlight.add(f7);
		Data.ListOfFlight.add(f8);
		Data.ListOfFlight.add(f9);
		Data.ListOfFlight.add(f10);
		Data.ListOfFlight.add(f11);
		Data.ListOfFlight.add(f12);
		Data.ListOfFlight.add(f13);
		Data.ListOfFlight.add(f14);
		Data.ListOfFlight.add(f15);
		Data.ListOfFlight.add(f16);
		Data.ListOfFlight.add(f17);
		Data.ListOfFlight.add(f18);
	}
	
}
