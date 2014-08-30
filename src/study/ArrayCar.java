package study;

import java.io.PrintStream;
import java.util.Arrays;

public class ArrayCar {
    private static Car[] ar1;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setName("Porshe");
        c1.settype(Position.hatchback);
        Car c2 = new Car();
        c2.setName("BMW");
        c2.settype(Position.golf);
        Car c3 = new Car();
        c3.setName("Honda");
        c3.settype(Position.suv);
        Car[] ar1 = new Car[]{c1, c2, c3};
        Car[] ar2 = new Car[]{c3, c2, c1};
        System.out.println("Array 1:");
        for(int d=0;d<ar1.length;d++) {
            String x=ar1[d].getName();
            String c=ar1[d].getmanufacturer();
            Position v= ar1[d].gettype();
            System.out.printf("name=%1$10s manufacture=%2$10s type=%3$10s%n", x, c, v);
        }
        System.out.println("Array 2:");
        for(int g=0;g<ar2.length;g++) {
            String x=ar2[g].getName();
            String c=ar2[g].getmanufacturer();
            Position v= ar2[g].gettype();
            System.out.printf("name=%1$10s manufacture=%2$10s type=%3$10s%n", x, c, v);
        }
            if (Arrays.equals(ar1,ar2)) {
            System.out.println("Array1 equals Array2");
        } else {
            System.out.println("Array1 NOT equals Array2");
        }
    }
}
