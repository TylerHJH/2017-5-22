package project;

import java.util.Calendar;

public class Order 
{
	private String passengerName;
	private String identityID;
	private int passengerID;
	private int seat;
	private Flight flight;
	private Date createTime;
	private String status;
	private int departmentYear;
	private int departmentMonth;
	private int departmentDate;
	public String toString() {
		return "Order [passengerName=" + passengerName + ", identityID=" + identityID + ", passengerID=" + passengerID
				+ ", seat=" + seat + ", flightID=" + flight.getFlightID() + ", createTime=" + createTime + ", status=" + status
				+ ", departmentYear=" + departmentYear + ", departmentMonth=" + departmentMonth + ", departmentDate="
				+ departmentDate + "]\n";
	}
	//∂©µ• Ù–‘
	public int getPassengerID() 
	{
		return passengerID;
	}
	public void setPassengerID(int passengerID) 
	{
		this.passengerID = passengerID;
	}
	public int getSeat() 
	{
		return seat;
	}
	public void setSeat(int seat) 
	{
		this.seat = seat;
	}
	public Flight getFlight() 
	{
		return flight;
	}
	public void setFlight(Flight flight) 
	{
		this.flight = flight;
	}
	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	public String getpassengerName() {
		return passengerName;
	}
	public void setpassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public String getidentityID() {
		return identityID;
	}
	public void setidentityID(String identityID) {
		this.identityID = identityID;
	}
	public int getdepartmentYear() {
		return departmentYear;
	}
	public void setdepartmentYear(int departmentYear) {
		this.departmentYear = departmentYear;
	}
	public int getdepartmentMonth() {
		return departmentMonth;
	}
	public void setdepartmentMonth(int departmentMonth) {
		this.departmentMonth = departmentMonth;
	}
	public int getdepartmentDate() {
		return departmentDate;
	}
	public void setdepartmentDate(int departmentDate) {
		this.departmentDate = departmentDate;
	}
	public Order(String passengerName, String identityID, int passengerID, int seat, Flight flight,
			Date createTime, String status, int departmentYear, int departmentMonth, int departmentDate) 
	{
		this.passengerName = passengerName;
		this.identityID = identityID;
		this.passengerID = passengerID;
		this.seat = seat;
		this.flight = flight;
		this.createTime = createTime;
		this.status = status;
		this.departmentYear = departmentYear;
		this.departmentYear = departmentMonth;
		this.departmentYear = departmentDate;
	}
	public static void displayOrderOfFlight(Flight flight){
		for(Order orderOfFlight: flight.orderOfFlight )
		{
			System.out.printf("%s%10s%10d%10s%10s\n",orderOfFlight.passengerName,orderOfFlight.identityID,orderOfFlight.seat, orderOfFlight.createTime.toString(), orderOfFlight.status);
			System.out.println();
		}	
	}
	public static void displayMyOrderInformation( Order order )
	{
		System.out.printf("%s%10s%10s%10d%s", order.passengerName, order.identityID, order.flight.getFlightID(), order.seat, order.createTime.toString());
	}
	public static void initializeOrderData(){
		for (Flight flight : Data.ListOfFlight){
			if (flight.getDepartureYear() == 2017 & flight.getFlightID().equals("A1000") & 
					flight.getDepartureMonth() == 6 &flight.getDepartureDate() == 1){
				for( Passenger passenger:Data.ListOfPassenger)
				{
					if( passenger.getPassengerID() == 0001 & passenger.getPassword().equals("Tom") )
					{
						flight.setCurrentPassengers(flight.getCurrentPassengers() + 1);
						if (flight.getCurrentPassengers() == flight.getSeatCapacity())
						{
							flight.setFlightStatus("FULL");
						}
						Date date = new Date(2017, 5, 29, 12, 20, 45);
						Order order1 = new Order("Tom", "10001", 0001, flight.getSeatNumber(), flight, date, "Paid", 2017, 6, 1);
						Data.ListOfOrder.add(order1);
						passenger.orderList.add(order1);
						flight.orderOfFlight.add(order1);
					}
				}
			}
			if (flight.getDepartureYear() == 2017 & flight.getFlightID().equals("A1009") & 
					flight.getDepartureMonth() == 6 &flight.getDepartureDate() == 2){
				for( Passenger passenger:Data.ListOfPassenger)
				{
					if( passenger.getPassengerID() == 0002 & passenger.getPassword().equals("Pat") )
					{
						flight.setCurrentPassengers(flight.getCurrentPassengers() + 1);
						if (flight.getCurrentPassengers() == flight.getSeatCapacity())
						{
							flight.setFlightStatus("FULL");
						}
						Date date = new Date(2017, 5, 31, 5, 00, 45);
						Order order2 = new Order("Pat", "10002", 0002, flight.getSeatNumber(), flight, date, "Paid", 2017, 6, 2);
						Data.ListOfOrder.add(order2);
						passenger.orderList.add(order2);
						flight.orderOfFlight.add(order2);
					}
				}
			}
			if (flight.getDepartureYear() == 2017 & flight.getFlightID().equals("A1018") & 
					flight.getDepartureMonth() == 6 &flight.getDepartureDate() == 3){
				for( Passenger passenger:Data.ListOfPassenger)
				{
					if( passenger.getPassengerID() == 0003 & passenger.getPassword().equals("Coco") )
					{
						flight.setCurrentPassengers(flight.getCurrentPassengers() + 1);
						if (flight.getCurrentPassengers() == flight.getSeatCapacity())
						{
							flight.setFlightStatus("FULL");
						}
						Date date = new Date(2017, 6, 1, 21, 20, 00);
						Order order3 = new Order("Coco", "10003", 0003, flight.getSeatNumber(), flight, date, "Paid", 2017, 6, 3);
						Data.ListOfOrder.add(order3);
						passenger.orderList.add(order3);
						flight.orderOfFlight.add(order3);
					}
				}
			}
		}
	}
}
