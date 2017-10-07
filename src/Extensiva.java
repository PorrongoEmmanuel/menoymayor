import java.util.Scanner;

public class Extensiva {

    public static void main(String[]args) {

        int n1, n2, n3, n4;
        Scanner red = new Scanner(System.in);

        System.out.print(" introduzca el numero 1: ");
        n1 = red.nextInt();

        System.out.print(" introduzca el numero 2: ");
        n2 = red.nextInt();

        System.out.print(" introduzca el numero 3: ");
        n3 = red.nextInt();

        if (n1 < n2 && n1 < n3) {

            if (n2 < n3) {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
        }
        //bien---------------------------

        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
            }
            //----------------
        } else {
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
        }

        ///
        if (n3 < n1 && n3 < n2) {

            if (n1 < n2) {
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1);
            }


            return;

        }
    }}


