package DriverPackage;

import java.util.ArrayList;
import java.util.Scanner;

import ServicePackage.*;

public class DriverClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceClass s = new ServiceClass();

        System.out.println("Enter the total number of floors in the building : ");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("********************************");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the floor size given on day " + (i + 1) + " : ");
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println("********************************");

        s.function(arr, size);
        sc.close();

    }

}
