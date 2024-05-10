package casting;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력해주세요(두개의 숫자가 0이면 프로그램이 종료됩니다)");
            int num1 = scanner.nextInt();
            System.out.println("입력한 숫자 : " + num1);

            System.out.print("숫자를 입력해주세요(두개의 숫자가 0이면 프로그램이 종료됩니다)");
            int num2 = scanner.nextInt();
            System.out.println("입력한 숫자 : " + num2);

            if(num1 == 0 && num2 == 0){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 수의 합 = " + sum);

        }
    }
}
