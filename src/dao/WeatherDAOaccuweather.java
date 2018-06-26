package dao;

import bean.Weather;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;

/*
    it uses https =(. it is a trouble now
 */

public class WeatherDAOaccuweather implements weatherDAO {
    final static String requestUrl = "https://www.accuweather.com/en/ru/russia-weather";


    public static void enableSSLSocket() throws KeyManagementException, NoSuchAlgorithmException {
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });

        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, new X509TrustManager[]{new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }}, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
    }

    @Override
    public Weather getWeather() {
        Document doc = null;
        try {
            enableSSLSocket();
            doc = Jsoup.parse(new URL(requestUrl),10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Weather result = new Weather();

        for (Element el:doc.body().getAllElements()){
            String text = el.cssSelector() +":" + el.text();
            System.out.println(text);
//            String text = el.text();
//            if (el.cssSelector().contains("#webslice_content > div.entry-content > div.table.t_cond > div.c1 > div.left > span.warm.txt-xxlarge > strong")){
//                System.out.println(text);
//                result.setDate(new Date());
//                result.setTempepature(Float.parseFloat(text));
//            }
        }
        return result;
    }
}
