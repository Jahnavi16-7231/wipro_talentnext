package OOPS;

import java.util.Scanner;

public class BoxQ1 {
double width,height,depth;  
    
	BoxQ1 (double width,double height,double depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
}
	
	double volume(){
	return width * height * depth;
   }

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter width of the box: ");
    double width = sc.nextDouble();

    System.out.print("Enter height of the box: ");
    double height = sc.nextDouble();

    System.out.print("Enter depth of the box: ");
    double depth = sc.nextDouble();

	BoxQ1 b=new BoxQ1 (width,height,depth);
     double volume=b.volume();
     System.out.println("Volume of the box: " + volume);
     sc.close();
}
}
