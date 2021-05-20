import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic logic = new Logic();
        int input = sc.nextInt();

        System.out.println("-----------------");
        System.out.println("Zvolte jednu z možností");
        System.out.println("1) Sčítání");
        System.out.println("2) Odčítání");
        System.out.println("3) Násobení");
        System.out.println("4) Dělení");
        System.out.println("5) Mocniny");
        System.out.println("6) Faktoriál");
        System.out.println("-----------------");

        if (input == 1) {
            System.out.println("-----------------");
            System.out.println("-----sčítání-----");
            System.out.println("-----------------");
            System.out.println("Zadej 1. číslo:");
            int a = sc.nextInt();
            System.out.println("Zadej 2. číslo:");
            int b = sc.nextInt();
            System.out.println("Výsledek:" + " " + logic.scitani(a, b));
        }
        if (input == 2) {
            System.out.println("-----------------");
            System.out.println("----odečítání----");
            System.out.println("-----------------");
            System.out.println("Zadej 1. číslo:");
            int a = sc.nextInt();
            System.out.println("Zadej 2. číslo:");
            int b = sc.nextInt();
            System.out.println("Výsledek:" + " " + logic.odcitani(a, b));
        }
        if (input == 3) {
            System.out.println("-----------------");
            System.out.println("-----násobení-----");
            System.out.println("-----------------");
            System.out.println("Zadej 1. číslo:");
            int a = sc.nextInt();
            System.out.println("Zadej 2. číslo:");
            int b = sc.nextInt();
            System.out.println("Výsledek:" + " " + logic.nasobeni(a, b));
        }
        if (input == 4) {
            System.out.println("-----------------");
            System.out.println("-----dělení-----");
            System.out.println("-----------------");
            System.out.println("Zadej 1. číslo:");
            int a = sc.nextInt();
            System.out.println("Zadej .2 číslo:");
            int b = sc.nextInt();
            System.out.println("Výsledek:" + " " + logic.deleni(a, b));
        }
        if (input == 5) {
            System.out.println("-----------------");
            System.out.println("-----mocnění-----");
            System.out.println("-----------------");
            System.out.println("Jaké číslo chceš umocnit:");
            int a = sc.nextInt();
            System.out.println("Výsledek:" + " " + logic.mocnina(a));
        }
        if (input == 6) {
            System.out.println("-----------------");
            System.out.println("----faktoriál----");
            System.out.println("-----------------");
            System.out.println("Zadej číslo pro vytvoření faktoriálu:");
            int a = sc.nextInt();
            System.out.println("Výsledek:" + " " + logic.factorial(a));
        }
    }
}