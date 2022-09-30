import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;


public class Start_A2_1 {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        //20 zufällig erzeugten Zahlen in der Liste hinzufügen.
        for (int j = 0; j < 20; j++) {
            myList.add((int) (Math.random() * 9 + 1));
        }

        //Formatierte Ausgabe einer Liste
        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        }

        //Eingabe einer beliebigen Suchzahl zwischen 1 und 9 durch den Benutzer.
        int zahl;
        Scanner scannerVariable = new Scanner(System.in);
        System.out.print("Geben sie einen Int zwischen 0 und 9 ein: ");
        zahl = scannerVariable.nextInt();
        if (zahl > 0 && zahl < 10) {
        //Ausgabe aller Indices, an denen die Suchzahl auftritt
            System.out.print("Die Zahl komt an folgenden Indexen vor:\n");
            searchIndex(zahl,myList);

        } else {
            System.exit(0);
        }


    }

    private static void searchIndex(int zahl, ArrayList<Integer> myList) {
        int anzahl = 0;
        ArrayList<Integer> indexsearch = new ArrayList<Integer>();
        for( int i = 0; i < myList.size(); i++){
            if(zahl == myList.get(i)) {
                System.out.printf("Index: %d\n",i );
                indexsearch.add(i);
                anzahl++;

            }
        }
        System.out.printf("Insgesamt kommt die Zahl %d %d vor.\n", zahl, anzahl);
        deletIndes(indexsearch, myList);

    }

    private static void deletIndes(ArrayList<Integer> indexsearch, ArrayList<Integer> myList) {
        if(indexsearch.size() > 0){
            System.out.print(indexsearch.size());
            for(int i = indexsearch.size() - 1;i > 0; i--){
                int indextoremof = indexsearch.get(i);
                myList.remove(indextoremof);

            }

            for (int j : myList) {
                System.out.println(j);
            }
            System.out.println();
            //Einfügen einer 0 als neues Element hinter jeder 5 in der Liste.
            //Ausgabe der Liste.
            System.out.print("add 0\n");
            addfive(myList);

        }
        else{
            System.exit(0);
        }


    }

    private static void addfive(ArrayList<Integer> myList) {
        for(int k = 0 ; k < myList.size();k++){
            int isfive = myList.get(k);
            if(isfive == 5){
                myList.add(k+1,0);
            }
        }
        for (int j : myList) {
            System.out.println(j);
        }
    }


}



