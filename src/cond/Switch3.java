package cond;

public class Switch3 {
    public static void main(String[] args) {

        int grade = 2;
        int coupone;
        switch (grade){
            case 1:
                coupone = 1000;
                break;
            case 2:
                // break 가 없으면 다음걸로 수행
            case 3:
                coupone = 3000;
                break;
            default:
                coupone = 500;
        }
        System.out.println("발급받은 쿠폰 : "+ coupone);
    }
}


