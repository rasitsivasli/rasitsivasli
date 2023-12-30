package Privat.Projeler;

public class C01_ColorsFormat {
    final static String c_BLACK  = "\u001B[30m";
    final static String c_RED    = "\u001B[31m";
    final static String c_GREEN  = "\u001B[32m";
    final static String c_YELLOW = "\u001B[33m";
    final static String c_BLUE   = "\u001B[34m";
    final static String c_PURPLE = "\u001B[35m";
    final static String c_CYAN   = "\u001B[36m";
    final static String c_WHITE  = "\u001B[37m";
    final static String c_RESET  = "\u001B[0m";
    final static String BOLD     = "\033[0;1m";
    final static String ITALIC   = "\033[3m";
    final static String nITALIC   = "\033[0m";

    public static void main(String[] args) {


        System.out.println( "This text is colored" );
        System.out.println(c_BLACK + "This text is colored" );

        System.out.println(c_RED + "This text is colored" );
        System.out.println(BOLD+c_RED+ "This text is colored" );
        System.out.println(c_GREEN + "This text is colored" );
        System.out.println(c_YELLOW + "This text is colored" );
        System.out.println(c_PURPLE + "This text is colored" );

       /*  ClearScreen,
        System.out.println(System.lineSeparator().repeat(50));
        */
        System.out.println(c_CYAN + "This text is colored" );
        System.out.println(c_WHITE + "This text is colored" );
        System.out.println(BOLD+ "This text is colored" );
        System.out.println(c_YELLOW + "This text is colored" );
        System.out.println(ITALIC + "This text is colored" );
        System.out.println(nITALIC  + "This text is colored" );
        System.out.println(BOLD+ "This text is colored" );
    }
}
