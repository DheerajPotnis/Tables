import java.util.*;

class tables {

    public static void number(int x){
        for (int i = 1; i <= 10; i++) {
        System.out.println (x + " X " + i + " = " + (x*i));
        }
        }

    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner sc = new Scanner (System.in);
        number(sc.nextInt());
    }
}