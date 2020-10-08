package E1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] num = new int[11];
        System.out.print("¿Cuantas veces quieres tirar los dados? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            Random d1 = new Random();
            int dau1 = d1.nextInt(6) + 1;
            Random d2 = new Random();
            int dau2 = d2.nextInt(6) + 1;
            ++num[dau1 + dau2 - 2];
            n--;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(i + 2 + " --> " + num[i] + " vegades");
        }
    }
}