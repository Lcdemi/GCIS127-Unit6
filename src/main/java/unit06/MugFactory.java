package unit06;
import java.util.Arrays;

public class MugFactory {
    public static final String MONDAYS = "Mondays, am I right?";
    public static final String TGIF = "TGIF";
    private static final String WOW = "WOW!";
    private static final String GRANDMA  = "Worlds Best Grandma";

    public static void printMug(Mug mug) {
        System.out.println(mug.getSize());
        System.out.println(mug.getFillLevel());
        System.out.println(mug.getColor());
        System.out.println(mug.getPhrase());
        System.out.println(mug.getMaterial());
        System.out.println(mug.getMaterial().getPrice());
    }

    public static void main(String[] args) {
        Mug mug1 = new Mug(24, "pink", 10, MONDAYS, Material.BAMBOO);
        //mug1.phrase = "Mondays, am I right?";
        printMug(mug1);

        Mug mug2 = new Mug(32, "blue", 32, TGIF, Material.CERAMIC);
        printMug(mug2);

        Mug mug3 = new Mug(48, "red", 24, WOW, Material.PLASTIC);
        printMug(mug3);

        Mug mug4 = new Mug(48, "white", 48, GRANDMA, Material.PLASTIC);
        printMug(mug4);

        /*System.out.println(mug1);
        System.out.println(mug2);
        System.out.println(mug3);
        System.out.println(mug4);
        System.out.println(mug3 == mug3);
        System.out.println(mug3 == mug4);
        System.out.println(mug3.equals(mug4));
        System.out.println(mug3.equals(mug2));*/

        Material material = Material.BAMBOO;
        System.out.println(material);
        System.out.println(Material.valueOf("PORCELAIN"));

        Material[] materials = Material.values();
        System.out.println(Arrays.toString(materials));

        for(Material mat : materials) { //for mat in materials: print(mat)
            System.out.println(mat);
        }
    }

}
