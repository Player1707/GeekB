package ua.geekbrains.java.yaroslav_nechval.home_work2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(First(10,14));
        Second(-1);
        System.out.println(Third(-1));
        Fourth("hi",5);
        System.out.println(Fifth(1995));
    }

    public static boolean First (int a, int b){
        int c = a + b;
        if(c < 10 || c > 20){
            return false;
        }else {
            return true;
        }
    }

    public static void Second (int e){
        if(e >= 0){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean Third (int r){
        if(r >= 0){
            return false;
        }else {
            return true;
        }
    }

    public static void Fourth (String v, int r){
        for (int i = 0 ; i < r; i++){
            System.out.println(v);
        }
    }

    public static boolean Fifth (int y){
        if(y%4 == 0){
            return true;
        }else if(y%100 != 0 ){
            return false;
        }else{
            return true;
        }
    }
}
