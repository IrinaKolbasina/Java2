import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета бонусов за покупку билетов.");
        int cost = 15_000;

        System.out.println("Стоимость вашего билета:" + cost);

        int mile = 20;

        int bonus = cost / mile;

        System.out.println("Бонус за вашу покупку:" + bonus);
    }
}
