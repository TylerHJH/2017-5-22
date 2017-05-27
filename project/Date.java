package project;

public class Date 
{
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minite;
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getDay() 
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getHour() 
	{
		return hour;
	}
	public void setHour(int hour) 
	{
		this.hour = hour;
	}
	public int getMinite() 
	{
		return minite;
	}
	public void setMinite(int minite) 
	{
		this.minite = minite;
	}
	public Date(int year, int month, int day, int hour, int minite) 
	{
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minite = minite;
	}
	
	
}
