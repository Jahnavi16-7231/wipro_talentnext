package Abstraction_package_exceptionhandling;


//File: PackageQ3.java

public class packageQ3 {
 public static void main(String[] args) {
     Hero heroBike = new Hero();
     System.out.println("Hero Model: " + heroBike.getModelName());
     System.out.println("Speed: " + heroBike.getSpeed());
     heroBike.radio();

     Honda hondaCar = new Honda();
     System.out.println("Honda Model: " + hondaCar.getModelName());
     System.out.println("Speed: " + hondaCar.getSpeed());
     hondaCar.cdplayer();
 }
}

//Simulating com.automobile.twowheeler.Hero
class Hero {
 public String getModelName() {
     return "Hero Splendor";
 }

 public int getSpeed() {
     return 85;
 }

 public void radio() {
     System.out.println("Hero radio is ON.");
 }
}

//Simulating com.automobile.Honda
class Honda {
 public String getModelName() {
     return "Honda City";
 }

 public int getSpeed() {
     return 120;
 }

 public void cdplayer() {
     System.out.println("Honda CD Player is playing music.");
 }
}
