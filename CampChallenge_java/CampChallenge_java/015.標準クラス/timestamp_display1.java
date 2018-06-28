/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staclass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author keygr
 */
public class timestamp_display1 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        Date d = new Date();
//2016年11月4日 10時0分0秒
        c.set(2016, 10, 4, 10, 0, 0);
        d = c.getTime();
        System.out.println(d.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));
        
    }
    
}
