import java.util.ArrayList;

public class bt1 {
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        objArray.clear();
        objArray.add(0, "0th");
        objArray.add(1, "1st");
        objArray.add(2, "2nd");
        System.out.println("Trước" + objArray);
        objArray.remove(2);
        System.out.println("Sau" + objArray);
    }
}