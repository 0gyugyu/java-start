package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 101;

        if (distance <= 1) {
            System.out.println("도보 이용");
        } else if (distance <= 10) {
            System.out.println("자전거 이용");
        } else if (distance <= 100) {
            System.out.println("자동차 이용");
        } else {
            System.out.println("비행기 이용");
        }
    }
}
