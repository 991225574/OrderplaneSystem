package cn.edu.hcnu.dao.imp;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {

    //连接数据库，录入航班数据
    @Override
    public void insertFlight(FlightInfo flight) throws SQLException {
        System.out.println("dao层"+flight);
//        String url="jdbc:oracle:thin:@localhost:1521:orcl";
//        String username="SCOOT";
//        String password="123";
//
//        //创建数据库连接
//        Connection con= DriverManager.getConnection(url,username,password);
//        String sql="insert into flight values(?,?,?,?,?,?,?)";
//        //准备预处理sql语句
//        PreparedStatement pre=con.prepareStatement(sql);
////        绑定值
//        pre.setString(1,flight.getId());
//        pre.setString(2,flight.getFlightId());
//        pre.setString(3,flight.getFlighttype());
//        pre.setInt(4,flight.getCurrentSeatsNum());
//        pre.setString(5,flight.getFromCity());
//        pre.setString(6,flight.getToCity());
//        pre.setString(7,flight.getFromDate());
//
////        执行sql语句
//        pre.executeUpdate();
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
