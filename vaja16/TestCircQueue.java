/**
 * @author Žan Piletič, Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja16
 */
public class TestCircQueue {
	public static void main(String[] args) {
		int pl = 0;

		for(int i = 1; i <= 100; i++) {
			int st = (int) (Math.random() * 100 + 1);

			if(!CircularQueue.jePolna()) {
				if(st > 80 && CircularQueue.jePrazna()) {
					System.out.println("Odvzemanje ni mogoče, saj je vrsta prazna!");
				} else if(st > 80) {
					CircularQueue.odvzemi();
					CircularQueue.pokaziVrsto();
				} else if(st <= 80) {
					CircularQueue.dodaj(i);
					CircularQueue.pokaziVrsto();
				}
			} else pl++;
		}
		if(pl != 0)
			System.out.println("Dodajanje ni možno, saj je vrsta polna:");
		CircularQueue.pokaziTabeloZVrsto();
	}
}
