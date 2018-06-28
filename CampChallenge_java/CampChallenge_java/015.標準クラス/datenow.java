/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staclass;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author keygr
 */
public class datenow {
    public static void main(String[] args){
    Calendar c = Calendar.getInstance();
    Date d = new Date();
//1988年5月21日 1時23分45秒
    c.set(1988, 4, 21, 1, 23, 45);
    
    d = c.getTime();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
    
    System.out.println(sdf.format(d));
    
    }
}
