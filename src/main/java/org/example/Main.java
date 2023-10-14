package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - greetings; 2 - checkSign; 3 - selectColor; 4 - compareNumbers; 5 - addOrSubtractAndPrint");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                greetings();
                break;
            case 2:
                checkSign((int)(-5 + Math.random()* 10), (int)(-5 + Math.random() * 10), (int)(-5 + Math.random() * 10));
                break;
            case 3:
                selectColor((int)(1 + Math.random() * 30));
                break;
            case 4:
                compareNumbers(5, 10);
                break;
            case 5:
                addOrSubtractAndPrint(5,10, false);
                break;
            default:
                System.out.println("Был введен некорректный номер!");
        }
    }

    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c){
        int sum = a + b + c;
        if(sum >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data){
        if(data <= 10){
            System.out.println("Красный");
        }
        else if(data >= 10 && data <= 20){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b){
        if(a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a <= b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment == true){
            System.out.println(initValue + delta);
        }
        else{
            System.out.println(initValue - delta);
        }
    }

}