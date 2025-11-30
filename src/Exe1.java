public class Exe1 {
    public static void main(String[] args) {

        byte b = 100;
        short s = b;
        System.out.println("Byte in short: " + s);

        int i = 100;
        double d = i;
        System.out.println("Int in double: " + d);

        long l = 2000;
        int i1 = (int) l;
        System.out.println("Long in int: " + i1);
    }
}
