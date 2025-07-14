package list.test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cart{
    private ArrayList<Item> cart = new ArrayList<>();
    public void addItem(Item item){
        cart.add(item);
    }
    public void displayItems(){
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < cart.size(); i++){
            total += cart.get(i).getTotalPrice();
            System.out.println("상품명 : " + cart.get(i).getName() + "합계 :" + cart.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합 " + total);
    }
}
