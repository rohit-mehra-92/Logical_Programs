public class CouponNumber {

    public static void main(String[] args) {
        int max = 10000000;
        couponNumber(max);
    }

    static void couponNumber(int max) {
        char[] code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();

        int random = (int) (Math.random() * max);
        StringBuffer sb = new StringBuffer();
        int count = 0;
        while (random > 0) {
            sb.append(code[random % code.length]);
            random = random / code.length;
            count++;
        }
        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
        System.out.println("number of distinct code  :" + count);
    }
}