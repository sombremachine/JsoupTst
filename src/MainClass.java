import bean.Weather;
import dao.WeatherDAOaccuweather;
import dao.WeatherDAOforeca;
import dao.WeatherDAOhmn;
import dao.weatherDAO;

public class MainClass {
    public static void main(String... args){
//        weatherDAO weather = new WeatherDAOforeca();
        weatherDAO weather = new WeatherDAOhmn();

        weather.getWeather();
    }
}
