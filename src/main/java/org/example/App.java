package org.example;

import java.util.Scanner;


public class App 
{


    public static void main( String[] args )
    {
        Car car = new Car("Opel", "AHA377", 120 , 100);
        System.out.println(car.getInfo());

        int score = 10;

        if(score>= 65){
            System.out.println("Hurray!");
        }else if(score<65 && score>= 54){
            System.out.println("Your almost there");
        }else{
            System.out.println("Youd did not pass");
        }

        Scanner keyboard = new Scanner(System.in);
        String userInput;
        System.out.println("Type something + press enter (whithout blankspaces)");
        userInput = keyboard.nextLine();
        System.out.println(userInput);
    }


}
