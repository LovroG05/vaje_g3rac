public class Naloga2 {
    /*
    sled:
    program nastavi celo število i na 4
    v do-while zanki izpiše "to je repeat oz. do-while zanka številka   " in nato številko i
    številko i poveča za 2 in to ponavlja dokler ni enaka 20
    nato izpiše " konec zanke "

    izpis programa je:
    To je repeat oz. do-while zanka številka    4
    To je repeat oz. do-while zanka številka    6
    To je repeat oz. do-while zanka številka    8
    To je repeat oz. do-while zanka številka   10
    To je repeat oz. do-while zanka številka   12
    To je repeat oz. do-while zanka številka   14
    To je repeat oz. do-while zanka številka   16
    To je repeat oz. do-while zanka številka   18
     Konec zanke
     */
    public static void main(String[] args){
        int i=4;
        do {
            System.out.print("To je ");
            System.out.print("repeat oz. do-while zanka ");
            System.out.printf("številka %4d",i);
            System.out.println();
            i = i + 2;
        } while ( i!=20 );
        System.out.println(" Konec zanke ");
    }
}
