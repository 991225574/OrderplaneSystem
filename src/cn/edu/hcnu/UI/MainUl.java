package cn.edu.hcnu.UI;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.bll.IflightService;
import cn.edu.hcnu.bll.imp.FlightServiceImp;

import java.util.Scanner;
import java.util.UUID;

public class MainUl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String test= scanner.next();
        System.out.println(test);
        while(true){

            System.out.println("请选择相应的序号选择：");
            int result=scanner.nextInt();

            System.out.println("1.录入航班信息");
            if(result==1){
                String id=UUID.randomUUID().toString();
                System.out.println(id);
                System.out.print(id.replace("-","0"));

                System.out.println("1.录入航班编号：");
                String flightId=scanner.next();

                System.out.println("1.录入机型");
                String planeType=scanner.next();

                System.out.println("1.录入起飞机场");
                String departureAirPort=scanner.next();

                System.out.println("1.录入目的地机场");
                String destinationAirPort=scanner.next();

                System.out.println("1.录入起飞时间");
                String departureTime=scanner.next();

                FlightInfo flight=new FlightInfo(id,flightId,planeType,departureAirPort,destinationAirPort,departureTime);

                IflightService iflightService=new FlightServiceImp();
                iflightService.insertFlight(flight);
            }
        }
    }
}
