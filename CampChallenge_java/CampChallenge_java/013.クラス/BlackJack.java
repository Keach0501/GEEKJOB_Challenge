/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classuse0;

/**
 *
 * @author keygr
 */
public class BlackJack {
    public static void main(String[] args){
        Dealer dealer = new Dealer();
        User user = new User();
//1.ゲーム開始 山札を作る
        System.out.println("ゲームを開始します");
//2.Dealerからdealerとuserに山札から２枚配る
        dealer.setCard(dealer.deal());
        System.out.println("Dealerの手札は" + dealer.myCards);
        System.out.println("Dealerの手札の合計は" + dealer.open());
        user.setCard(dealer.deal());
        System.out.println("Userの手札は" + user.myCards);
        System.out.println("Userの手札の合計は" + user.open());
        
//3.カードを引くか判断する
        while(user.cheakSum() == true){
            user.setCard(dealer.hit());
            System.out.println("Userが山札から1枚引きます");
            System.out.println("Userの手札は" + user.myCards);
            System.out.println("Userの手札の合計は" + user.open());
            }
        
        while(dealer.cheakSum() == true){
            if(user.open() <= 21){
                dealer.setCard(dealer.hit());
                System.out.println("Dealerが山札から1枚引きます");
                System.out.println("Dealerの手札は" + dealer.myCards);
                System.out.println("Dealerの手札の合計は" + dealer.open());
            }else {
            break;
            }
        }

//4.引き終えたら勝敗を判断する
        System.out.println("カードを引き終わりました");
        System.out.println("Dealerの手札の合計は" + dealer.open());
        System.out.println("Userの手札の合計は" + user.open());
        if(dealer.open() > user.open() && dealer.open() <= 21){
            System.out.println("Dealerの勝利");
        } else if(user.open() > 21){
            System.out.println("Dealerの勝利");
        } else if(dealer.open() < user.open() && user.open() <= 21){
            System.out.println("Userの勝利");
        } else if(dealer.open() > user.open() && dealer.open() > 21) {
            System.out.println("Userの勝利");
        } else if(dealer.open() == user.open()){
            System.out.println("引き分け");
        }
    }
}
