package day_49_functional_interface.driver;

import day_49_functional_interface.NumberInterface;

public class UsingNumber{
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {
            if(n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.test(5);
        evenOrOdd.test(10);

        // NumberInterface cube = (n) -> {System.out.println(n * n * n );};
        NumberInterface cube = n -> System.out.println(n * n * n );

        cube.test(3);

    }
}
