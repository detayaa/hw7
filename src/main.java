public class main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int month = 0;
        int money = 0;
        while (money < 2_459_000) {
            month += 1;
            money += 60000;
        } System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");



        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }


        for (int a = 10; a >= 1; a --) {
            System.out.print(a + " ");
        }

        System.out.println("Задание 3");
        int people = 12000000;
        int born = 17 * (people / 1000);
        int die = 8 * (people / 1000);
        int allPeople = people + (born - die);
        for (int year = 1; year <= 10; year ++ ){
            allPeople = people + allPeople;
            System.out.println("Год " + year + " численность населения составляет " + allPeople);
        }

        System.out.println("Задание 1.3");
        int salary = 15000;
        for (int r = 1; salary <= 12_000_000; r ++) {
            salary += ((salary * 7) / 100) + salary;

            System.out.println("Месяц " + r + " сумма равна " + salary);
        }
        System.out.println("Задание 1.2");
        int salary = 15000;
        for (int r = 1; salary <= 12_000_000; r ++) {
            salary += ((salary * 7) / 100) + salary;

            System.out.println("Месяц " + r + " сумма равна " + salary);


    }
}
