import bean.Weather;
import bean.WeatherSnapshot;
import dao.*;

import java.util.ArrayList;
import java.util.HashMap;


/*
добавить парсинг всех параметров на неделю(regexp)
выбор города
 */
public class MainClass {
    public static void main(String... args){


//        HashMap<String, WeatherParserConfig> parameters = new HashMap<>();
//
//        ArrayList<WeatherParserConfig.WPCitem> classList = new ArrayList<>();
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"c1"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"left"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"warm txt-xxlarge"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.num,1));
//        WeatherParserConfig config = new WeatherParserConfig();
//        config.setUrl("https://www.foreca.ru/Russia/Moskva");
//        config.setPathItems(classList);
//
//        parameters.put("temperature",config);;
//
//        classList = new ArrayList<>();
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"c1"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"right txt-tight"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.num,8));
//        config = new WeatherParserConfig();
//        //config.setUrl("https://www.foreca.ru/Russia/Moskva");
//        config.setPathItems(classList);
//
//        parameters.put("humidity",config);
//
//        FullWeatherParserConfig fullConfig = new FullWeatherParserConfig(parameters);

        WeatherParser parser = new WeatherParser(ConfigHelpers.getConfigGismeteo());
        WeatherSnapshot snap = parser.getWeather();
        System.out.println("" + snap.getTemperature() + "°C - температура сейчас");
        System.out.println("" + snap.getHumidity()  + "% - влажность");
        System.out.println("" + snap.getWindSpeed()  + " - ветер");


        //
    }
}
