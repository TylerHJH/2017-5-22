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
			String temp1 = input.next();
			if( temp1.length() < 2 )
			{
				char temp2 = temp1.charAt(0);
				
				switch ( temp2 )
				{
					case '1':
						UsersLogin();//用户登录
						break;
					case '2':
						usersRegistration();//用户注册
						break;
					case '3':
						AdministratorLogin();//管理员登录
						break;
					case '4':
						Methods.queryFlight();
						System.out.print("\nIf you want to reserve flight, enter 1; If you want to query your order, enter 2; Enter 0 to quit");
						int choose = input.nextInt();
						switch(choose)
						{
							case 0:
								break;
							case 1:
								Methods.queryFlight();
								break;
							case 2:
								Methods.querymyOrder();
								break;
							default:
								break;
						}
						break;
					default:
						System.out.println("Your input is wrong" + "\nError, please enter 1, 2, 3 or 4.");
						isFalse = true;//输入有误，重新输入
				} 
				
					
			}
			
			else
				{
					System.out.println("Your input is wrong" + "\nError, please enter 1, 2, 3 or 4.");
					isFalse = true;
				}
			
		
		}while( isFalse );
	}
	//登录方法
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
	//乘客注册
	public static void UsersChoose()
	{
		System.out.printf("1.queryFlight\n2.reserveFlight\n3.unsubscribeFlight\n4.querymyOrder");
		boolean isFalse = false;
		do
		{	
			System.out.print("Enter your choice:");
			
			String temp3 = input.next();
			if( temp3.length() < 2 )
			{
				char temp4 = temp3.charAt(0);
				
				switch ( temp4 )
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
					isFalse = true;//输入有误，重新输入
				} 
			}
			else
			{
				System.out.println("Your input is wrong" + "\nError, please enter 1, 2 , 3 or 4."
						+ "\n-----------------------------------------------------------------------");
				isFalse = true;//输入有误，重新输入
			}
			
	
		}while( isFalse );
	}
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
				if( passenger.getPassengerID() == temp1 & passenger.getPassword().equals(temp2) )//匹配用户账号和密码
				{
					System.out.println("Login Successes");
					 UsersChoose();				
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
	//乘客登录
	public static void AdministratorRegistration()
	{
		System.out.println("Newing a admin");
		System.out.print("\nSet a name for this admin:");
		String admin_name = input.next();
		System.out.print("\nSet a password for this admin:");
		String admin_password = input.next();
		
		Administrator administrator = new Administrator( admin_name, admin_password);
		Data.ListOfAdminstrator.add( administrator );
		
		System.out.println();
		System.out.println("Registration End");
		System.out.println();
		login();
	}
	//管理员注册（管理员方法之一）
	public static void AdministratorChoose()
	{
		System.out.print("\n1.createFlight\n2.updateFlight\n3.deleteFlight\n4.superQuery\n5.userManagement\n6.Quit");
		do
		{	
			System.out.print("\nEnter your choice:");
			String temp3 = input.next();
			
			if( temp3.length() < 2 )
			{
				char temp4 = temp3.charAt(0);
				switch ( temp4 )
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
					//输入有误，重新输入
					break;
				} 

		
			}
		
			
			
		}while( true );
	}
	public static void AdministratorLogin()
	{
		while(true)
		{
			System.out.print("Please enter your admin name:");
			String temp1 = input.next();
			System.out.print("Please enter your admin password:");
			String temp2 = input.next();
		
			if(temp1.equals(Administrator.getSuperAdminName()) & temp2.equals(Administrator.getSuperAdminPassword()))
			{
				System.out.println("Login Successes");
				 AdministratorChoose();	
			}
			System.out.println("Your admin name or password are wrong.");
			System.out.printf("Enter anything except 0 to try again or enter 0 to go back");
			System.out.print("Enter your choice:");
			String temp3 = input.next();
			if( temp3.length() < 2)
			{
				char temp4 = temp3.charAt(0);
				if( temp4 == '0' )
				{
					login();
				}
			}
		}
			
	}
	//管理员登录
}

