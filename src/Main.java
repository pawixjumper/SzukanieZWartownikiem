import java.io.DataInput;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    private static final int SIZE_ARRAY = 50;

    public static void main(String[] args) {
        System.out.println("Przeszukiwanie Z Wartownikiem");

        System.out.println("\nPodaj element do wyszukania");
        Scanner x = new Scanner(System.in);
        int lookedForNumber = x.nextInt();

        int foundIndex = findNumber(lookedForNumber,sizeArray());
            if (foundIndex == SIZE_ARRAY){
                System.out.println("\nSzukanej liczby " + lookedForNumber + " nie ma w tablicy");
            }else {
                System.out.println("\nSzukana liczba "+ lookedForNumber + " jest w tablicy pod " + foundIndex + " indeksem");

            }


    }



        public static int[] sizeArray(){
            int[] arrayNumber = new int[SIZE_ARRAY];
            for(int i=0; i< SIZE_ARRAY; i++){
                if(i % 10 == 0) System.out.println();
                arrayNumber[i] = (int)(Math.random() * 100);
                System.out.print(arrayNumber[i] + ", ");
            }
            return arrayNumber;
        }


    public static int findNumber(int lookedForNumber, int[] arrayNumbers){
        int[] arrayNumberWithSentry = new int[SIZE_ARRAY + 1];
        for (int i = 0; i < SIZE_ARRAY; i++){
            arrayNumberWithSentry[i] = arrayNumbers[i];
        }

        arrayNumberWithSentry[SIZE_ARRAY] = lookedForNumber;
        int indexNumber = 0;
        for(int i = 0; i<= SIZE_ARRAY; i++){
            if (arrayNumberWithSentry[i] == lookedForNumber){
                indexNumber = i;
                break;
            }
        }
        return indexNumber;
    }

}

//
//
//import java.lang.reflect.Array;
//        import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Przeszukiwanie liniowe zbioru liczbowego");
//
//        System.out.println("Podaj wielkosc tablicy");
//        Scanner scanner = new Scanner(System.in);
//
//        int sizeTab = scanner.nextInt();
//
//        int numberTab[] = new int[sizeTab];
//
//        for (int i = 0; i < sizeTab; i++) {
//            if (i % 10 == 0) System.out.println();
//            numberTab[i] = (int) (Math.random() * 100);
//            System.out.print((numberTab[i] + ", "));
//        }
//
//        System.out.println("Podaj liczbe ktorej szukasz");
//        Scanner scanner2 = new Scanner(System.in);
//
//        int lookedForNumber = scanner2.nextInt();
//
//        boolean isTrue = findNumber(numberTab,lookedForNumber);
//        if(isTrue) System.out.println("Szukana liczba jest w zbiiorze liczb");
//        else System.out.println("szukanej liczby nie ma w zbiorze ok ok");
//
//
//    }
//
//    public static boolean findNumber(int[] numberTab, int lookedForNumber) {
//
//        int i = 0;
//        int n = numberTab.length;
//        while(i<n && numberTab[i] != lookedForNumber) i++;
//        if(i== n) return false;
//        return true;
//
//    }
//
//}
