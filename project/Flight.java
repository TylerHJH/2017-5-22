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
	public Flight(String flightID, int startHour, int startMinute, int arrivalHour, int arrivalMinute, String startCity, String arrivalCity,
			int departureYear, int departureMonth, int departureDate, int price, int currentPassengers, int seatCapacity, String flightStatus) 
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
		this.price = price;
		this.currentPassengers = currentPassengers;
		this.seatCapacity = seatCapacity;
		this.flightStatus = flightStatus;
	}
	
}
