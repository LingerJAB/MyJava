//by JAB 2020.4.16__使用的是遍历/穷举因数计算
import java.util.*;
public class Prime_number_operation {
    public static void main(String[] args) {
        int start=2;
        //i从哪里开始(建议start >= 2)
        int end=1000;
        //i从哪里结束(可修改,建议end>(start-1))
        int k=0;
        //k用于存储质数的数量。
        int i=start, i2=0;
        //i质数，i2存储两质数差(首项默认为原数)
        for(; i<end; i++) {
            boolean pd=true;
            //默认i为质数(true)
            for(int j=2; j<(i-1); j++) {
                //遍历j算i的因数
                if(i%j==0) {
                    pd=false;
                    //如果被j整除便为非负数(false)
                }
            }
            if(pd==true) {
                System.out.print("第"+(++k)+"个:   ");
                //输出数量k
                System.out.println(i+"    "+"差："+(i-i2));
                //输出质数i(true)
                i2 = i;
                //赋值i2为上一个质数i
            }
        }
        System.out.println("\n在 "+start+" 到 "+end+" 之中，一共有 "+k+" 个质数。");
        //总结质数数(k)
    }
}
