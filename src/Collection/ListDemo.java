package Collection;

import java.util.ArrayList;  //导入实现集合List的子类
import java.util.List;        //导入List集合包

public class ListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();   //实例化集合list 实现向上转型

        /* List 集合
            可存放不同类型的数值,还可同时存放值相同的数值
            集合是有序存放数值的
         */

        //存值到集合
        list.add(false);
        list.add(1);
        list.add("河池学院");
        list.add("2018608106");
        list.add(1);

        System.out.println("list集合的场合的长度为："+list.size());   //获取集合的长度

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));                        //获取集合的值
        }


    }
}
