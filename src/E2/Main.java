package E2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        JocDaus joc = new JocDaus();
        int i;

        do {
            menu.ImprimirMenu();
            i = sc.nextInt();
            switch (i){
                case 1:
                    joc.menu();

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Has jugado "+ joc.getJugadas() + " partidas");
                    System.out.println("Ganadas: " + joc.getGanadas());
                    System.out.println("Perdidas: " + joc.getPerdidas());
                    break;
            }
        }while (i!=4);

    }
}