package java8features;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ReduceDemo1 {


    private static void sumListElements(List<Integer> list)
    {
        Integer reduce = list.stream().reduce(0, (subTotal, element) -> subTotal + element);
        System.out.println("Sum of elements of the list == "+reduce);

    }

    private static void sumEmptyListElements(){

        int reduce = Arrays.stream(new int[5]).reduce(-1, (a, b) -> a + b);
        System.out.println("Sum of elements of empty array == "+reduce);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumListElements(integers);
        sumEmptyListElements();

    }
}
