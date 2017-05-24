package project;

import java.util.Scanner;

public class Login {
	static Scanner  input = new Scanner( System.in );
	
	public static void login()
	{
		System.out.println("-------------------------------------------------");
		System.out.println("Welcome to the service platform.");
		System.out.println("-------------------------------------------------");
		System.out.printf("1.Users Login\n2.Users Registration \n3.Administrator Login \n4.Directly Query Flight\n");
		
		boolean isFalse = false;
		do
		{	
			System.out.print("Enter your choice:");
			char temp = input.next().charAt(0);
			switch ( temp )
			{
				case '1':
					UsersLogin();//�û���¼
					break;
				case '2':
					usersRegistration();//�û�ע��
					break;
				case '3':
					AdministratorLogin();//����Ա��¼
					break;
				case '4':
					//Directly Query Flight
					break;
				default:
					System.out.println("Your input is wrong" + "\nError, please enter 1, 2, 3 or 4.");
					isFalse = true;//����������������
			} 
		
		}while( isFalse );
	}
	//��¼����
	public static void usersRegistration()
	{
		System.out.print("Please enter your passengerID numbers:");
		int passenger_id = input.nextInt();
		System.out.print("Please enter your real name:");
		String real_name = input.next();
		System.out.print("Please enter your identityID:");
		String identity_ID = input.next();
		System.out.print("Please enter your password:");
		String pass_word = input.next();
		
		Passenger passenger = new Passenger(passenger_id, real_name, identity_ID, pass_word);
		Data.ListOfPassenger.add( passenger );
		
		System.out.println();
		System.out.println("Registration End");
		System.out.println();
		login();
	}
	//�˿�ע��
	public static void UsersLogin()
	{
		while( true )
		{
			System.out.print("Please enter your passengerID:");
			int temp1 = input.nextInt();
			System.out.print("Please enter your password:");
			String temp2 = input.next();
			
			for( Passenger passenger:Data.ListOfPassenger)
			{
				if( passenger.getPassengerID() == temp1 & passenger.getPassword().equals(temp2) )
				{
					System.out.println("Login Successes");
					System.out.printf("1.queryFlight\n2.reserveFlight\n3.unsubscribeFlight\n4.querymyOrder");
					boolean isFalse = false;
					do
					{	
						System.out.print("Enter your choice:");
						char temp = input.next().charAt(0);
						
						switch ( temp )
						{
							case '1':
								Methods.queryFlight();
								break;
							case '2':
								Methods.reserveFlight();
								break;
							case '3':
								Methods.unsubscribeFlight();
								break;
							case '4':
								Methods.querymyOrder();
								break;
							default:
								System.out.println("Your input is wrong" + "\nError, please enter 1, 2 , 3 or 4."
									+ "\n-----------------------------------------------------------------------");
							isFalse = true;//����������������
						} 
				
					}while( isFalse );
				
				}
			
			}
			System.out.println("Your PassengerID or Passeword are wrong.");
			System.out.printf("Enter anything except 0 to try again or enter 0 to go back");
			System.out.print("Enter your choice:");
			String temp = input.next();
			if(temp.equals("0"))
			{
				login();
			}
		}
	}
	//�˿͵�¼
	public static void AdministratorRegistration()
	{
		System.out.println("Newing a admin");
		System.out.print("\nSet a name for this admin:");
		String admin_name = input.next();
		System.out.print("\nSet a password for this admin:");
		String admin_password = input.next();
		
		Administrator administrator = new Administrator( admin_name, admin_password);
		Data.ListOfAdminstrator.add( administrator );
	}
	//����Աע�ᣨ����Ա����֮һ��
	public static void AdministratorLogin()
	{
		while(true)
		{
			System.out.print("Please enter your admin name:");
			String temp1 = input.next();
			System.out.print("Please enter your admin password:");
			String temp2 = input.next();
		
			if( temp1.equals(Administrator.getSuperAdminName()) & temp2.equals(Administrator.getSuperAdminPassword()) )
			{
				System.out.println("Login Successes");
				System.out.print("\n1.createFlight\n2.updateFlight\n3.deleteFlight\n4.superQuery\n5.userManagement\n6.Quit");
				do
				{	
					System.out.print("\nEnter your choice:");
					char temp = input.next().charAt(0);
					
					switch ( temp )
					{
						case '1':
							Methods.createFlight();
							break;
						case '2':
							Methods.updateFlight();
							break;
						case '3':
							Methods.deleteFlight();
							break;
						case '4':
							Methods.superQuery();
							break;
						case '5':
							Methods.userManagement();
							break;
						case '6':
							login();
							break;
						default:
							System.out.println("\nYour input is wrong" + "\nError, please enter 1, 2, 3, 4, 5 or 6:"
								+ "\n-----------------------------------------------------------------------");
						//����������������
						break;
					} 
			
				}while( true );
			}
			else
			{
				for( Administrator administrator:Data.ListOfAdminstrator )
				{
					if( administrator.getAdminName().equals(temp1) && administrator.getPassword().equals(temp2) )
					{
						System.out.println("Login Successes");
						System.out.print("\n1.createFlight\n2.updateFlight\n3.deleteFlight\n4.superQuery\n5.userManagement\n6.Quit");
						do
						{	
							System.out.print("\nEnter your choice:");
							char temp = input.next().charAt(0);
							
							switch ( temp )
							{
								case '1':
									Methods.createFlight();
									break;
								case '2':
									Methods.updateFlight();
									break;
								case '3':
									Methods.deleteFlight();
									break;
								case '4':
									Methods.superQuery();
									break;
								case '5':
									Methods.userManagement();
									break;
								case '6':
									login();
									break;
								default:
									System.out.println("\nYour input is wrong" + "\nError, please enter 1, 2, 3, 4, 5 or 6:"
										+ "\n-----------------------------------------------------------------------");
								//����������������
								break;
							} 
					
						}while( true );
					}
				}
			}
			System.out.println("Your admin name or password are wrong.");
			System.out.printf("Enter anything except 0 to try again or enter 0 to go back");
			System.out.print("Enter your choice:");
			String temp = input.next();
			if(temp.equals("0"))
			{
				login();
			}
		}
			
	}
	//����Ա��¼
}

