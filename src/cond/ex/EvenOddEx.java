package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 5000;

        //나머지 연산자를 사용하면 홀짝을 구하기 용이함.
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
