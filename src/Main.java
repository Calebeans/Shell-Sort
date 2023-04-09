import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vecto[] = {8,4,7,2,8,2,9,1,0};

        System.out.println("Original:");
        System.out.println(Arrays.toString(vecto));

        shellSort(vecto, 9);

        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(vecto));
    }

    private static void shellSort(int v[], int n){
        int h, x, i, j;

        for (h = 1; h < n; h = 3*h+1);

        while (h>1){
            h = h/3;
            for (i = h; i < n; i++) {
                x = v[i];
                j = i;
                while (j>=h && v[j-h] > x) {
                    v[j] = v[j-h];
                    j = j - h;
                }
                v[j] = x;
            }
        }
    }
}