package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.FlightInfo;

import java.util.Set;

public interface IFlightDao {

    void insertFlight(FlightInfo flight);
    Set<FlightInfo> getAllFlights();
    FlightInfo getFlightByDepartureTime(String departureTime);
    FlightInfo getFlightByDepartureAirPort(String departureAirPort);
    FlightInfo getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(FlightInfo flight);
}
