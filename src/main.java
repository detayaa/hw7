public class main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int month = 0;
        int money = 0;
        while (money < 2_459_000) {
            month += 1;
            money += 60000;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");


        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }


        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println("Задание 3");
        int people = 12000000;
        int born = 17 * (people / 1000);
        int die = 8 * (people / 1000);
        int allPeople = people + (born - die);
        for (int year = 1; year <= 10; year++) {
            allPeople = people + allPeople;
            System.out.println("Год " + year + " численность населения составляет " + allPeople);
        }

        System.out.println("Задание 1.2");
        int salary = 15000;
        for (int r = 1; salary <= 12_000_000; r++) {
            salary += ((salary * 7) / 100) + salary;
            if (r % 6 == 0) {
                System.out.println("Месяц " + r + " сумма равна " + salary);
            }
        }
        System.out.println("Задание 3.2");
        int salaryy = 15000;
        int m = 1;
        while (m < 108) {
            m ++;
            salaryy += ((salaryy * 7) / 100) + salaryy;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + " сумма равна " + salaryy);
            }
        }
        System.out.println("Задание 4.2");
        int friday = 7;
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        while (friday < 31){
            friday += 7;
            if (friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("Задание 1.3");
        int before = 2022 - 200;
        int future = 2022 + 100;
        while (before < 2022) {
            before++;
            if (before % 79 == 0) {
                System.out.println(before);
            }
        }
        while (future > 2022) {
            future --;
            if (future % 79 == 0) {
                System.out.println(future);
            }
        }




    }
}