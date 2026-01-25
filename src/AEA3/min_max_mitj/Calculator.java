package AEA3.min_max_mitj;
public class Calculator {

    public static double getMax(double[] nums) {
        double max = nums[0];
        for (double n : nums) {
            if (n > max) max = n;
        }
        return max;
    }

    public static double getMin(double[] nums) {
        double min = nums[0];
        for (double n : nums) {
            if (n < min) min = n;
        }
        return min;
    }

    public static double getAverage(double[] nums) {
        double sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum / nums.length;
    }
}
