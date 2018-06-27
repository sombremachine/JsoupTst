package dao;

import bean.Weather;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class WeatherParser implements weatherDAO {
    private WeatherParserConfig config;

    public WeatherParser(WeatherParserConfig config) {
        this.config = config;
    }

    @Override
    public Weather getWeather() {
        Document doc = null;
        try {
            doc = Jsoup.parse(new URL(config.getUrl()),5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Weather result = new Weather();
        String text;
        Elements els = doc.body().getAllElements();

        for(WeatherParserConfig.WPCitem item:config.getDataNow()){
            for (Element el:els) {
                int counter = 0;
                switch (item.getParseType()){
                    case className:{
                        if (el.className().equals(item.getName())) {
                            els = el.getAllElements();
//                    System.out.println(s + ":" + el.text() + "|" + el.toString());
                        }
                        break;}
                    case num:{
                        if (counter == item.getNum()){
                            els = el.getAllElements();
//                    System.out.println(s + ":" + el.text() + "|" + el.toString());
                        }
                        break; }
                }
                counter++;
            }
        }
        int i = 0;
        for (Element el2:els){
//            System.out.println("" + i + "  " + el2.className() + ":" + el2.text() + "|" + el2.toString());
            try {
//                System.out.println("!" + Integer.parseInt(el2.text().replaceAll("°","")));
                result.setDate(new Date());
                result.setTempepature(Float.parseFloat(el2.text().replaceAll("°","")));
            }catch (Exception e){

            }
            i++;
        }
        return result;
    }
}
