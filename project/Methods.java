package project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class Methods 
{
	public static void createFlight()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Newing a flight");
		System.out.print("\nSet the flightID:");
		String flightID = input.next();
		System.out.print("\nSet the startHour:");
		int startHour = input.nextInt();
		System.out.print("\nSet the startMinute:");
		int startMinute = input.nextInt();
		System.out.print("\nSet the arrivalHour:");
		int arrivalHour = input.nextInt();
		System.out.print("\nSet the arrivalMinute:");
		int arrivalMinute = input.nextInt();
		System.out.print("\nSet the startCity:");
		String startCity = input.next();
		System.out.print("\nSet the arrivalCity:");
		String arrivalCity = input.next();
		System.out.print("\nSet the departureYear:");
		int departureYear = input.nextInt();
		System.out.print("\nSet the departureMonth:");
		int departureMonth = input.nextInt();
		System.out.print("\nSet the departureDate:");
		int departureDate = input.nextInt();
		System.out.print("\nSet the price:");
		int price = input.nextInt();
		System.out.print("\nSet the currentPassengers:");
		int currentPassengers = input.nextInt();
		System.out.print("\nSet the seatCapacity:");
		int seatCapacity = input.nextInt();
		System.out.print("\nSet the flightStatus:");
		String flightStatus = input.next();
		Flight flight = new Flight(flightID, startHour, startMinute, arrivalHour, arrivalMinute, startCity, arrivalCity,departureYear
				, departureMonth, departureDate, price, currentPassengers, seatCapacity, flightStatus);
		Data.ListOfFlight.add( flight );
		Login.AdministratorChoose();
	}
	//创建航班，管理员功能
	public static void updateFlight()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Updating a flight");
		System.out.print("\nPlease enter the flightID:");
		String temp3 = input.next();
		System.out.print("\nPlease enter the departmentYear:");
		int temp4 = input.nextInt();
		System.out.print("\nPlease enter the departmentMonth:");
		int temp5 = input.nextInt();
		System.out.print("\nPlease enter the departmentDate:");
		int temp6 = input.nextInt();
		for (Flight flight1 : Data.ListOfFlight)
		{
			if (flight1.getFlightID().equals(temp3) & flight1.getDepartureYear() == temp4 &
					flight1.getDepartureMonth() == temp5 & flight1.getDepartureDate() == temp6)
			{
				if (flight1.getFlightStatus().equals("Unpublished"))
				{
					String choose1;
					int choose4;
					do
					{
							System.out.print("\nPlease choose the message you want to update or enter 0 to quit: ");
						System.out.print("\n1.flightID  2.startHour  3.startMinute  4.arrivalHour  5.arrivalMinute  6.startCity");
						System.out.print("\n7.arrivalCity  8.departureYear  9.departureMonth  10.departureDate");
						System.out.print("\n11.price  12.currentPassengers  13.seatCapacity  14.flightStatus");
						choose1 = input.next();
						
							char choose2 = choose1.charAt(0);
							char choose3 = choose1.charAt(1);
							if(choose1.length() < 2)
							{			
								if(choose2 == '0')
								{
									break;
								}
							}
							switch(choose2)
							{
								case '1':
									if(choose3 == '0')
									{
										flight1.setDepartureDate(input.nextInt());
										break;
									}
									if(choose3 == '1')
									{
										flight1.setPrice(input.nextInt());
										break;
									}
									if(choose3 == '2')
									{
										flight1.setCurrentPassengers(input.nextInt());
										break;
									}
									if(choose3 == '3')
									{
										flight1.setSeatCapacity(input.nextInt());
										break;
									}
									if(choose3 == '4')
									{
										flight1.setFlightStatus(input.next());
										break;
									}
									if(choose3 == ' ')
									{
										flight1.setFlightID(input.next());
									break;									
									}
									System.out.println("Please enter a number between 0 to 14.");
									break;
								case '2':
									flight1.setStartHour(input.nextInt());
									break;
								case '3':
									flight1.setStartMinute(input.nextInt());
									break;
								case '4':
									flight1.setArrivalHour(input.nextInt());
									break;
								case '5':
									flight1.setArrivalMinute(input.nextInt());
									break;
								case '6':
									flight1.setStartCity(input.next());
									break;
								case '7':
									flight1.setArrivalCity(input.next());
									break;
								case '8':
									flight1.setDepartureYear(input.nextInt());
									break;
								case '9':
									flight1.setDepartureMonth(input.nextInt());
									break;
								default:
									System.out.print("\nPlease enter a correct number between 0 to 14: ");
									break;
							}
							System.out.println("If you don't want to update other message, enter 0 to go back. Or enter any other numbers to continue.");
							System.out.print("Your choice is:");
							  choose4 = input.nextInt();
							 												
					}while(choose4 != 0);
					Login.AdministratorChoose();
				}
				else
				{
					System.out.print("\nYou can't upadte it because the flight is published.");
					Login.AdministratorChoose();
				}
			}
		}
		System.out.println("Can't find the correct flight.");
		Login.AdministratorChoose();
		
	}
	//修改航班，管理员功能
	public static void deleteFlight()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Deleting a Flight.");
		System.out.print("\nPlease enter the flightID you want to delete:");
		String deleteID = input.next();
		System.out.print("\nPlease enter the departmentYear");
		int deleteYear = input.nextInt();
		System.out.print("\nPlease enter the departmentMonth");
		int deleteMonth = input.nextInt();
		System.out.print("\nPlease enter the departmentDate");
		int deleteDate = input.nextInt();
		int count = 0;
		for (Flight flight1 : Data.ListOfFlight){
			if (flight1.getFlightID().equals(deleteID) & flight1.getDepartureYear() == deleteYear &
					flight1.getDepartureMonth() == deleteMonth & flight1.getDepartureDate() == deleteDate){
				if (flight1.getFlightStatus().equals("Avaliable")|flight1.getFlightStatus().equals("Full")){
					System.out.print("\nYou can't delete this Flight in 'Avaliable' or 'Full' status.");
					Login.AdministratorChoose();
				}
				else{
					System.out.print("\nPlease enter Y to delete or N to quit: ");
					String isdelete = input.next();
					if(isdelete.equals("Y")){
						Data.ListOfFlight.remove(count);
						System.out.println("Removing success.");
						Login.AdministratorChoose();
						}
						count+=1;
					}
				}
			}
		System.out.println("Can't find the correct flight.");
		Login.AdministratorChoose();
		}
	//删除航班，管理员功能
	public static void userManagement()
	{
		while(true)
		{
			System.out.print("Please enter a number to choose method or enter 0 to quit: \n1.UpdateAdministrator\n2.CreateAdministrator");
			Scanner input = new Scanner(System.in);
		    String choose1 = input.next();
		    if( choose1.length() < 2)
			{
		    	char choose2 = choose1.charAt(0);
			    switch(choose2)
				{
					case '0':
						Login.AdministratorChoose();
						break;
					case '1':
						System.out.print("Updating an Administrator.");
						System.out.print("\nPlease enter the Administratorname and password you want to update:");
						String adminName = input.next();
						String password1 = input.next();
						for (Administrator admin : Data.ListOfAdminstrator)
						{
							if (admin.getAdminName().equals(adminName)&admin.getPassword().equals(password1))
							{
								do{
								System.out.print("\nPlease enter the number of you want to update or enter 0 to quit:\n1.Administrator name\n2.Password");
								String choose3 = input.next();
								if(choose3.length() < 2)
								{
									char choose4 = choose3.charAt(0);
									switch(choose4)
									{
										case '0':
											Login.AdministratorChoose();
										case '1':
											System.out.print("\nPlease enter the new name:");
											admin.setAdminName(input.next());
											break;
										case '2':
											System.out.print("\nPlease enter the new password:");
											admin.setPassword(input.next());
											break;
										default:
											System.out.print("\nPlease enter a correct number.");
											break;
			
										}
								}
								}while(true);
							}
						}
						System.out.print("The Administrator name or the password is wrong.");
						break;
					case '2':
						System.out.print("Creating a new Administrator.");
						System.out.print("\nPlease enter new Administrator's name:");
						String adminname = input.next();
						System.out.print("\nPlease enter new Administrator's password:");
						String password2 = input.next();
						Administrator admin = new Administrator(adminname, password2);
						Data.ListOfAdminstrator.add(admin);
						break;
					default:
						System.out.print("\nPlease enter a correct number.");
						break;
				}
			}    
		}
	}
	//管理员信息，管理员功能
	public static void queryFlight()
	{
		Flight.initializeFlightData();
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Querying flights.");
			System.out.print("\nPlease choose a way to query or enter 0 to quit:"
					+ "\n1.Query with start city, arrival city and departmentdate\n2.Query with flightID");
			String choose = input.next();
			if( choose.length() < 2)
			{
				char choose1 = choose.charAt(0);
				switch(choose1)
				{
					
					case '0':
						Login.AdministratorChoose();
						break;
					case '1':
						System.out.print("\nPlease enter the start city:");
						String startCity = input.next();
						System.out.print("\nPlease enter the arrival city:");
						String arrivalCity = input.next();
						System.out.print("\nPlease enter the departmentYear:");
						int departmentYear = input.nextInt();
						System.out.print("\nPlease enter the departmentMonth:");
						int departmentMonth = input.nextInt();
						System.out.print("\nPlease enter the departmentDate:");
						int departmentDate = input.nextInt();
						for (Flight flight : Data.ListOfFlight)
						{
							if(flight.getStartCity().equals(startCity)&flight.getArrivalCity().equals(arrivalCity)&
									flight.getDepartureYear() == departmentYear & flight.getDepartureMonth() == departmentMonth &
									flight.getDepartureDate() == departmentDate)
							{
								System.out.println(flight.getFlightID().toString() + " "+flight.getPrice() +" "+ flight.getFlightStatus().toString());
							}
						}
						break;
					case '2':
						System.out.print("\nPlease enter the flightID:");
						String flightID = input.next();
						boolean exist = true;
						for (Flight flight : Data.ListOfFlight)
						{
							if (flight.getFlightID().equals(flightID))
							{

								System.out.println(flight.getFlightID() + flight.getPrice() + flight.getFlightStatus());
								exist = false;
								System.out.println("if you want to go back, enter 0, or enter 1 to enter reserve steps.");
								while(true)
								{
									String choose3 = input.next();
									if(choose3.length() <2)
									{
										char choose4 = choose3.charAt(0);
										switch( choose4 )
										{
											case'0':
												Login.UsersChoose();
												break;
											case'1':
												reserveFlight();
												break;
												
										}
									}
								}
							}
						
						}
						if(exist)
						{
							System.out.println("Not exist");
						}
						
						break;
					default:
						System.out.print("\nPlease enter a correct number.");
						break;
						
				}
				System.out.println("Querying end.");
				Login.UsersChoose();
			}
			System.out.println("Your input is wrong.");
		}
		
	}
	
	public static void directlyQueryFlight()
	{
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Querying flights.");
			System.out.print("\nPlease choose a way to query or enter 0 to quit:"
					+ "\n1.Query with start city, arrival city and departmentdate\n2.Query with flightID");
			String choose = input.next();
			if( choose.length() < 2)
			{
				char choose1 = choose.charAt(0);
				switch(choose1)
				{
					
					case '0':
						Login.login();;
						break;
					case '1':
						System.out.print("\nPlease enter the start city:");
						String startCity = input.next();
						System.out.print("\nPlease enter the arrival city:");
						String arrivalCity = input.next();
						System.out.print("\nPlease enter the departmentYear:");
						int departmentYear = input.nextInt();
						System.out.print("\nPlease enter the departmentMonth:");
						int departmentMonth = input.nextInt();
						System.out.print("\nPlease enter the departmentDate:");
						int departmentDate = input.nextInt();
						boolean exist = true;
						for (Flight flight : Data.ListOfFlight)
						{
							if(flight.getStartCity().equals(startCity)&flight.getArrivalCity().equals(arrivalCity)&
									flight.getDepartureYear() == departmentYear & flight.getDepartureMonth() == departmentMonth &
									flight.getDepartureDate() == departmentDate)
							{
								
								System.out.println(flight.getFlightID().toString() + flight.getPrice() + flight.getFlightStatus().toString());
								exist = false;

							}
						}
						if(exist)
						{
							System.out.println("Not exist");
						}
			
						break;
					case '2':
						System.out.print("\nPlease enter the flightID:");
						String flightID = input.next();
						 exist = true;
						for (Flight flight : Data.ListOfFlight)
						{
							if (flight.getFlightID().equals(flightID))
							{
								System.out.println(flight.getFlightID() + flight.getPrice() + flight.getFlightStatus());
								exist = false;
							}	
						}
						if(exist)
						{
							System.out.println("Not exist");
						}
						break;
					default:
						System.out.print("\nPlease enter a correct number.");
						break;
						
				}
				System.out.println("Querying end.");
				Login.login();
				
			}
			System.out.println("Your input is wrong.");
		}
		
	}
	//查询航班
	public static void reserveFlight()
	{       
		Calendar c = Calendar.getInstance();
		Scanner input = new Scanner(System.in);
		System.out.println("Reserving flight.");
		System.out.print("Please enter your passengerID:");
		int passengerID = input.nextInt();
		System.out.print("Please enter your password:");
		String password = input.next();
		System.out.print("Please enter your realname:");
		String passengerName = input.next();
		System.out.print("Please enter your identityID:");
		String identityID = input.next();
		for( Passenger passenger:Data.ListOfPassenger)
		{
			if( passenger.getPassengerID() == passengerID & passenger.getPassword().equals(password) )
			{
				System.out.println("Please enter the start city: ");
				String startCity = input.next();
				System.out.println("Please enter the arrival city: ");
				String arrivalCity = input.next();
				System.out.print("\nPlease enter the departmentYear");
				int temp1 = input.nextInt();
				System.out.print("\nPlease enter the departmentMonth:");
				int temp2 = input.nextInt();
				System.out.print("\nPlease enter the departmentDate:");
				int temp3 = input.nextInt();
				System.out.print("\nDo you want to reserve round-trip flights? Enter 'Y' for yes, 'N' for no:");
				String roundTrip=input.next();
				for (Flight flight : Data.ListOfFlight){
						if (flight.getDepartureYear() == temp1 & flight.getStartCity().equals(startCity) & 
						flight.getDepartureMonth() == temp2 &flight.getDepartureDate() == temp3 &
						flight.getArrivalCity().equals(arrivalCity))
					    {
							if (flight.getFlightStatus().equals("Avaliable")){
								System.out.println("Please pay for the ticket, enter Y to pay, or N to quit:");
								String pay = input.next();
								if (pay.equals("Y")){
									System.out.println("Reserve success.");
									flight.setCurrentPassengers(flight.getCurrentPassengers() + 1);
									if (flight.getCurrentPassengers() == flight.getSeatCapacity())
									{
										flight.setFlightStatus("Full");
									}
									Date date = new Date(c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DATE),
											c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
								
									Order order = new Order(passengerName, identityID, passengerID, flight.getSeatNumber(), flight,
											date, "Paid" , temp1, temp2, temp3);
									//(乘客名称，身份证号，乘客ID，座位号，航班号， 时间，状态 , 起飞年月日)

									Data.ListOfOrder.add(order);
									passenger.orderList.add(order);
									flight.orderOfFlight.add(order);
									Login.UsersChoose();
								}	
								else{
									Login.UsersChoose();
								}
							}
								System.out.println("This flight is full");
								Login.UsersChoose();
					}
			if(roundTrip=="Y"){
					System.out.print("\nPlease enter the departmentYear");
					int temp4 = input.nextInt();
					System.out.print("\nPlease enter the departmentMonth");
					int temp5 = input.nextInt();
					System.out.print("\nPlease enter the departmentDate");
					int temp6 = input.nextInt();
					if (flight.getDepartureYear() == temp4 & flight.getStartCity().equals(arrivalCity) & 
							flight.getDepartureMonth() == temp5 &flight.getDepartureDate() == temp6 &
							flight.getArrivalCity().equals(startCity))
						    {
								if (flight.getFlightStatus().equals("Avaliable")){
									System.out.println("Please pay for the ticket, enter Y to pay, or N to quit:");
									String pay = input.next();
									if (pay.equals("Y")){
										System.out.println("Reserve success.");
										flight.setCurrentPassengers(flight.getCurrentPassengers() + 1);
										if (flight.getCurrentPassengers() == flight.getSeatCapacity())
										{
											flight.setFlightStatus("Full");
										}
										Date date = new Date(c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DATE),
												c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
									
										Order order = new Order(passengerName, identityID, passengerID, flight.getSeatNumber(), flight,
												date, "Paid" , temp1, temp2, temp3);
										//(乘客名称，身份证号，乘客ID，座位号，航班号， 时间，状态 , 起飞年月日)
										
										Data.ListOfOrder.add(order);
										passenger.orderList.add(order);
										flight.orderOfFlight.add(order);
										Login.UsersChoose();
									}	
									else{
										Login.UsersChoose();
									}
								}
									System.out.println("This flight is full");
									Login.UsersChoose();
						}
					    }}
						System.out.println("Can't find the correct flight!");
						Login.UsersChoose();
			}
            }
				System.out.println("The passenger name or the password is wrong.");
		        Login.UsersChoose();
	}
	//预定航班
	
	public static void querymyOrder()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your passengerID:");
		int passengerID = input.nextInt();
		System.out.print("Please enter your password:");
		String password = input.next();
		System.out.print("Please enter your realname:");
		String passengerName = input.next();
		for( Passenger passenger:Data.ListOfPassenger)
		{
			if( passenger.getPassengerID() == passengerID & passenger.getPassword().equals(password) )
			{
				System.out.println("List your orders:");
					for (Order order : Data.ListOfOrder)
					{
						if (order.getpassengerName().equals(passengerName))
						{
							Order.displayMyOrderInformation(order);
							Login.UsersChoose();
						}
					}
					System.out.print("You hava entered your name wrong");
					Login.UsersChoose();
				}
			}
		System.out.print("Your password wrong");
		Login.UsersChoose();
	}

	public static void unsubscribeFlight()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Unsubscribing flight.");
		System.out.print("Please enter your passengerID:");
		int passengerID = input.nextInt();
		System.out.print("Please enter your password:");
		String password = input.next();
		for( Passenger passenger:Data.ListOfPassenger)
		{
			if( passenger.getPassengerID() == passengerID & passenger.getPassword().equals(password) )
			{
				System.out.println("Please enter the flightID: ");
				String flightID = input.next();
				System.out.print("\nPlease enter the departmentYear:");
				int temp1 = input.nextInt();
				System.out.print("\nPlease enter the departmentMonth:");
				int temp2 = input.nextInt();
				System.out.print("\nPlease enter the departmentDate:");
				int temp3 = input.nextInt();
				for (Flight flight : Data.ListOfFlight){
					if (flight.getDepartureYear() == temp1 & flight.getFlightID().equals(flightID) & 
						flight.getDepartureMonth() == temp2 &flight.getDepartureDate() == temp3)
					{
						for (Order order : Data.ListOfOrder){
							if (order.getFlight().equals(flight)){
								flight.seatnumber.remove(flight.getSeatNumber());
								flight.seatnumber.add(flight.getSeatNumber(), false);
								flight.setCurrentPassengers(flight.getCurrentPassengers() - 1);
								flight.setFlightStatus("Avaliable");
								passenger.orderList.remove(order);
								flight.orderOfFlight.remove(order);
								Data.ListOfOrder.remove(order);
								System.out.println("Unsubscribing success!");
								Login.UsersChoose();
							}
						}
					}	
				}
				System.out.println("Can't find the correct flight.");
					Login.UsersChoose();
			}
		}
		System.out.println("The passenger name or the password is wrong.");
			Login.UsersChoose();	
	}

	public static void superQuery()
	{
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Superquerying");
			System.out.println("Please choose a method to query or enter 0 to go back:\n1.Query orderlist\n2.Query order of a flight\n3.Query flight.");
			String choose = input.next();
			if(choose.length() < 2)
			{
				char choose1 = choose.charAt(0);
				switch(choose1)
				{
					case'0':
						Login.AdministratorChoose();
						break;									
					case '1':
						System.out.print("Please enter the flightID");
						String flightID1 = input.next();
						if (Order.flight.getFlightID().equals(flightID1))
							{
								Order.displayOrderOfFlight(Order.flight);
							}
							else{
								System.out.println("No orders!");
							}
						break;
					case '2':
						System.out.print("Please enter the flightID");
						String flightID = input.next();
						System.out.print("\nPlease enter the departmentYear:");
						int temp1 = input.nextInt();
						System.out.print("\nPlease enter the departmentMonth:");
						int temp2 = input.nextInt();
						System.out.print("\nPlease enter the departmentDate:");
						int temp3 = input.nextInt();
						for (Flight flight : Data.ListOfFlight){
							if (flight.getDepartureYear() == temp1 & flight.getFlightID().equals(flightID) & 
									flight.getDepartureMonth() == temp2 &flight.getDepartureDate() == temp3){
								Order.displayOrderOfFlight( flight);
							}
						}
						break;
					case '3':
						queryFlight();
						break;
					default:
						System.out.println("Your enter is wrong. Please enter 1, 2 or 3, or enter 0 to go back.");
						break;
				}
			}
		}
	}
	public static void checkTime(Flight flight){
		Calendar c = Calendar.getInstance();
		
	}
	
}
