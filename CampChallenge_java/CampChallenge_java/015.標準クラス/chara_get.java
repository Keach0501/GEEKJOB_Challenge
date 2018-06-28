/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staclass;

/**
 *
 * @author keygr
 */
public class chara_get {
    public static void main (String[] args){
        String word = "stone.river0501@gmail.com";
        String substr = word.substring(16);
        System.out.println(substr.length());
    }
}
