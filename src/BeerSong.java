

public class BeerSong {

    public static void main(String args[]) {

        Ninety_Nine_Bottles_of_Beer();

    }

    public static void Ninety_Nine_Bottles_of_Beer() {

        int no = 99;

        while (no >= 1) {

            if (no == 1) {

                System.out.println(no + " bottles of beer on the wall," + no

                        + " bottles of beer\ntake one down, pass it around,no more bottles of beer on the wall.");

            } else {

                System.out.println(

                        no + " bottles of beer on the wall," + no + " bottles of beer\ntake one down, pass it around,"

                                + (no - 1) + " bottles of beer on the wall.");

            }

            no--;

        }

    }

}