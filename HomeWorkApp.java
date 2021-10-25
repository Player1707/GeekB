package ua.geekbrain.java.yaroslav_nechval.home_work1;

public class HomeWorkApp {
    public static void main (String[] args){
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumber();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSing(){
        int a = -55;
        int b = 50;
        int c;
        c = a + b;

        if(c > 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 102;

        if(value <= 0){
            System.out.println("Красный");
        }else if(value <= 100){
            System.out.println("Жёлтый");
        }else {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumber(){
        int a = 10;
        int b = -5;

        if(a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }

    }
}
