package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
	public static void createFlight(){
		Scanner input = new Scanner(System.in);
		System.out.println("Newing a flight");
		System.out.print("\nSet the flightID:");
		String flightID = input.next();
		System.out.print("\nSet the startTime:");
		String startTime = input.next();
		System.out.print("\nSet the arrivalTime:");
		String arrivalTime = input.next();
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
		Flight flight = new Flight(flightID, startTime, arrivalTime, startCity, arrivalCity,departureYear
				, departureMonth, departureDate, price, currentPassengers, seatCapacity, flightStatus);
		Data.ListOfFlight.add( flight );
		
	}
	//�������࣬����Ա����
	public static void updateFlight(){
		Scanner input = new Scanner(System.in);
		System.out.println("Updating a flight");
		System.out.print("\nPlease enter the flightID");
		String temp3 = input.next();
		System.out.print("\nPlease enter the departmentYear");
		int temp4 = input.nextInt();
		System.out.print("\nPlease enter the departmentMonth");
		int temp5 = input.nextInt();
		System.out.print("\nPlease enter the departmentDate");
		int temp6 = input.nextInt();
		for (Flight flight1 : Data.ListOfFlight){
			if (flight1.getFlightID().equals(temp3) & flight1.getDepartureYear() == temp4 &
					flight1.getDepartureMonth() == temp5 & flight1.getDepartureDate() == temp6){
				if (flight1.getFlightStatus().equals("Unpublished")){
					int choose;
					do{
						System.out.print("\nPlease choose the message you want to update or enter 0 to quit: ");
					System.out.print("\n1.flightID  2.startTime  3.arrivalTime  4.startCity");
					System.out.print("\n5.arrivalCity  6.departureYear  7.departureMonth  8.departureDate");
					System.out.print("\n9.price  10.currentPassengers  11.seatCapacity  12.flightStatus");
					choose = input.nextInt();
					if(choose == 0){
						break;
					}
					switch(choose){
						case 1:
							flight1.setFlightID(input.next());
							break;
						case 2:
							flight1.setStartTime(input.next());
							break;
						case 3:
							flight1.setArrivalTime(input.next());
							break;
						case 4:
							flight1.setStartCity(input.next());
							break;
						case 5:
							flight1.setArrivalCity(input.next());
							break;
						case 6:
							flight1.setDepartureYear(input.nextInt());
							break;
						case 7:
							flight1.setDepartureMonth(input.nextInt());
							break;
						case 8:
							flight1.setDepartureDate(input.nextInt());
							break;
						case 9:
							flight1.setPrice(input.nextInt());
							break;
						case 10:
							flight1.setCurrentPassengers(input.nextInt());
							break;
						case 11:
							flight1.setSeatCapacity(input.nextInt());
							break;
						case 12:
							flight1.setFlightStatus(input.next());
							break;
						default:
							System.out.print("\nPlease enter a correct number between 0 to 12: ");
							break;
					}
					System.out.print("If you don't want to update other message, enter 0.Or enter any other numbers:");
					choose = input.nextInt();
					}while(choose != 0);
				}else{
					System.out.print("\nYou can't upadte it because the flight is published.");
					break;}
			}
			
		}
	}
	//�޸ĺ��࣬����Ա����
	public static void deleteFlight(){
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
					break;
				}
				else{
					System.out.print("\nPlease enter Y to delete or N to quit: ");
					String isdelete = input.next();
					if(isdelete.equals("Y")){
						Data.ListOfFlight.remove(count);
						break;
						}
						count+=1;
					}
				}
			}
		}
	//ɾ�����࣬����Ա����
	public static void userManagement(){
		System.out.print("Please enter a number to choose method or enter 0 to quit: \n1.UpdateAdministrator\n2.CreateAdministrator");
		Scanner input = new Scanner(System.in);
		int choose1 = input.nextInt();
		switch(choose1){
			case 0:
				break;
			case 1:
				System.out.print("Updating an Administrator.");
				System.out.print("\nPlease enter the Administratorname and password you want to update:");
				String adminName = input.next();
				String password1 = input.next();
				for (Administrator admin : Data.ListOfAdminstrator){
					if (admin.getAdminName().equals(adminName)&admin.getPassword().equals(password1)){
						System.out.print("\nPlease enter the number of you want to update:\n1.Administrator name\n2.Password");
						int choose2 = input.nextInt();
						switch(choose2){
							case 1:
								System.out.print("\nPlease enter the new name:");
								admin.setAdminName(input.next());
								break;
							case 2:
								System.out.print("\nPlease enter the new password:");
								admin.setPassword(input.next());
								break;
						}
						break;
					}
					else{
						System.out.print("The Administrator name or the password is wrong.");
						break;
					}
				}
				break;
			case 2:
				System.out.print("Creating a new Administrator.");
				System.out.print("\nPlease enter new Administrator's name:");
				String adminname = input.next();
				System.out.print("\nPlease enter new Administrator's password:");
				String password2 = input.next();
				Administrator admin = new Administrator(adminname, password2);
				Data.ListOfAdminstrator.add(admin);
				break;
			default:
				break;
		}
	}
	//����Ա��Ϣ������Ա����
	public static void queryFlight(){
		Scanner input = new Scanner(System.in);
		System.out.print("Querying flights.");
		System.out.print("\nPlease choose a way to query or enter 0 to quit:"
				+ "\n1.Query with start city, arrival city and departmentdate\n2.Query with flightID");
		int choose = input.nextInt();
		switch(choose){
			case 0:
				break;
			case 1:
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
				for (Flight flight : Data.ListOfFlight){
					if(flight.getStartCity().equals(startCity)&flight.getArrivalCity().equals(arrivalCity)&
							flight.getDepartureYear() == departmentYear & flight.getDepartureMonth() == departmentMonth &
							flight.getDepartureDate() == departmentDate){
						System.out.println(flight.getFlightID().toString() + flight.getPrice() + flight.getFlightStatus().toString());
					}
				}
				break;
			case 2:
				System.out.print("\nPlease enter the flightID:");
				String flightID = input.next();
				for (Flight flight : Data.ListOfFlight){
					if (flight.getFlightID().equals(flightID)){
						System.out.println(flight.getFlightID().toString() + flight.getPrice() + flight.getFlightStatus().toString());
					}
				}
				break;
		}
	}
	//��ѯ����
	public static void reserveFlight(){         Login login = new Login();
		Scanner input = new Scanner(System.in);
		System.out.println("Reserving flight.");
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
				System.out.println("Please enter the flightID: ");
				String flightID = input.next();
				System.out.print("\nPlease enter the departmentYear");
				int temp1 = input.nextInt();
				System.out.print("\nPlease enter the departmentMonth");
				int temp2 = input.nextInt();
				System.out.print("\nPlease enter the departmentDate");
				int temp3 = input.nextInt();
				for (Flight flight : Data.ListOfFlight){
					if (flight.getDepartureYear() == temp1 & flight.getFlightID().equals(flightID) & 
						flight.getDepartureMonth() == temp2 &flight.getDepartureDate() == temp3){
							if (flight.getFlightStatus().equals("Avaliable")){
								System.out.println("Please pay for the ticket, enter Y to pay, or N to quit:");
								String pay = input.next();
								if (pay.equals("Y")){
									System.out.println("Reserve success.");
									flight.setCurrentPassengers(flight.getCurrentPassengers() + 1);
									Date date = new Date();
									Order order = new Order(passengerID, passengerName, order.getSeat() + 1, flight.getFlightID(), , "Paid");
									(�˿�����������֤����λ�ţ�ʱ�䣬״̬)
									order.setSeat(order.getSeat() + 1);
									Data.ListOfOrder.add(order);
									passenger.orderList.add(order);
									flight.passengerOfFlight.add(order);
								}	
								else{
									break;
								}
							}
							break;
					}
				}
			}
		}
	}
	
	public static void unsubscribeFlight(){
		
	}
	
	public static void superQuery(){
		Scanner input = new Scanner(System.in);
		System.out.println("Superquerying");
		System.out.println("Please choose a method to query:\n1.Query orderlist\n2.Query order of a flight\n3.Query flight.");
		int choose = input.nextInt();
		switch(choose){
			case 1:
				for(Order order : Data.ListOfOrder){
					System.out.print(order.toString());
				}
				break;
			case 2:
				
				break;
			case 3:
				queryFlight();
				break;
			default:
				System.out.println("Your enter is wrong. Please enter 1, 2 or 3.");
				break;
		}
	}
	
	public String toString(ArrayList order){
		
	}
}