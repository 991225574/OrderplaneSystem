package cn.edu.hcnu.bean;

import java.util.Date;

public class FlightInfo {
    private String id;            //主键id
    private String flightId;     //航班编号
    private String flighttype;   //航班型号
    private int CurrentSeatsNum; //座位号
    private String fromCity;     //始发站
    private String toCity;       //到达站
    private String fromDate;      //出发时间

//    public FlightInfo(String id, String flightId, String flighttype, int currentSeatsNum, String fromCity, String toCity, String fromDate) {
//        this.id = id;
//        this.flightId = flightId;
//        this.flighttype = flighttype;
//        CurrentSeatsNum = currentSeatsNum;
//        this.fromCity = fromCity;
//        this.toCity = toCity;
//        this.fromDate = fromDate;
//    }
    //显示全部航班信息
    public FlightInfo(String id, String flightId, String flighttype, int currentSeatsNum, String fromCity, String toCity, String fromDate) {
        this.id = id;
        this.flightId = flightId;
        this.flighttype = flighttype;
        CurrentSeatsNum = currentSeatsNum;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.fromDate = fromDate;
    }

    //显示没有id的航班信息


    public FlightInfo(String flightId, String flighttype, int currentSeatsNum, String fromCity, String toCity, String fromDate) {
        this.flightId = flightId;
        this.flighttype = flighttype;
        CurrentSeatsNum = currentSeatsNum;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return "航班信息{" +
                "id='" + id + '\'' +
                ", flightId='" + flightId + '\'' +
                ", flighttype='" + flighttype + '\'' +
                ", CurrentSeatsNum=" + CurrentSeatsNum +
                ", fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", fromDate='" + fromDate + '\'' +
                '}';
    }

//    @Override

//    public String toString() {
//        return "FlightInfo{" +
//                ", 航班ID='" + flightId + '\'' +
//                ", 航班类型='" + flighttype + '\'' +
//                ", 座位数量=" + CurrentSeatsNum +
//                ", 起始城市='" + fromCity + '\'' +
//                ", 到达城市='" + toCity + '\'' +
//                ", 发机时间='" + fromDate + '\'' +
//                '}';
//    }

    public String getId() {
        return id;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getFlighttype() {
        return flighttype;
    }

    public int getCurrentSeatsNum() {
        return CurrentSeatsNum;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public String getFromDate() {
        return fromDate;
    }
}
