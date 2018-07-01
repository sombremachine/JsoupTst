package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ConfigHelpers {
    public static FullWeatherParserConfig getConfigForeca(){
        LinkedHashMap<String, WeatherParserConfig> parameters = new LinkedHashMap<>();

        return new FullWeatherParserConfig(parameters);
    }

    public static FullWeatherParserConfig getConfigGismeteo(){
        LinkedHashMap<String, WeatherParserConfig> parameters = new LinkedHashMap<>();
        ArrayList<WeatherParserConfig.WPCitem> classList = new ArrayList<>();

        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"content"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"wrap"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"flexbox clearfix"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"main"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"column-wrap"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"__frame_sm"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"__frame",2));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget js_widget"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__body"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__container"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__row",2));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__chart w_temperature-avg"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"chart chart__temperature"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"values"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.num,1)); // номер дня
        WeatherParserConfig config = new WeatherParserConfig();
        config.setUrl("https://www.gismeteo.ru/weather-moscow-4368/10-days/");
        config.setPathItems(classList);

        parameters.put("temperature",config);

        classList = new ArrayList<>();
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"content"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"wrap"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"flexbox clearfix"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"main"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"column-wrap"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"__frame_sm"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"__frame",6));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget js_widget"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__body"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__container"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__row widget__row_table"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__item",1)); // номер дня
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.num,1));
        config = new WeatherParserConfig();
//        config.setUrl("https://www.gismeteo.ru/weather-moscow-4368/10-days/");
        config.setPathItems(classList);

        parameters.put("humidity",config);

        classList = new ArrayList<>();
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"content"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"wrap"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"flexbox clearfix"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"main"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"column-wrap"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"__frame_sm"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"__frame",3));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget js_widget"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__body"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__container"));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__row widget__row_table",1));
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"widget__item",1)); // номер дня
        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"w_wind"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"w_wind__warning w_wind__warning_"));
//        classList.add(new WeatherParserConfig.WPCitem(WeatherParserConfig.ParseType.className,"w_wind__bg"));

        config = new WeatherParserConfig();
//        config.setUrl(null);
        config.setPathItems(classList);

        parameters.put("windStrength",config);

        return new FullWeatherParserConfig(parameters);
    }

}
