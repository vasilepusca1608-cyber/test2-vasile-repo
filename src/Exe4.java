import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        int numar1 = sc.nextInt();

        System.out.print("Introduge al doilea numar: ");
        int numar2 = sc.nextInt();

        System.out.print("Introduce al treilea numar: ");
        int numar3 = sc.nextInt();

        if (numar1 == numar2 && numar2 == numar3){
            System.out.println("Toate numerele sunt egale.");
        } else if (numar1 != numar2 && numar2 != numar3 && numar1 != numar3){
            System.out.println("Toate numerele sunt diferite.");
        } else {
            System.out.println("Nici nu sunt egale, nici diferite.");
        }
    }
}
