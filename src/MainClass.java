import bean.Weather;
import dao.*;

import java.util.ArrayList;


/*
добавить парсинг всех параметров на неделю(regexp)
выбор города
 */
public class MainClass {
    public static void main(String... args){
//        weatherDAO weather = new WeatherDAOforeca();
//        weatherDAO weather = new WeatherDAOhmn();
//
//        weather.getWeather();

        ArrayList<WeatherParserConfig.WPCitem> classList = new ArrayList<>();
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"c1"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"left"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"warm txt-xxlarge"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.num,1));
        WeatherParserConfig config = new WeatherParserConfig();
        config.setUrl("https://www.foreca.ru/Russia/Moskva");
        config.setDataNow(classList);

        WeatherParser parser = new WeatherParser(config);
        Weather weather = parser.getWeather();
        System.out.println(config.getUrl());
        System.out.println(weather.getDate() + " : " + weather.getTempepature() + "°C - температура сейчас");

        classList = new ArrayList<>();
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"c1"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"right txt-tight"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.num,6));
        config = new WeatherParserConfig();
        config.setUrl("https://www.foreca.ru/Russia/Moskva");
        config.setDataNow(classList);

        parser = new WeatherParser(config);
        weather = parser.getWeather();
        System.out.println(weather.getDate() + " : " + weather.getTempepature() + "°C - точка росы");
    }
}
