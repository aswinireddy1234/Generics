package testcases;
public class UC4_MaxSorting {
    public static <T extends Comparable<T>> T max (T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
        }
        public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 1.1, 1.2, 1.3, max(1.1, 1.2, 1.3));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 1.1, 1.2, 1.3, max(1.1, 1.2, 1.3));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", max("Apple", "Peach", "Banana"));
    }
}


