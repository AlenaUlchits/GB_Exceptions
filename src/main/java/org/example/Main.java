package org.example;

import java.util.Scanner;

public class Main {

    private static Float parseToNumber(String number){
        return Float.parseFloat(number);
    }

    private static void emptyString(String number) throws Exception{
        if(number.isEmpty()){
            throw new Exception("The string must not be empty");
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        Boolean exit = Boolean.FALSE;
        while (!exit) {
            System.out.println("Please enter a number: ");
            String number = sc.nextLine();
            emptyString(number);
            try{
                System.out.println("Your number is: " + parseToNumber(number));
                exit = Boolean.TRUE;
            }catch (Exception e){
                System.out.println("It's not a number try again: ");
            }
        }
    }
}