import java.util.Random;
import java.util.Scanner;

public class GraMatematyczna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int punkty = 0;
        int iloscPytan = 5;

        System.out.println("Witaj w grze matematycznej!");
        System.out.println("Przed Tobą czeka 5 zadań matematycznych, dasz radę?");
        System.out.println();

        for (int i = 1; i <= iloscPytan; i++) {
            System.out.println("Pytanie #" + i);

            // Generowanie losowego działania matematycznego
            int liczba1 = random.nextInt(10) + 1;
            int liczba2 = random.nextInt(10) + 1;
            int operacja = random.nextInt(3); // 0 - dodawanie, 1 - odejmowanie, 2 - mnożenie

            String znakOperacji;
            int wynik;

            switch (operacja) {
                case 0:
                    znakOperacji = "+";
                    wynik = liczba1 + liczba2;
                    break;
                case 1:
                    znakOperacji = "-";
                    wynik = liczba1 - liczba2;
                    break;
                case 2:
                    znakOperacji = "*";
                    wynik = liczba1 * liczba2;
                    break;
                default:
                    znakOperacji = "+";
                    wynik = liczba1 + liczba2;
                    break;
            }

            System.out.print(liczba1 + " " + znakOperacji + " " + liczba2 + " = ");
            int odpowiedz = scanner.nextInt();

            if (odpowiedz == wynik) {
                System.out.println("Poprawna odpowiedź!");
                punkty++;
            } else {
                System.out.println("Niepoprawna odpowiedź. Prawidłowy wynik to: " + wynik);
            }

            System.out.println();
        }

        System.out.println("Gra zakończona!");
        System.out.println("Twój wynik: " + punkty + "/" + iloscPytan);
    }
}
