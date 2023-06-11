package Naloga2;

public class Trikotnik extends EnakokrakiTrikotnik {
    double stranicaB;

    public Trikotnik(int x, int y, double stranicaA, double stranicaB) {
        super(x, y, stranicaA);
        this.stranicaB = stranicaB;
    }

    public String toString() {
        return super.toString().substring(0, super.toString().length() - 1) + "," + stranicaB + ")";
    }

    public double getObseg() {
        return stranicaA + stranicaB + Math.sqrt((stranicaA * stranicaA) + (stranicaB * stranicaB));
    }

    public double getPloscina() {
        double s = (stranicaA + stranicaB + Math.sqrt((stranicaA * stranicaA) + (stranicaB * stranicaB))) / 2;
        return Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - Math.sqrt((stranicaA * stranicaA) + (stranicaB * stranicaB))));
    }

}

