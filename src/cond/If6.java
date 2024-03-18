package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0; //현재 할인된 금액

        if (price >= 10000) {
            discount = discount + 1000; //1000원 할인이 되는 것
            System.out.println("10,000원 이상 구매! 1000원이 할인!");
        } else if (age <= 10) { //위의 if문이 충족 실행되어 else if문의 조건은 적용되지 않는 문제가 발생한다..
            discount = discount + 1000;
            System.out.println("어린이는 1,000원 할인!");
        } else {
            System.out.println("적용되는 할인이 없습니다...");
        }

        System.out.println("총 할인 금액 : " + discount + "원 입니다!");


    }
}
