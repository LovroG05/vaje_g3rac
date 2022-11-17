public class Naloga1 {
    /*
    sled izvajanja originala:
    zažene se metoda main
    spremenljivka x tipa char se nastavi na 'o'
    konstanta y tipa char se nastavi na 'A'
    v do whileu se x zmanjša za 2 in izpiše dokler je x večji ali enak y

    izpiše se "MKIGECA?"
     */
    public static void main(String[] args) {
        char x='O';            // je črka O
        final char y='A';      // to je konstanta
        x--; x--;
        System.out.print(x);
        while (x>=y) {
            x--; x--;
            System.out.print(x);
        }
    }
}
