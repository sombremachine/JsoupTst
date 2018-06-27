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
        for(String s:config.getDataNow()){
            for (Element el:els) {
                if (el.className().equals(s)) {
                    els = el.getAllElements();
//                    System.out.println(s + ":" + el.text());
                }
            }
        }
        for (Element el2:els){
//            System.out.println(el2.className() + ":" + el2.text());
            try {
//                System.out.println("!" + Integer.parseInt(el2.text()));
                result.setDate(new Date());
                result.setTempepature(Float.parseFloat(el2.text()));
            }catch (Exception e){

            }
        }
        return result;
    }
}
