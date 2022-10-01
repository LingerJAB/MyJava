public class MySqrt {
    public static void main(String[] args) {
        System.out.println("sqrt(2)=");
        double result = sqrt(0.01);
        System.out.println(result);
    }

    public static double sqrt(double num) {
        if(num<=0) return 0;
        return sqrt(0, num, num);
    }
    public static double sqrt(double Low, double high, double num) {
        double mid = (high + Low) / 2;
        double square = mid * mid;
        try {
            if(square<num) {
                Low = mid;
                return sqrt(Low, high, num);
            } else if(square>num) {
                high = mid;
                return sqrt(Low, high, num);
            } else {
                return mid;
            }
        } catch(StackOverflowError error) {
            return mid;
        }
    }
}
