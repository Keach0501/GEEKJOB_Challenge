/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classuse0;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author keygr
 */
public class Dealer extends Human {

//ゲームで配る山札
    protected ArrayList<Integer> cards = new ArrayList<>();
    
//山札を4*13のカードを追加
    Dealer(){
            for(int mark = 1; mark <= 4; mark++){
            for(int thirteen = 1; thirteen <= 13; thirteen++){
                if(thirteen <=10){
                cards.add(thirteen);
                }else {
                    cards.add(10);
                }
            }
        }
    }
//山札からランダムに2枚引く
    public ArrayList<Integer> deal(){
        ArrayList<Integer> db = new ArrayList<>();
        Random rnd = new Random();
        Integer index1 = rnd.nextInt(cards.size());
        Integer index2 = rnd.nextInt(cards.size());
            db.add(cards.get(index1));
            db.add(cards.get(index2));
        return db;
    }

//山札からランダムに1枚引く
    public ArrayList<Integer> hit(){
        ArrayList<Integer> one = new ArrayList<>();
        Random rnd = new Random();
        Integer index3 = rnd.nextInt(cards.size());
            one.add(cards.get(index3));
        return one;
    }
    
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
        return open() < 17;
    }
}