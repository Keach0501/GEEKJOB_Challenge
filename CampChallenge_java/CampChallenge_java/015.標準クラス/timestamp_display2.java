/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staclass;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author keygr
 */
public class timestamp_display2 {
    public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Date d1 = new Date();
        Date d2 = new Date();
//2015年1月1日 0時0分0秒
        c1.set(2015, 0, 1, 0, 0, 0);
//2015年12月31日 23時59分59秒
        c2.set(2015, 11, 31, 23, 59, 59);
        d1 = c1.getTime();
        d2 = c2.getTime();
//        System.out.println(d1.getTime());
//        System.out.println(d2.getTime());
        System.out.println(d1.getTime() - d2.getTime());
    }
}
