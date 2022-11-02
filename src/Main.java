public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
                System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i=i +4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i=i +7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i=i * 2) {
            System.out.println(i);
        }
        System.out.println("Доп");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + total / 100;
            total = total +salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
        System.out.println("Задача 8");
        int contribution = 29000;
        int all = 0;
        for (int i = 1; i <= 12; i++){
            all = all + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + all + " рублей ");
        }
        System.out.println("Задача 9");
        int contribution2 = 29000;
        int all2 = 0;

        for (int i = 1; i <= 12; i++){
            all2 = all2 + contribution2 / 100;
            all2 = all2 + contribution2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + all2 + " рублей ");
        }
        System.out.println("Задача 1 Часть 2");
        int i = 0;
        int score = 0;
        int deffered = 1500;
        while (score <= 2_459_000){
            score = score + deffered/100;
            score = score + deffered;
            i++;
            System.out.println("Месяц "+ i + " , сумма накоплений равна " + score + " рублей");
        }
        System.out.println("Задача 2 Часть 2");
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int s = 10;s > 0;s--){
            System.out.print(s + " ");
        }
        System.out.println("Задача 3 Часть 2");




    }
}