package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;
        
        int coupone;
        if(grade == 1){
            coupone = 1000;
        } else if (grade == 2) {
            coupone = 2000;
        } else if (grade == 3) {
            coupone = 3000;
        }else {
            coupone = 500; 
        }
        System.out.println("발급받은 쿠폰 : " + coupone + "입니다");
    }
}
