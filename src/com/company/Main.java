package com.company;

public class Main {

    private ShoppingCart cart;

    public static int sumTheTwoNumbers(int number){
        int nums = 15;
        
        int sum = nums + number;
        
        return sum;
        
    }
    
    public static void main(String[] args) {

//        String[] copyFrom = {
//                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
//                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
//                "Marocchino", "Ristretto" };
//
//        String[] copyTo = new String[11];
//        System.arraycopy(copyFrom, 2, copyTo, 0, 11);
//        for (String coffee : copyTo) {
//            System.out.println(java.util.Arrays.toString(copyTo));
//        }

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);

        int i = 5;
        System.out.println(i++);
        System.out.println(i);

        int value1 = 1;
        int value2 = 2;
        int otherResult;
        boolean someCondition = true;
        otherResult = someCondition ? value1 : value2;

        System.out.println(otherResult);
    }
}
