public class ArrayPractice1  {

    private static int[] ints = new int[20];

    public static void main(String[] args) {
        populate();
        print(ints);
        if (countones(ints) == 1) {
            System.out.println("\nThere is 1 one in this array.");
        } else {
            System.out.println("\nThere are " + countones(ints) + " ones in this array.");
        }
    }

    public static void populate() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int countones (int[] a) {
        int numberofones = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                numberofones++;
            }
        }
        return(numberofones);
    }
}


    /*
    public static void print1(int[] a){
        for (int i = 0; i < a.length; i++) {

            if ( == 1);{
                countones++;
            }
        }
        System.out.println(countones);
    }
    *

    /*
    public static int countVowels (String a) {
        String vowels = "aeiouyAEIOUY";
        for (int i = 1; i < a.length(); i++) {
            for (int j = i; j < vowels.length(); j++) {
                if (a.substring(i - 1, i).equals(vowels.substring(j-1, j))){
                    return 1;
                }
            }
        }
        return 0;
    }
     */
