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
public class chara_change {
    public static void main (String[] args){
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String reword = word.replace("I", "い") .replace("U", "う");
        System.out.println(reword);
    }
}
