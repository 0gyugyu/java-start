package operator;

public class OperationEx3 {

    public static void main(String[] args) {
        int score = 80;

        boolean result = score >= 80 && score <= 100;
//        boolean result = 80 <= score && score <= 100; 이렇게 쓰면 읽기가 쉬움

        System.out.println("result = " + result);

    }
}
