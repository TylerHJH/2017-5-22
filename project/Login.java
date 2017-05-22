package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Login
{
	Scanner input = new Scanner( System.in );
	
	public void login()
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
					UsersLogin();//用户登录
					break;
				case '2':
					usersRegistration();//用户注册
					break;
				case '3':
					AdministratorLogin();//管理员登录
					break;
				case '4':
					//Directly Query Flight
					break;
				default:
					System.out.println("Your input is wrong" + "\nError, please enter 1, 2, 3 or 4.");
					isFalse = true;//输入有误，重新输入
			} 
		
		}while( isFalse );
	}
	//登录方法
	public void usersRegistration()
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
	public void UsersLogin()
	{
		while( true )
		{
			System.out.print("Please enter your passengerID:");
			int temp1 = input.nextInt();
			System.out.print("Please enter your password:");
			String temp2 = input.next();
			
			for( Passenger passenger:Data.ListOfPassenger)
			{
				if( passenger.getPassengerID() == temp1 && passenger.getPassword().equals(temp2) )
				{
					System.out.println("Login Successes");
					System.out.printf("1.queryFlight\n2.reserveFlight\n3.unsubscribeFlight\n");
					boolean isFalse = false;
					do
					{	
						System.out.print("Enter your choice:");
						char temp = input.next().charAt(0);
						
						switch ( temp )
						{
							case '1':
								//queryFlight
								break;
							case '2':
								//reserveFlight
								break;
							case '3':
								//unsubscribeFlight
								break;
							default:
								System.out.println("Your input is wrong" + "\nError, please enter 1, 2 or 3."
									+ "\n-----------------------------------------------------------------------");
							isFalse = true;//输入有误，重新输入
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
	//乘客登录
	public void AdministratorRegistration()
	{
		System.out.println("Newing a admin");
		System.out.print("Set a name for this admin:");
		String admin_name = input.next();
		System.out.print("Set a password for this admin:");
		String admin_password = input.next();
		
		Administrator administrator = new Administrator( admin_name, admin_password);
		Data.ListOfAdminstrator.add( administrator );
	}
	//管理员注册（管理员方法之一）
	public void AdministratorLogin()
	{
		while(true)
		{
			System.out.print("Please enter your admin name:");
			String temp1 = input.next();
			System.out.print("Please enter your admin password:");
			String temp2 = input.next();
		
			if( temp1.equals(Administrator.getSuperAdminName()) && temp2.equals(Administrator.getSuperAdminPassword()) )
			{
				System.out.println("Login Successes");
				//......
			}
			else
			{
				for( Administrator administrator:Data.ListOfAdminstrator )
				{
					if( administrator.getAdminName().equals(temp1) && administrator.getPassword().equals(temp2) )
					{
						System.out.println("Login Successes");
						//.......
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
	//管理员登录
}
