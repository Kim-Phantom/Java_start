package casting;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
                
        while (true){
            System.out.print("정수를 입력해주세요(0을 입력하면 그만)");
             int num1 = input.nextInt();
             if(num1 == 0){
                 System.out.println("그만합니다");
                 break;
             }
             sum += num1;
        }
        System.out.println("입력한 모든 정수의 합입니다. : " + sum);
    }
}
