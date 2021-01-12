package cn.edu.hcnu.bean;

import java.util.Date;

public class FlightInfo {
    private String id;
    private String fromCity;    //始发站
    private String toCity;      //到达站
    private Date fromDate;      //出发时间
    private String flighttype;  //航班型号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
}
