import java.util.Arrays;

public class bt3 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        int [] arr2 = {2,4,6,8};
        int[] dst = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, dst, 0, arr2.length);
        System.arraycopy(arr2, 0, dst, arr.length, arr2.length);
        System.out.println(Arrays.toString(dst));
    }
}
