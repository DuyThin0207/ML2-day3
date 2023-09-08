import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        nhap();
    }

    static void nhap() {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp số phần tử của mảng a[] :");
        n = sc.nextInt();
        a = new int[n + 1];
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Nhập phần tử a[ " + i + " ] =");
            a[i] = sc.nextInt();
        }
        int x;
        System.out.println("Nhập phần tử cần chèn, x");
        x = sc.nextInt();
        chen(a,x);
    }
    static void chen(int[]a, int x){
        if(a[0]>x){
            for (int i = a.length-1; i >0; i--) {
             a[i] = a[i-1];
            }
        }else if (a[a.length-2] < x){
            a[a.length-1]=x;
        }else {
            int index = 0;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > x){
                    index = i;

                }
                for (int j = a.length-1; j > index ; j--) {
                    a[j]=a[j-1];
                    a[index]=x;
                }
            }
        }display(a);
    }
    static void display(int[]a){
        System.out.println("Mảng a[]: ");
        for (int x:a) {
            System.out.println(x + "");
            System.out.println(" ");
        }
    }
}