package testcases;

public class UC5_TestMax {
    public static void toPrint(Integer[] Arr){
        for(int element : Arr){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void toPrint(Double[] Arr){
        for(Double element : Arr){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void toPrint(Character[] Arr){
        for(Character element : Arr){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArr = { 5, 3, 1, 6, 4};
        Double[] doubleArr = { 1.1, 1.2, 1.3,2.2, 2.4};
        Character[] charArr = { 'a', 'e', 'i', 'o', 'u'};

        PrintingArray.toPrint(intArr);
        PrintingArray.toPrint(doubleArr);
        PrintingArray.toPrint(charArr);
    }
}

