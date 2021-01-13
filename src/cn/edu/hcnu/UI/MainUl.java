package cn.edu.hcnu.UI;

import cn.edu.hcnu.bean.FlightInfo;
import cn.edu.hcnu.bll.IflightService;
import cn.edu.hcnu.bll.imp.FlightServiceImp;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----------菜单------------");
        System.out.println("| 插入航班信息按：1         |");
        System.out.println("| 查询航班信息按：2         |");
        System.out.println("---------------------------");


        while(true){
            System.out.println("请选择相应的序号选择：");
            int result=scanner.nextInt();

            System.out.println("录入航班信息");
            if(result==1){
                String id=UUID.randomUUID().toString().replace("-","")+"222";

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
                //设置捕获异常
                try{

                     //new航班信息，传值给构造方法
                     FlightInfo flight=new FlightInfo(id,flightId,planeType,CurrentSeatsNum,departureAirPort,destinationAirPort,departureTime);
                      //new 继承的接口的flightServiceImp类（业务逻辑层）
                     IflightService iflightService=new FlightServiceImp();  //向上转型
                      //调用它的插入方法，然后传航班对象值给它插入数据
                    iflightService.insertFlight(flight);
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    /*
                    * 使用正则表达式 分割异常信息
                    */

                    // 按指定模式在字符串查找
//                    ORA-12899: 列 "SCOTT"."FLIGHT"."ID" 的值太大 (实际值: 35, 最大值: 32)
//                    String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
//                    // 创建 Pattern 对象
//                    Pattern r = Pattern.compile(pattern);
//                    // 现在创建 matcher 对象
//                    Matcher m = r.matcher(e.getMessage());
//                    if (m.find()) {
//                        String tableName = m.group(4);
//                        String columnName = m.group(5);
//                        System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
//                    } else {
//                        System.out.println("NO MATCH");
//                    }
                }

            }else if(result==2){
                //获取业务层的得到容器值
                IflightService iflightService=new FlightServiceImp();
                try{
                    //定义容器 且设置FlightInfo类型
                    Set<FlightInfo> allFlights=iflightService.getAllFlights();
                    //Set 的便利需要迭代器

                    for(FlightInfo flightInfo:allFlights){
                        System.out.println(flightInfo);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
}
