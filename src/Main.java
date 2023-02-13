public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача1");
        int a = 50000;
        byte b = 100;
        short c = 30000;
        long d = 900000000L;
        float e = 4.5f;
        double f = 9.981;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2(){
        System.out.println("Задача2");
        int a = 27897;
        byte b = 67;
        short c = -159;
        short d = 569;
        long e = 987678965549L;
        float f = 27.12f;
        double g = 2.786;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом short равно " + d);
        System.out.println("Значение переменной e с типом long равно " + e);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);
    }
    public static void task3(){
        System.out.println("Задача3");
        byte firstGrade = 23;
        byte secondGrade = 27;
        byte thirdGrade = 30;
        short totalSheets = 480;
        System.out.println("Всего " + totalSheets + " листов");
        int totalStudents = firstGrade + secondGrade + thirdGrade;
        System.out.println("Всего учеников " + totalSheets);
        int toEachStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика расчитано " + toEachStudent + " листов бумаги");

    }
    public static void task4(){
        System.out.println("Задача4");
        byte twoMinutes = 16;
        int oneMinutes = twoMinutes / 2;
        byte twentyMinutes = 20;
        short day = 1440;
        short threeDays = 4320;
        long month = 43200000L;
        System.out.println("За 20 минут машина произвела " + oneMinutes * twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneMinutes * day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + oneMinutes * threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMinutes * month + " штук бутылок");

    }
    public static void task5(){
        System.out.println("Задача5");
        byte totalCans = 120;
        byte oneGradeWhite = 2;
        byte oneGradeBrow = 4;
        int totalGrade = 120 / (oneGradeWhite + oneGradeBrow);
        System.out.println("В школе, где " + totalGrade + " классов, нужно " + totalGrade * oneGradeWhite + " банок белой краски и " + totalGrade * oneGradeBrow + " банок коричневой краски");

    }
    public static void task6(){
        System.out.println("Задача6");
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int bananasWeight = bananas * 80;
        System.out.println("Вес банана составляет " + bananasWeight + " грамм");
        short milkWeight = 2 * 105;
        System.out.println("Вес молока составляет " + milkWeight + " грамм");
        int iceCreamWeight = iceCream * 100;
        System.out.println("Вес мороженого составляет " + iceCreamWeight + " грамм");
        int eggsWeight = eggs * 70;
        System.out.println("Вес яиц составляет " + eggsWeight + " грамм");
        int totalWeightInGrams = bananasWeight + milkWeight + iceCreamWeight +eggsWeight;
        System.out.println("Общий вес спортзавтрака составляет " + totalWeightInGrams + " грамм");
        float totalWeightInKg = totalWeightInGrams / 1000f;
        System.out.println("Общий вес спортзавтрака составляет " + totalWeightInKg + " килограмм");
    }
    public static void task7(){
        System.out.println("Задача7");
        short throwGrams = 7 * 1000;
        short theFirstWay = 250;
        short theSecondWay = 500;
        int first = throwGrams / theFirstWay;
        System.out.println("Если спортсмен будет терять по 250гр в день, то на похудение уйдет " + first + " дней");
        int second = throwGrams / theSecondWay;
        System.out.println("Если спортсмен будет терять по 500гр в день, то на похудение уйдет " + second + " дней");
        int averageValue = (first + second) / 2;
        System.out.println("Чтобы добиться  результата похудения, в среднем потребуется " + averageValue + " день");
    }
    public static void task8(){
        System.out.println("Задача8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double increasedMasha = masha * 0.1 + masha;
        double increasedDenis = denis * 0.1 + denis;
        double increasedKristina = kristina * 0.1 + kristina;
        int annualUpToMasha = masha * 12;
        int annualAfterMasha = (int) increasedMasha * 12;
        int differenceMasha = annualAfterMasha - annualUpToMasha;
        System.out.println("Маша теперь получает " + increasedMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        int annualUpToDenis = denis * 12;
        int annualAfterDenis = (int) increasedDenis * 12;
        int differenceDenis = annualAfterDenis - annualUpToDenis;
        System.out.println("Денис теперь получает " + increasedDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        int annualUpToKristina = kristina * 12;
        int annualAfterKristina = (int) increasedKristina * 12;
        int differenceKristina = annualAfterKristina - annualUpToKristina;
        System.out.println("Кристина теперь получает " + increasedKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}