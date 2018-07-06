package algorithm;

//計算double的次方
public class DoublePower {
    public static void main(String[] args) throws Exception {
        DoublePower p11 = new DoublePower();
        System.out.println(p11.power(2.0, 3));
    }

    public double power(double base, int exponent) throws Exception {
        double result = 0.0;
        if (equal(base, 0.0) && exponent < 0) {
            throw new Exception("0的负数次幂没有意义");
        }
        if (exponent < 0) {
            result = 1.0 / powerWithExpoment(base, -exponent);
        } else {
            result = powerWithExpoment(base, exponent);
        }
        return result;
    }

    private double powerWithExpoment(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = powerWithExpoment(base, exponent >> 1);
        result *= result;
        if (exponent % 2 != 0) {
            result *= base;
        }
        return result;
    }

    private boolean equal(double num1, double num2) {
        if ((num1 - num2 > -0.0000001) && num1 - num2 < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }
}
