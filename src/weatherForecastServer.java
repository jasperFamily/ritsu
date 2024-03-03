import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Fairu.PrintWriter;

public class weatherForecastServer {
	
	static String[] wethers = { "晴れ","曇り","雨","晴れのち曇り","晴れのち雨","曇りのち晴れ"};
	
	public static void main(String[] args) {
		try {
		  ServerSocket serversocket = new ServerSocket(5000);
		  while (true) {
			  Socket socket = serversocket.accept();
			  PrintWriter writer = new PrintWriter(socket.getOutputStream());
			  
			  String weather = getWeatherForecaForecast();
			  writer.println(weather);
			  writer.close();
			  System.out.println("[" + weather + "] の予報を送りました");
		  }
			  
		  }catch (IOException e) {
		   System.out.println(e);
		   
		  }
		
		}
	static String getWeatherForecaForecast() {
		return wethers[(int) (Math.random() * wethers.length)];
	}
}

