public class Rotatearray {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;
        int a[] = new int[n];
        int k = 0;
        for (int i = d; i < arr.length; i++) {
            a[k] = arr[i];
            k++;

        }
        for (int i = 0; i < d; i++) {
            a[k] = arr[i];
            k++;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
