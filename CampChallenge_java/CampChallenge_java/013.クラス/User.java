/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classuse0;

import java.util.ArrayList;

/**
 *
 * @author keygr
 */
public class User extends Human {

//手札の合計を計算
    @Override
    public int open() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sum = 0;
        for (int i = 0; i < myCards.size(); i++){
            sum = sum + myCards.get(i);
        }
        return sum;
    }

//引いたカードを手札に追加
    @Override
    public void setCard(ArrayList<Integer> pull) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < pull.size(); i++) {
            myCards.add(pull.get(i));
        }
    }

//カードを引くか判断
    @Override
    public boolean cheakSum() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return open() < 18;
    }
}
