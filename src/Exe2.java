import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numar de la tastatura: ");
        int numar = sc.nextInt();

        if (numar > 0){
            System.out.println("Numarul este pozitiv.");
        } else if (numar < 0){
            System.out.println("Numarul este negativ");
        }
    }
}
