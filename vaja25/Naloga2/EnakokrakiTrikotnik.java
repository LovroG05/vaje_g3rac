package Naloga2;

public class EnakokrakiTrikotnik extends EnakostranicniTrikotnik {
    public EnakokrakiTrikotnik(int x, int y, double stranicaA) {
        super(x, y, stranicaA);
    }

    public double getObseg() {
        return 2 * stranicaA + Math.sqrt(2) * stranicaA;
    }

    public double getPloscina() {
        return (stranicaA * stranicaA * Math.sqrt(3)) / 4;
    }
}

