package Naloga2;

public class PravokotniTrikotnik extends Pravokotnik {
    public PravokotniTrikotnik(int x, int y, double stranicaA, double stranicaB) {
        super(x, y, stranicaA, stranicaB);
    }

    public double getObseg() {
        return stranicaA + stranicaB + Math.sqrt((stranicaA * stranicaA) + (stranicaB * stranicaB));
    }

    public double getPloscina() {
        return (stranicaA * stranicaB) / 2;
    }
}
