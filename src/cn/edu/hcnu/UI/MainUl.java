package cn.edu.hcnu.UI;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.bll.IflightService;
import cn.edu.hcnu.bll.imp.FlightServiceImp;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class MainUl {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----------菜单------------");
        System.out.println("| 插入航班信息按：1         |");
        System.out.println("---------------------------");


        while(true){
            System.out.println("请选择相应的序号选择：");
            int result=scanner.nextInt();

            System.out.println("录入航班信息");
            if(result==1){
                String id=UUID.randomUUID().toString().replace("-","");

                System.out.println("1.录入航班编号：");
                String flightId=scanner.next();

                System.out.println("2.录入机型");
                String planeType=scanner.next();

                System.out.println("3.录入总座位数量");
                int CurrentSeatsNum=scanner.nextInt();

                System.out.println("4.录入起飞机场");
                String departureAirPort=scanner.next();

                System.out.println("5.录入目的地机场");
                String destinationAirPort=scanner.next();

                System.out.println("6.录入起飞时间");
                String departureTime=scanner.next();

                //new航班信息，传值给构造方法
                FlightInfo flight=new FlightInfo(flightId,planeType,CurrentSeatsNum,departureAirPort,destinationAirPort,departureTime);

                //new 继承的接口的flightServiceImp类
                IflightService iflightService=new FlightServiceImp();  //向上转型

                //调用它的插入1
                // 航班信息方法，然后传航班对象值给它插入数据
                System.out.println(flight.getToCity());
                iflightService.insertFlight(flight);
            }
        }
    }
}
