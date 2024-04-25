package unit06;
import java.util.Arrays;

public class Objects {
    public static Object[] funWithObjects(Object obj) {
        Object[] objArray = new Object[5];
        objArray[0] = obj.toString();
        objArray[1] = 123;
        objArray[2] = false;
        objArray[3] = new int[5];
        objArray[4] = new Mug(24, "red", 0, "whatever", Material.STAINLESS_STEEL);
        
        System.out.println(objArray[1].getClass());
        
        return objArray;
    }

    public static void main(String[] args) {
        Object[] objArray = funWithObjects(new Calculon());
        System.out.println(Arrays.toString(objArray));
    }
}
