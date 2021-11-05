package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person[] humans = new Person[10];

        for (int i = 0; i < 10; i++) {
            humans[i] = new Person();
            System.out.println( "Введите имя");
            humans[i].setName(scan.nextLine());
            System.out.println("Введите вес");
            humans[i].setWeight(Double.parseDouble(scan.nextLine()));

        }
        for (int out = 9; out >= 1; out--) {
            for (int i = 0; i < out; i++) {
                if (humans[i].getWeight() > humans[i + 1].getWeight()) {
                    Person temp = humans[i];
                    humans[i] = humans[i + 1];
                    humans[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Сортировка по весу: " + humans[i].getName() + " " + humans[i].getWeight());
            System.out.println();


        }
    }
}
