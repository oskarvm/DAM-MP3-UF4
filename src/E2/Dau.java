package E2;

import java.util.Random;

public class Dau {

    public int dau;
    Random d = new Random();

    public int getDau() {
        return dau;
    }

    public void setDau(int dau) {
        this.dau = dau;
    }

    @Override
    public String toString() {
        return "" + dau;
    }

    public int tirar(){
        dau = d.nextInt(6) + 1;
        return dau;
    }
}

