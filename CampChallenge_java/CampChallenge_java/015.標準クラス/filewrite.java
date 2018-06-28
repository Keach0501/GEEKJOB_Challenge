/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staclass;

import java.io.*;

/**
 *
 * @author keygr
 */
public class filewrite {
    public static void main(String[] args){
        try{
            File fp = new File("text.txt");
            
            FileWriter fw = new FileWriter(fp);
                fw.write("私の名前は石川です。");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
