public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 55_555;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 5;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 5_555;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 5_555_555L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 5.5555f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 265.56556547;
        System.out.println("Значение переменной f с типом double равно " + f);


    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        short i = -159;
        int f = 27897;
        byte aa = 67;
        System.out.println("Корректно инициализировали все переменные");

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte pupilLudPav = 23;
        byte pupilAnSer = 27;
        byte pupilEkAn = 30;
        short totalPaper = 480;
        byte totalPupils = (byte) (pupilLudPav + pupilAnSer + pupilEkAn);
        short paperOnePupil = (short) (totalPaper / totalPupils);
        System.out.println("На каждого ученика рассчитано " + paperOnePupil + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte productivityOneMin = 16 / 2;
        byte hour = 60;
        short day = (short) (hour * 24);
        int month = day * 30;
        short productivity20Min = (short) (productivityOneMin * 20);
        System.out.println("За 20 минут машина произвела " + productivity20Min + " штук бутылок");
        short productivityDay = (short) (productivityOneMin * day);
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        int productivity3Day = productivityDay * 3;
        System.out.println("За 3 дня машина произвела " + productivity3Day + " штук бутылок");
        int productivityOneMonth = productivityOneMin * month;
        System.out.println("За месяц машина произвела " + productivityOneMonth + " штук бутылок");



    }
}