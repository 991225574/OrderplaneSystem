package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.FlightInfo;

import java.sql.SQLException;
import java.util.Set;

//数据库接口类
public interface IFlightDao {
    void insertFlight(FlightInfo flight) throws SQLException;
    Set<FlightInfo> getAllFlights() throws SQLException;  //Set<> 固定类型
    FlightInfo getFlightByDepartureTime(String departureTime);
    FlightInfo getFlightByDepartureAirPort(String departureAirPort);
    FlightInfo getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(FlightInfo flight);
}
