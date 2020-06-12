package zhenti2013;

import java.util.Calendar;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int year = 1999; year < 10000; year++) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, 11);
            calendar.set(Calendar.DAY_OF_MONTH, 31);
            System.out.println(year + " " + calendar.get(Calendar.DAY_OF_MONTH));
            if(calendar.get(Calendar.DAY_OF_WEEK) == 1){
                break;
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int year = 1999;
//        int week = 4;//为了方便求模，0代表星期一，1999年12月31是星期五，初始化4
////		int[] data1 = new int[] {-1,31,28,31,30,31,30,31,31,30,31,30,31};
////		int[] data2 = new int[] {-1,31,29,31,30,31,30,31,31,30,31,30,31};//闰年天数
//
//        for(year=2000;year<=9999;year++) {
//            if((year%100!=0 && year%4==0) || year%400==0)
//                week = (week+366)%7;
//            else
//                week = (week+365)%7;
//            if(year%100==99)
//                System.out.println(year+" "+week);
//        }
//
//    }
}

/**
 * 1.标题: 世纪末的星期
 *
 *
 *     曾有邪教称1999年12月31日是世界末日。当然该谣言已经不攻自破。
 *
 *     还有人称今后的某个世纪末的12月31日，如果是星期一则会....
 *
 *     有趣的是，任何一个世纪末的年份的12月31日都不可能是星期一!! 
 *
 *     于是，“谣言制造商”又修改为星期日......
 *
 *     1999年的12月31日是星期五，请问：未来哪一个离我们最近的一个世纪末年（即xx99年）的12月31日正好是星期天（即星期日）？
 *
 *     请回答该年份（只写这个4位整数，不要写12月31等多余信息）
 */
