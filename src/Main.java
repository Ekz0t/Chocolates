import java.util.Scanner;

class Chocolates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите бюджет: ");
        int budget = scan.nextInt();

        System.out.print("Введите цену одной шоколадки: ");
        int price_chocolate = scan.nextInt();

        System.out.print("Введите k (за сколько купленных дают 1): ");
        int k = scan.nextInt();

        System.out.print("Введите f (за сколько фантиков дают 1): ");
        int f = scan.nextInt();

        if (budget < 0 || price_chocolate <= 0 || k <= 0 || f <= 1) {
            System.out.println("Ошибка: проверьте введённые значения.");
            return;
        }

        int bought = budget / price_chocolate;
        int total = bought;

        int free = bought / k;
        total += free;

        int fantik = total;
        while (fantik >= f) {
            int newchoco = fantik / f;
            total += newchoco;
            fantik = fantik % f + newchoco;
        }

        System.out.println("Без добавки: " + bought);
        System.out.println("Всего: " + total);
    }
}