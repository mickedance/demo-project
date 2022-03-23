package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Excercises {


    LocalDate date;
    boolean isLeapYear = false;
    public static void main(String args[]){
        System.out.println("Choose Excercise");
        System.out.println("1");
    }

    public boolean setYear(int y){
        try{
            String s = y+"0229";
            LocalDate.parse(s, DateTimeFormatter.BASIC_ISO_DATE);
        }catch (Exception e){
            isLeapYear = true;
        }
        return isLeapYear;
    }
public void getLeapYear(){

}
}
