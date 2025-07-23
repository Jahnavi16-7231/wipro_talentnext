package Abstraction;


abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "HR26AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Ramesh Kumar";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON in Hero bike.");
    }
}

class Honda extends Vehicle {
    @Override
    public String getModelName() {
        return "Honda Shine";
    }

    @Override
    public String getRegistrationNumber() {
        return "DL9CAF7654";
    }

    @Override
    public String getOwnerName() {
        return "Suresh Verma";
    }

    public int getSpeed() {
        return 90;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON in Honda bike.");
    }
}

public class TwoWheelerQ2 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("---------------");

        Honda honda = new Honda();
        System.out.println("Honda Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}
