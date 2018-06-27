package bean;

import java.util.Date;

public class Weather {
    private Date date;
    private double tempepature;
    private double wind;
    private double preasure;
    private double humidity;

    public Weather() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTempepature() {
        return tempepature;
    }

    public void setTempepature(double tempepature) {
        this.tempepature = tempepature;
    }
}
