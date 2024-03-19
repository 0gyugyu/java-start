package cond;
// 단순한 if에 가깝고, 장점은 case뒤에 바로 매칭을 할 수 있으니까 직관적이다...
public class Switch3 {
    public static void main(String[] args) {
        int grade = 1;

        int coupon;
        switch (grade){ //조건이 들어가는게 아니라 값이 들어감
            case 1:
                coupon = 1000;
                break;
            case 2:
                //break가 없으면 그냥 밑으로 내려가서 case 3을 출력하고 break 후 빠져나오게 된다..
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 쿠폰 금액 : " + coupon);
    }
}
