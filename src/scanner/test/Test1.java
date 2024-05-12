package scanner.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String string = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.println("당신의 이름은 " + string + " 당신의 나이는 " + num1 + " 입니다");
    }
}
