import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Благодарим за участие в акции РУБЛЬ ЗА 100!");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите сумму Вашего текущего баланса:");
        int balance = console.nextInt();
        System.out.println("Введите сумму платежа:");
        int pay = console.nextInt();
        int minPayForBonus = 1000;
        int bonus = pay / 100;
        if (pay < minPayForBonus) {
            bonus = 0;
        }
        int full = balance + pay + bonus;

        if (pay > minPayForBonus) {
            System.out.println("Сумма бонуса составит " + bonus + " руб.");
            System.out.println("Итоговая сумма на счете составит " + full + " руб.");

        } else {
            System.out.println("Сумма платежа ниже минимальной для начисления бонуса.");
            System.out.println("Итоговая сумма на счете составит " + full + " руб.");
        }

    }
}