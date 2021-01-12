package cn.edu.hcnu.bll.imp;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.bll.IflightService;

import java.util.Set;

public class FlightServiceImp implements IflightService {

    @Override
    public void insertFlight(FlightInfo flight) {
        System.out.println(flight.toString());
    }

    @Override
    public Set<FlightInfo> getAllFlights() {
        return null;
    }

    @Override
    public FlightInfo getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public FlightInfo getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public FlightInfo getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(FlightInfo flight) {

    }
}
