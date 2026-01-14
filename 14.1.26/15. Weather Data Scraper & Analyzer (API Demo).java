import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WeatherAPI {
    public static void main(String[] args) throws Exception {
        String city = "London";
        String apiKey = "YOUR_API_KEY"; // Replace with OpenWeatherMap key
        String urlStr = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+apiKey+"&units=metric";
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        Scanner sc = new Scanner(conn.getInputStream());
        while (sc.hasNext()) System.out.println(sc.nextLine());
        sc.close();
    }
}
