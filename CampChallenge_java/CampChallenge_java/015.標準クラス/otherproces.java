/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staclass;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author keygr
 */
public class otherproces {
    public static void main (String[] args){
        try{
            File fp = new File("math.txt");
            FileWriter fw = new FileWriter(fp);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                Calendar str = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH時mm分ss秒SSS");
                bw.write(sdf.format(str.getTime()) + "開始");
                bw.newLine();
                for (int i = -5; i < 5; i++){
                    bw.write(i + "の絶対値は" + Math.abs(i) + "です");
                    bw.newLine();
                }
                Calendar end = Calendar.getInstance();
                bw.write(sdf.format(end.getTime()) + "終了");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
