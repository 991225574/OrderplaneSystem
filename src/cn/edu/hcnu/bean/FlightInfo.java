package cn.edu.hcnu.bean;

import java.util.Date;

public class FlightInfo {
    private String id;            //主键id
    private String flightId;     //航班编号
    private String flighttype;  //航班型号
    private String fromCity;    //始发站
    private String toCity;      //到达站
    private String fromDate;      //出发时间

    public FlightInfo(String id, String flightId, String flighttype, String fromCity, String toCity, String fromDate) {
        this.id = id;
        this.flightId = flightId;
        this.flighttype = flighttype;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.fromDate = fromDate;
    }

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

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

}
