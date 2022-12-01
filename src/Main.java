public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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
    public static void task5() {
        System.out.println("Задача 5");
        short totalPots = 120;
        byte white = 2;
        byte brown = 4;
        byte potsOneClass = (byte) (white + brown);
        short totalClasses = (short) (totalPots / potsOneClass);
        short whitePots = (short) (totalClasses * white);
        short brownPots = (short) (totalClasses * brown);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePots + " банок белой краски и " + brownPots + " банок коричневой краски" );
    }
    public static void task6() {
        System.out.println("Задача 6");
        short weightBanana = 80;
        short banana = 5;
        short totalWeightBananas = (short) (weightBanana * banana);
        short milk100 = 105;
        short milk = 2;
        short weightMilk = (short) (milk100 * milk);
        short ice = 2;
        short weightOneIce = 100;
        short weightIceCream = (short) (ice * weightOneIce);
        short eggs = 4;
        short weightEgg = 70;
        short weightEggs = (short) (eggs* weightEgg);
        int totalWeightGr = totalWeightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println("Вес такого завтрака составил " + totalWeightGr + " гр");
        int grPerKg = 1000;
        float totalWeightKg = totalWeightGr/(float)grPerKg;
        System.out.println("Вес такого завтрака составил " + totalWeightKg + " кг");
        int WeightKg = totalWeightGr / 1000;
        int remainderGr = totalWeightGr % 1000;
        System.out.println("Вес такого завтрака составил " + WeightKg + " кг " + remainderGr + " гр");

    }
    public static void task7() {
        System.out.println("Задача 7");
        int weightKG = 7;
        int kgPerGr = 1000;
        int loseWeight1 = 250;
        int loseWeight2 = 500;
        int weightGr = weightKG * kgPerGr;
        int days250 = weightGr / loseWeight1;
        System.out.println("Если спортсмен будет терять по  " + loseWeight1 + " грамм в день, то он похудеет через  " + days250 + " дней");
        int days500 = weightGr / loseWeight2;
        System.out.println("Если спортсмен будет терять по  " + loseWeight2 + " грамм в день, то он похудеет через  " + days500 + " дней");
        int middleDays = (days250 + days500) / 2;
        System.out.println("В среднем потребуется " + middleDays + " день, чтобы добиться результата");


    }
}