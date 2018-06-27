package dao;

import java.util.List;

public class WeatherParserConfig {
    private String url;
    private List<String> dataNow;

    public WeatherParserConfig() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getDataNow() {
        return dataNow;
    }

    public void setDataNow(List<String> dataNow) {
        this.dataNow = dataNow;
    }
}
