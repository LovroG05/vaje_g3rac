package Naloga2;

class EnakostranicniTrikotnik extends Lik {
	double stranicaA;                 // zgolj 'package' public

	public EnakostranicniTrikotnik(int x, int y, double stranicaA) {
		super(x, y);
		this.stranicaA = stranicaA;
	}

	@Override
	public double getObseg() {
		return stranicaA * 3;
	}

	@Override
	public double getPloscina() {
		return ((stranicaA * Math.sqrt(stranicaA * stranicaA - (stranicaA / 2) * (stranicaA / 2))) / 2);
	}

	// brez rotacije, prva stranica vzporedna z x-osjo, tretja točka dvignjena nad
	// ... itak je po to maturitetna snov
	//           B
	//           |
	//       A ------ C
	public String toString() {
		String s = "T(A,B,C)=(";
		double x2 = x + stranicaA;
		double y2 = y;
		double x1 = x + stranicaA / 2;
		double y1 = y + stranicaA * 1.732 / 2;
		s += "(" + x + "," + y + ")";    //A
		s += "(" + x1 + "," + y1 + ")";  //B
		s += "(" + x2 + "," + y2 + ")";  //C
		s += ")";
		return s;
	}
}
