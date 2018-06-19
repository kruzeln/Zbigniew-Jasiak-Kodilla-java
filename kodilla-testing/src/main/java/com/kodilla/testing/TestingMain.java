package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args){
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("TheForumUser")){
            System.out.println("Test OK!");
        } else {
            System.out.println("Error!");
        }
        // drugi test - dla calculator
        Calculator kalku = new Calculator(25, 15);
        if ((kalku.add() == 40) && (kalku.subtract() == 10)){
            System.out.println("Test kalkulatora OK!");
        }
        else {System.out.println("Test kalkulatora failed!");}

        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
    }
}
