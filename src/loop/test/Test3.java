package loop.test;

public class Test3 {
    public static void main(String[] args) {
        for (int num1 = 2, count1 = 1; count1 <= 10; num1 += 2, count1++) {
            System.out.println(num1);
        }
    }
}

//이게 더 좋다
//public static void main(String[] args) {
//    int num1 = 2;
//    for (int count1 = 1; count1 <= 10; count1++) {
//        System.out.println(num1);
//        num1 += 2;
//    }
//}