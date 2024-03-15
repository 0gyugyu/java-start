package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); //sum3의 결과 값과 같음

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 왜 이렇게 하냐? 연산이 복잡 -> 생각 , 복잡한 경우에 괄호를 넣어서 명확도 up
        // 코드는 명확하고 단순한 것이 유지보수에 쉽다.
    }
}
