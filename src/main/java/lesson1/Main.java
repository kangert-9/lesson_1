package lesson1;

public class Main {

    public static void main(String[] args) {
        calculate(6.7f,9f,-4.9f,7.09f);
        check(-8, 20);
        print(-9);
        back(4);
        greet("Daria");
        determine(-8);
    }
//второе задание
    private static void TestVars() {
        int a = 5;
        float b = 6.9f;
        char y = 'U';
        boolean i = true;
        String n ="Ti chego?";
    }
//третье задание
    private static void calculate(float a, float b, float c, float d) {
        float G = a * (b + (c / d));
        System.out.println(G);
    }
//четвертое задание
    private static void check(int a, int b) {
        boolean isTrue = ((a+b)>=10)&&((a+b)<=20);
        System.out.println(isTrue);
    }
//пятое задание
    private static void print(int m) {
        if (m<0){
            System.out.println(m+" - отрицательное число");
        } else {
            System.out.println(m+" - положительное число");
        }
    }
//шестое задание
    private static void back(int c) {
        boolean i = c<0;
        System.out.println(i);
    }
//седьмое задание
    private static void greet(String name) {
        System.out.println("Hello, "+name);

    }
//восьмое задание
    private static void determine(int g) {
        int s = g % 400;
        int p = g % 4;
        int t = g % 100;
        if (s == 0 || (p==0&&t!=0)) {
            System.out.println(g+"-й год високосный");
        } else {
            System.out.println(g+"-й год невисокосный");
        }
    }
}
