package project;

public class Start {

    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Login start = new Login();
		Flight.initializeFlightData();
		start.login();
		
		//开始运行操作服务平台
	}

}
