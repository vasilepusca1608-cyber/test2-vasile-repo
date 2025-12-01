package Exe12;

public class RunPersoana {
    public static void main(String[] args) {

        DatePersoanei DatePeroanei = new DatePersoanei("Andrei Popescu",23, "2345678902345");
        System.out.println("Nume: "   + DatePeroanei.getNume());
        System.out.println("Varsta: " + DatePeroanei.getVarsta());
        System.out.println("ID: "     + DatePeroanei.getpersonalID());
    }
}
