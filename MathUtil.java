public final class MathUtil {
    private MathUtil() {} 

    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static void main(String[] args) {
        System.out.println(clamp(5, 0, 10));  // 5
        System.out.println(clamp(-3, 0, 10)); // 0
        System.out.println(clamp(15, 0, 10)); // 10
    }
}