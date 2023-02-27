
/**
 * Realizacija 1. dela
 */
public class N3 {

	public static void main(String[] args) {
		CircularQueue.pokaziVrsto();

		if(CircularQueue.jePrazna())
			System.out.println("Prazna");

		CircularQueue.dodaj(17);
		CircularQueue.pokaziVrsto();
		CircularQueue.dodaj(5);
		CircularQueue.dodaj(11);
		CircularQueue.dodaj(6);
		CircularQueue.dodaj(76);
		CircularQueue.dodaj(98);
		CircularQueue.dodaj(1);
		CircularQueue.pokaziVrsto();

		if(CircularQueue.jePolna())
			System.out.println("Polna");

		CircularQueue.odvzemi();
		CircularQueue.pokaziTabeloZVrsto();
		CircularQueue.dodaj(456);
		CircularQueue.dodaj(743);

		if(CircularQueue.jePolna())
			System.out.println("Polna");


		CircularQueue.pokaziTabeloZVrsto();
		CircularQueue.dodaj(930);

		if(CircularQueue.jePrazna())
			System.out.println("Prazna");
		else
			System.out.println("Polna");

		CircularQueue.pokaziVrsto();

		CircularQueue.pokaziTabeloZVrsto();
		CircularQueue.dodaj(999);
		CircularQueue.pokaziTabeloZVrsto();

		CircularQueue.pokaziVrsto();
		CircularQueue.dodaj(168);
		CircularQueue.dodaj(333);
		CircularQueue.dodaj(654);
		CircularQueue.pokaziVrsto();
		CircularQueue.pokaziTabeloZVrsto();
	}

}
