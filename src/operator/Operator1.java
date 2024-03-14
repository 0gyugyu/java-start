package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b= 2;

        // 덧셈
        int sum = a+b;
        System.out.println("a+b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a-b;
        System.out.println("a-b = " + diff);

        // 곱셈
        int multi = a*b;
        System.out.println("a*b = " + multi);

        // 나눗셈
        int div = a/b; // -> 2.5이지만 int는 정수형이기 때문에 소수점 표현이 불가능 = 2만 출력
        System.out.println("a/b = " + div);

        // 나머지
        int mod = a%b; //5/2 몫2, 나머지1
        System.out.println("a&b = " + mod);
    }
}
