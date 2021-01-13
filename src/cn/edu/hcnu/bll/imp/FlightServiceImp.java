package cn.edu.hcnu.bll.imp;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.bll.IflightService;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.imp.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImp implements IflightService {

//    IFlightDao iflight;  //定义全局变量
//
//    public void FlightDao(){
//        iflight=new FlightDaoIml();
//    }

    @Override
    public void insertFlight(FlightInfo flight) throws SQLException {
//        System.out.println("imp层"+flight);
//        iflight.insertFlight(flight);
          IFlightDao iFlightDao=new FlightDaoIml();
          iFlightDao.insertFlight(flight);
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
