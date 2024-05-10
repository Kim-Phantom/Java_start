package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 15;
        if (m > 0){
            int temp = m * 2;
            System.out.println("temp =" + temp);
        }
    }
}
//전 내용과 같은 코드이지만 전 코드보다 훨씬 좋은 코드이다. temp를 if 안에 넣어주면서 메모리를 아끼고 군더더기가 없는 코드로 됨