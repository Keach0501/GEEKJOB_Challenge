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
public class fileread {
    public static void main (String[] args){
        try{
            File fp = new File("text.txt");
            FileReader fr = new FileReader(fp);
            try (BufferedReader br = new BufferedReader(fr)) {
                System.out.println(br.readLine());
            }
        }catch(IOException e){
        }
    }
}
