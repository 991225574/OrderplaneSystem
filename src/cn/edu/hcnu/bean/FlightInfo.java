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

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flightId='" + flightId + '\'' +
                ", flighttype='" + flighttype + '\'' +
                ", CurrentSeatsNum=" + CurrentSeatsNum +
                ", fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", fromDate='" + fromDate + '\'' +
                '}';
    }

    public FlightInfo(String flightId, String flighttype, int currentSeatsNum, String fromCity, String toCity, String fromDate) {
        this.flightId = flightId;
        this.flighttype = flighttype;
        CurrentSeatsNum = currentSeatsNum;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.fromDate = fromDate;
    }
    //重写toString 输出刚才录入信息
//    public String toString(){
//        return this.id+this.flightId+this.flighttype+this.fromCity+this.toCity+this.fromDate;
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
