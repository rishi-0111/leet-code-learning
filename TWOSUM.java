import java.util.*;

class Main {

    public void Twosum(int[] a, int key) {

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {

                if(a[i] + a[j] == key) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }

        System.out.println("No Pair Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        Main obj = new Main();

        obj.Twosum(a, key);
    }
}
