package Collection;

import java.util.HashSet;   //导入实现Set类的子类
import java.util.Iterator;
import java.util.Set;       //导入Set集合

public class setDemo {
    public static void main(String[] args) {
        Set<String> set=new <String>HashSet();       //向上转型 实例化对象且设置固定存储数据类型

        //Set也是一个集合跟List集合一个功能，唯一有区别的是Set集合不可存放相同数值在集合里

        //储存值并且是字符类型
        set.add("河池学院");
        set.add("1");
        set.add("河池学院");
        System.out.println("set集合的长度"+set.size());  //会输出长度为2

        //迭代遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
