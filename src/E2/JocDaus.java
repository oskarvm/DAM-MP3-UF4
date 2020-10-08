package E2;

import java.util.Scanner;

public class JocDaus {
    public Dau dau1, dau2, dau3;
    private int ganadas;
    private int jugadas;
    private int perdidas;
    int n;
    Scanner sc = new Scanner(System.in);

    public int getGanadas(){
        return this.ganadas;
    }
    public int getJugadas(){
        return this.jugadas;
    }

    public int getPerdidas(){
        return this.perdidas;
    }

    public JocDaus() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public void menu(){
        do {
            subMenu();
            n = sc.nextInt();
            switch (n){
                case 1:
                    Jugar();
                    System.out.println(toString());
                    jugadas++;
                    if(dau1.getDau() == dau2.getDau() && dau2.getDau() == dau3.getDau()){
                        ganadas++;
                    }
                    else{
                        perdidas++;
                    }
                    break;
                case 0:
                    break;
            }
        }while (n != 0);

    }

    public void Jugar(){
        dau1.tirar();
        dau2.tirar();
        dau3.tirar();

    }

    public void subMenu(){
        System.out.println();
        System.out.println("Menu Dados");
        System.out.println("1 - Tirar dados");
        System.out.println("0 - Salir del juego");
        System.out.print("Elige opción: ");
    }

    @Override
    public String toString() {
        return "Juedo de los dados" + '\n' +  " Dado 1 = " + dau1 + '\n' + " Dado 2 = " + dau2 + '\n' + " Dado 3 = " + dau3;
    }
}
