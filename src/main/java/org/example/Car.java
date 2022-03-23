package org.example;

public class Car {
    String brand, ownerName, registrationNumber;
    int  maxSpeed;
    int HP;

    Car(String _brand, String _regNr, int _maxSpeed ,int _hp ){
        brand = _brand;
        registrationNumber = _regNr;
        maxSpeed =_maxSpeed;
        HP = _hp;
    }
    public String getInfo(){

        return brand+ ", with NR " + registrationNumber + " and maxspeed " + maxSpeed + " and HP of: " + HP;
    }
}
