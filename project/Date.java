package project;
import java.util.Calendar;

public class Date 
{
	Calendar c = Calendar.getInstance();
	
	public int current_year = c.get(Calendar.YEAR);
	public int current_month = c.get(Calendar.MONTH); 
	public int current_date = c.get(Calendar.DATE); 
	public int current_hour = c.get(Calendar.HOUR_OF_DAY); 
	public int current_minute = c.get(Calendar.MINUTE);
	public int current_second = c.get(Calendar.SECOND); 
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
	public Date(int current_year, int current_month, int current_date, int current_hour, int current_minute, int current_second){
		this.current_year = current_year;
		this.current_month = current_month;
		this.current_date = current_date;
		this.current_hour = current_hour;
		this.current_minute = current_minute;
		this.current_second = current_second;
	}
	
}
