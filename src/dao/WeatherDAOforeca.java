package dao;

import bean.Weather;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.net.URL;
import java.util.Date;

public class WeatherDAOforeca implements weatherDAO {
    final static String requestUrl = "https://www.foreca.ru/Russia/Moskva";
    @Override
    public Weather getWeather() {
        Document doc = null;
        try {
            doc = Jsoup.parse(new URL(requestUrl),5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Weather result = new Weather();

        for (Element el:doc.body().getAllElements()){
            String text = el.text();
            if (el.cssSelector().contains("#webslice_content > div.entry-content > div.table.t_cond > div.c1 > div.left > span.warm.txt-xxlarge > strong")){
                System.out.println(text);
                result.setDate(new Date());
                result.setTempepature(Float.parseFloat(text));
            }
        }
        return result;
    }
}
