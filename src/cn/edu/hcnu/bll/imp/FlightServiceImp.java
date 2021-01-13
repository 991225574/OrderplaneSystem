package cn.edu.hcnu.bll.imp;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.bll.IflightService;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.imp.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

//
public class FlightServiceImp implements IflightService {

    IFlightDao iFlightDao;  //定义全局变量

    //构造方法new数据访问层对象
    public FlightServiceImp(){
        iFlightDao=new FlightDaoIml();
    }

    @Override
    public void insertFlight(FlightInfo flight) throws SQLException {
        //传值dao层
          iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<FlightInfo> getAllFlights() throws SQLException {
        return iFlightDao.getAllFlights(); //获取到层的容器值
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
