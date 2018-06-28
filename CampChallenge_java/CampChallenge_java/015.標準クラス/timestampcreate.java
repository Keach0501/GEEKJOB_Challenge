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
public class timestampcreate {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        Date d = new Date();
//2016年1月1日 0時0分0秒
        c.set(2016,1,1,0,0,0);
        
        d = c.getTime();
        
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
