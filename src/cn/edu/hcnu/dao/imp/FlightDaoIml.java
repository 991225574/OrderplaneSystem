package cn.edu.hcnu.dao.imp;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.dao.IFlightDao;

import java.util.Set;

public class FlightDaoIml implements IFlightDao {
    @Override
    public void insertFlight(FlightInfo flight) {

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
