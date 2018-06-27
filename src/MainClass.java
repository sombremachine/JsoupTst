import bean.Weather;
import dao.*;

import java.util.ArrayList;

public class MainClass {
    public static void main(String... args){
//        weatherDAO weather = new WeatherDAOforeca();
//        weatherDAO weather = new WeatherDAOhmn();
//
//        weather.getWeather();

        ArrayList<String> classList = new ArrayList<>();
        classList.add("c1");
        classList.add("left");
        classList.add("warm txt-xxlarge");
        classList.add("");
        WeatherParserConfig config = new WeatherParserConfig();
        config.setUrl("https://www.foreca.ru/Russia/Moskva");
        config.setDataNow(classList);

        WeatherParser parser = new WeatherParser(config);
        Weather weather = parser.getWeather();
        System.out.println(config.getUrl());
        System.out.println(weather.getDate() + " : " + weather.getTempepature() + "°C");
    }
}
