public class ArrayPractice3 {

    private static int[] ints = new int[10];

    public static void main(String[] args) {
        populate();
        print(ints);
        reverse(ints, 10);
        print(ints);
    }


    public static void populate() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void reverse(int[] in, int n) {
        int a, c;
        a = 0;
        c = in[a];
        in[a] = in[n - a - 1];
        in[n - a - 1] = c;

    }


    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int average(int[] a) {
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
        return (average);
    }


    public static int countones(int[] a) {
        int numberofones = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                numberofones++;
            }
        }
        return (numberofones);
    }
}

