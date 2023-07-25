import java.util.Scanner;

public class TicTacToe {
    static String nameU1,nameU2;
    static String Sy1,Sy2;
    static users u1 = new users(nameU1,Sy1);
    static users u2 = new users(nameU2,Sy2);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        basics();
        rules();
        System.out.println("Who want to start 1st? "+u1.name+" OR "+u2.name);
        String first = sc.nextLine();
        if(first.equals(u1.name)){
            start(u1.name);

        } else if (first.equals(u2.name)) {
            start(u2.name);
        }
    }

    static void start(String s) {
        if (s.equals(u1.name)) {
            System.out.println("\n"+ u1.name+" will play 1st and will use\""+u1.Symbol);

        } else {

            System.out.println("\n \""+ u2.name+"\" will play 1st and will use\""+u2.Symbol+"\"");
        }
    }


    static int InputByUser(){
        //Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int a = sc.nextInt();
            if(a>0 && a<10) {
                //System.out.println(a);
                return a-1;
            }
            else {
                System.out.print("Enter in-between 1-9! Enter again: ");
                return InputByUser();
            }
        }
        else {
            System.out.print("only Integers are allowed! Enter again: ");
            return InputByUser();
        }
    }



    private static void rules() {
        System.out.println("The Structure of the game is like this");
        System.out.println(
                  "-------------------" +
                "\n    1 | 2 | 3 " +
                "\n   ---|---|---- " +
                "\n    4 | 5 | 6 " +
                "\n   ---|---|---- " +
                "\n    7 | 8 | 9 " +
                "\n-------------------");
        System.out.println(" ---------------------------------------------------------------------- ");
        System.out.println("|' you have to enter positions 1 to 9 (also guided in above example) ' |");
        System.out.println(" ---------------------------------------------------------------------- ");
    }

    static String SymbolBool(){
        //Scanner sc = new Scanner(System.in);
        String Symbol=sc.next();
        Symbol = String.valueOf(Symbol.charAt(0));
        if(Symbol.equals("x")||Symbol.equals("X")||Symbol.equals("o")||Symbol.equals("O")){
                return Symbol.toUpperCase();
        }else {
            System.out.print("Invalid input, Enter again:");
            return SymbolBool();
        }
    }


    static void basics(){
        System.out.println("Welcome");
        System.out.println("This is a two player game!");
        System.out.print("what is the name of user 1: ");
        nameU1=sc.nextLine();
        u1.name=nameU1;
        System.out.print("Enter Symbol for user 1 (x or o): ");
        Sy1 = SymbolBool();
        u1.Symbol=Sy1;
        System.out.println("Welcome \""+u1.name+"\", You selected \""+u1.Symbol+"\"");
        sc.nextLine();
        System.out.print("what is the name of user 2: ");
        nameU2=sc.nextLine();
        u2.name=nameU2;
        //System.out.print("You have assigned this Symbol: ");
        if(Sy1.equals("X")){
            Sy2="O";
            u2.Symbol=Sy2;
            //System.out.println(Sy2);
        }
        else {
            Sy2="X";
            u2.Symbol=Sy2;
            //System.out.println(Sy2);
        }
        System.out.println("Welcome \""+u2.name+"\", You selected \""+u2.Symbol+"\"");
    }
}
