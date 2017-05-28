package project;

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
	public void displayOrderOfFlight(Flight flight){
		System.out.printf("%s%10s%10d%10s%10s\n", order.passengerName, order.identityID, order.seat, order.createTime.toString(), order.status);
	}
	
	
}
