package cn.edu.hcnu.dao.imp;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

//数据库实现接口的方法类
public class FlightDaoIml implements IFlightDao {

    //连接数据库，录入航班数据
    @Override
    public void insertFlight(FlightInfo flight) throws SQLException {
        System.out.println("dao层"+flight);
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="SCOtt";
        String password="123";

        //创建数据库连接
        Connection con= DriverManager.getConnection(url,username,password);
        String sql="insert into flight values(?,?,?,?,?,?,?)";
        //准备预处理sql语句
        PreparedStatement pre=con.prepareStatement(sql);
//        绑定值
        pre.setString(1,flight.getId());
        pre.setString(2,flight.getFlightId());
        pre.setString(3,flight.getFlighttype());
        pre.setInt(4,flight.getCurrentSeatsNum());
        pre.setString(5,flight.getFromCity());
        pre.setString(6,flight.getToCity());
        pre.setString(7,flight.getFromDate());

//        执行sql语句
        pre.executeUpdate();
    }

    @Override
    public Set<FlightInfo> getAllFlights() throws SQLException {
        Set<FlightInfo> allFlightInfos=new HashSet<FlightInfo>();  //定义FlightInfo类容器
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="Scott";
        String pass="123";
        //创建连接
        Connection con=DriverManager.getConnection(url,username,pass);
        String sql="SELECT * FROM flight";  //定义sql语句
        PreparedStatement pre=con.prepareStatement(sql);
        ResultSet re=pre.executeQuery();    //获取返回值

        //循环输出每条对象内容
        while (re.next()){
            String id=re.getString("id");  //获取每条对象的字段
            String flight=re.getString("FLIGHT_ID");
            String flighttype=re.getString("PLANE_TYPE");
            int CurrentSeatsNum=re.getInt("TOTAL_SEATS_NUM");
            String fromCity=re.getString("DEPARTURE_AIRPORT");
            String toCity=re.getString("DESTINATION_AIRPORT");
            String fromDate=re.getString("DEPARTURE_TIME");

            //每次把对象值存到flight里面
            FlightInfo flightInfo=new FlightInfo(id,flight,flighttype,CurrentSeatsNum,fromCity,toCity,fromDate);
            //然后把new的引用地址存到容器里面
            allFlightInfos.add(flightInfo);

        }
//        return null;
            return allFlightInfos;   //返回容器值
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
