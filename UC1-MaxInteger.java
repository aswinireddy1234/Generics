package testcases;
public class MaxInteger {
        public static <T extends Comparable<T>> T max(T a, T b, T c) {
            T Max = a;

            if (b.compareTo(Max) > 0)
                Max = b;

            if (c.compareTo(Max) > 0)
                Max = c;

            return Max;
        }

        public static void main(String args[]) {
            System.out.printf("Maximum of %d, %d and %d is %d\n\n", 1.1, 1.2, 1.3, max(1.1, 1.2, 1.3));
        }
}


