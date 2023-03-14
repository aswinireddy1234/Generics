package testcases;
public class UC3_MaxString {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
            T Max = a;

            if (b.compareTo(Max) > 0)
                Max = b;

            if (c.compareTo(Max) > 0)
                Max = c;

            return Max;
        }
        public static void main(String args[]) {
            System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Peach", "Banana", max("Apple",
                    "Peach", "Banana"));
    }
}
