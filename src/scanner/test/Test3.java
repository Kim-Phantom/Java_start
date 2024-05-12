package scanner.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pricesum = 0;
        int foodcount = 0;
        while (true) {
            System.out.print("음식의 이름을 적어주세요(그만을 입력하면 종료됩니다)");
            String foodname = scanner.nextLine();

            System.out.print("음식의 가격을 입력해주세요");
            int foodprice = scanner.nextInt();

            System.out.print("수량을 입력해주세요");
            int count = scanner.nextInt();

            if(foodname.equals("exid")){
                System.out.println("주문을 종료합니다");
                break;
            }
            pricesum = count * foodprice;
            foodcount = foodcount + count;

            System.out.println("총 음식 가격은 : " + pricesum);
            System.out.println("총 음식주문 수량은 : " + foodcount);
            

        }

    }
}