package cond;
// 단순한 if에 가깝고, 장점은 case뒤에 바로 매칭을 할 수 있으니까 직관적이다...
public class Switch2 {
    public static void main(String[] args) {
        int grade = 1;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;  //break를 만나면 스위치문을 빠져나오게된다..
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 쿠폰 금액 : " + coupon);
    }
}
