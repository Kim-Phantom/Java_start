package loop.test;

public class Test1 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10){
            System.out.println("count = " + count);
            count++;
        }
        System.out.println();
        for(int count1 = 1; count1 <= 10; count1++){
            System.out.println("count1 = " + count1);
        }
    }
}
