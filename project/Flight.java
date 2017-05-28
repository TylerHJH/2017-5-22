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
	private ArrayList<FlightOrder> orderOfFlight = new ArrayList<FlightOrder>();
	private ArrayList<Boolean> seatnumber = new ArrayList<Boolean>(seatCapacity);
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
	
}
