public class Main {
    public static void task1(int iniDep) {
    int desiredSum = 2_495_000;
    int sum = 0;
    int amount = 15_000;
        double percent = 10/100;
        int month = 0;
                while (sum < desiredSum) {
                    sum += amount;
                    sum = (int) (sum * (1 + percent));
                    month++;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task2() {
        int i = 0;
        int j = 10;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int currentYears = 2024;
        for (int year = currentYears; year < currentYears + 100; year++) {
            population += birthRate / 1000 - population * deathRate / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4(int iniDep) {
        int percent = 7/100;
        int goal = 12_000_000;
        int sum = amount;
        int month = 0;
        while (sum < amount) {
            sum = (int) (sum * (1 + percent);
            month++;
            System.out.println("Месяц " + month + ". Накоплено: " + sum + "рублей");
        }
    }

    public static void task5(int iniDep) {
        int percent = 7/100;
        int goal = 12_000_000;
        int sum = amount;
        int month = 0;
        while (sum < amount) {
            sum = (int) (sum * (1 + percent);
            month++;
            if (month % 6 ==0) {
            System.out.println("Месяц " + month + ". Накоплено: " + sum + "рублей");
        }
    }
    }

    public static void task6(int iniDep) {
        int percent = 7;
        int years = 9;
        int month1 = years * 12;
        int month = 0;
        int result = 0;
        do {
            result += iniDep;
            result += percentageCalculation(iniDep, percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Накоплено: " + result);
            }
        } while (month <= month1);
    }

    public static void task7() {
        int friday = 2;
        byte days = 31;
        for (; friday <= days; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");

        }
    }

    public static void task8() {
        int emergencePeriod = 79;
        int startSeeing =0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year < end; year++) {
            if (year > start) {
                System.out.println(year);
            }
        }
            for (int year = start; year < end; year++) {
                if (year % emergencePeriod == startSeeing) {
                    System.out.println(year);
                }
            }
    }
}