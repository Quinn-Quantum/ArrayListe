import java.util.ArrayList; // import the ArrayList class

public class Start_A2_1 {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        //20 zufällig erzeugten Zahlen in der Liste hinzufügen.
        for (int j = 0; j < 20; j++){
            myList.add((int) (Math.random() * 9 + 1));
        }


        //Formatierte Ausgabe einer Liste
        for (int i = 0; i < myList.size(); i++)
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));

    }
}
