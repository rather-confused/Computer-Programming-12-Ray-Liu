public class ArrayPractice2 {

    private static int[] ints = new int[10];

    public static void main(String[] args) {
        populate();
        print(ints);
        System.out.println("\nThe Average of this array is " + average(ints));
        }


    public static void populate() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int average (int[] a) {
        int totalsum = 0;
        int tempsum = 0;
        int totalnumbers = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                totalsum += a[i];
                totalnumbers++;
            }
        }
        int average = totalsum / totalnumbers;
        return(average);
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
