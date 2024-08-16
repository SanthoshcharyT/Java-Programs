//Hirarchial Inhertance 

import java.util.Scanner;

class Number {  //creation of the class
    protected int num;

    public void getNum() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = s1.nextInt();
    }
}

class Square extends Number {      //class square extending the number class
    public void getSquare() {
        int a = num * num;
        System.out.println("Square of the number: " + a);
    }
}

class Cube extends Number {        //class Cube extending the Number class
    public void getCube() {
        int b = num * num * num;
        System.out.println("Cube of the number: " + b);
    }
}

public class Main { // Ensure this class is public since the file is named Main.java
    public static void main(String[] args) {
        Square s = new Square();    //Creation of the constructor to call the  methods
        Cube c = new Cube();

        s.getNum();
        s.getSquare();

        c.getNum();
        c.getCube();
    }
}
