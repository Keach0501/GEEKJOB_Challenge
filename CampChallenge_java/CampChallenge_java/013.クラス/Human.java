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
public abstract class Human {

//UserとDealerの持つ手札の情報
    protected ArrayList <Integer> myCards = new ArrayList<>();

//手札の合計値の計算
    abstract public int open ();

// i<列サイズ i=列分足す
// 合計=sum 合計に次のList数字を入れる
// 最後にreturnいる？
//        int sum = 0;
//        for (int i = 0; i < ArrayList.size(); i++){
//        sum = sum + myCards.get(i);
//        }
    
//    /**
//     * 引いた時のメソッドが不明
//     * open.add?
//     * 山札から引いた時にどうすれば？
//     * 山札はdealerクラスに入る
//     */

//引いたカードを手札に追加    
    abstract public void setCard(ArrayList<Integer> pull);

//カードを引くかどうか
    abstract public boolean cheakSum();
}
