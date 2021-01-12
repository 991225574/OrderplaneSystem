package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.FlightInfo;

import java.util.Set;

//接口
public interface IflightService  {
    void insertFlight(FlightInfo flight);
    Set<FlightInfo> getAllFlights();
    FlightInfo getFlightByDepartureTime(String departureTime);
    FlightInfo getFlightByDepartureAirPort(String departureAirPort);
    FlightInfo getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(FlightInfo flight);
}
