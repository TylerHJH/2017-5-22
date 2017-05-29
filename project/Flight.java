package project;

import java.util.ArrayList;

public class Flight 
{
	private String FlightID;
	private int startHour;
	private int startMinute;
	private int arrivalHour;
	private int arrivalMinute;
	private String startCity;
	private String arrivalCity;
	private int departureYear;
	private int departureMonth;
	private int departureDate;
	private int arrivalYear;
	private int arrivalMonth;
	private int arrivalDate;
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
	@Override
	public String toString() {
		return "Flight [FlightID=" + FlightID + ", startHour=" + startHour + ", startMinute=" + startMinute
				+ ", arrivalHour=" + arrivalHour + ", arrivalMinute=" + arrivalMinute + ", startCity=" + startCity
				+ ", arrivalCity=" + arrivalCity + ", departureYear=" + departureYear + ", departureMonth="
				+ departureMonth + ", departureDate=" + departureDate + ", price=" + price + ", currentPassengers="
				+ currentPassengers + ", seatCapacity=" + seatCapacity + ", flightStatus=" + flightStatus + "]" ;
	}
	public void setFlightID(String flightID) 
	{
		FlightID = flightID;
	}
	public int getStartHour() 
	{
		return startHour;
	}
	public void setStartHour(int startHour) 
	{
		this.startHour = startHour;
	}
	public int getStartMinute() 
	{
		return startMinute;
	}
	public void setStartMinute(int startMinute) 
	{
		this.startMinute = startMinute;
	}
	public int getArrivalHour() 
	{
		return arrivalHour;
	}
	public void setArrivalHour(int arrivalHour) 
	{
		this.arrivalHour = arrivalHour;
	}
	public int getArrivalMinute() 
	{
		return arrivalMinute;
	}
	public void setArrivalMinute(int arrivalMinute) 
	{
		this.arrivalMinute = arrivalMinute;
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
	public int getArrivalYear() 
	{
		return arrivalYear;
	}
	public void setArrivalYear(int arrivalYear) 
	{
		this.arrivalYear = arrivalYear;
	}
	public int getArrivalMonth() 
	{
		return arrivalMonth;
	}
	public void setArrivalMonth(int arrivalMonth) 
	{
		this.arrivalMonth = arrivalMonth;
	}
	public int getArrivalDate() 
	{
		return arrivalDate;
	}
	public void setArrivalDate(int arrivalDate) 
	{
		this.arrivalDate = arrivalDate;
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
	public Flight(String flightID, int startHour, int startMinute, int arrivalHour, int arrivalMinute, String startCity,
			String arrivalCity,int departureYear, int departureMonth, int departureDate, int arrivalYear, int arrivalMonth,
			int arrivalDate,int price, int currentPassengers, int seatCapacity, String flightStatus) 
	{
		super();
		FlightID = flightID;
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.arrivalHour = arrivalHour;
		this.arrivalMinute = arrivalMinute;
		this.startCity = startCity;
		this.arrivalCity = arrivalCity;
		this.departureYear = departureYear;
		this.departureMonth = departureMonth;
		this.departureDate = departureDate;
		this.arrivalYear = arrivalYear;
		this.arrivalMonth = arrivalMonth;
		this.arrivalDate = arrivalDate;
		this.price = price;
		this.currentPassengers = currentPassengers;
		this.seatCapacity = seatCapacity;
		this.flightStatus = flightStatus;
	}
	public static void initializeFlightData(){
		Flight f1=new Flight("A1000",7,00,9,00,"ShenZhen","ShangHai",2017,6,1,2017,6,1,740,150,200,"AVAILABLE");
		Flight f2=new Flight("A1001",19,00,21,00,"ShangHai","ShenZhen",2017,6,1,2017,6,1,650,100,200,"AVAILABLE");
		Flight f3=new Flight("A1002",2,25,5,30,"ShenZhen","BeiJing",2017,6,1,2017,6,1,860,178,200,"TERMINATE");
		Flight f4=new Flight("A1003",8,15,11,35,"BeiJing","ShenZhen",2017,6,1,2017,6,1,1400,200,200,"FULL");
		Flight f5=new Flight("A1004",20,55,23,05,"ShangHai","BeiJing",2017,6,1,2017,6,1,480,50,200,"AVAILABLE");
		Flight f6=new Flight("A1005",6,40,8,55,"BeiJing","ShangHai",2017,6,1,2017,6,1,510,100,200,"AVAILABLE");
		Flight f7=new Flight("A1006",7,00,9,00,"ShenZhen","ShangHai",2017,6,2,2017,6,2,840,150,200,"AVAILABLE");
		Flight f8=new Flight("A1007",19,00,21,00,"ShangHai","ShenZhen",2017,6,2,2017,6,2,650,100,200,"AVAILABLE");
		Flight f9=new Flight("A1008",2,25,5,30,"ShenZhen","BeiJing",2017,6,2,2017,6,2,960,200,200,"FULL");
		Flight f10=new Flight("A1009",8,15,11,35,"BeiJing","ShenZhen",2017,6,2,2017,6,2,1400,190,200,"AVAILABLE");
		Flight f11=new Flight("A1010",20,55,23,05,"ShangHai","BeiJing",2017,6,2,2017,6,2,480,50,200,"AVAILABLE");
		Flight f12=new Flight("A1011",6,40,8,55,"BeiJing","ShangHai",2017,6,2,2017,6,2,510,100,200,"AVAILABLE");
		Flight f13=new Flight("A1012",7,00,9,00,"ShenZhen","ShangHai",2017,6,3,2017,6,3,840,150,200,"AVAILABLE");
		Flight f14=new Flight("A1013",19,00,21,00,"ShangHai","ShenZhen",2017,6,3,2017,6,3,750,0,200,"UNPUBLISHED");
		Flight f15=new Flight("A1014",2,25,5,30,"ShenZhen","BeiJing",2017,6,3,2017,6,3,860,140,200,"AVAILABLE");
		Flight f16=new Flight("A1015",8,15,11,35,"BeiJing","ShenZhen",2017,6,3,2017,6,3,1400,200,200,"FULL");
		Flight f17=new Flight("A1016",20,55,23,05,"ShangHai","BeiJing",2017,6,3,2017,6,3,480,50,200,"AVAILABLE");
		Flight f18=new Flight("A1017",6,40,8,55,"BeiJing","ShangHai",2017,6,3,2017,6,3,510,100,200,"AVAILABLE");
		Flight f19=new Flight("A1018",10,40,12,55,"BeiJing","ShangHai",2017,6,3,2017,6,3,580,50,200,"AVAILABLE");
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
		Data.ListOfFlight.add(f19);
	}
	
}
