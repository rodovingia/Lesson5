/**
 * Created by ronald on 13-3-2016.
 */
public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("There are " + v.length + " arguments.");

        if (v.length > 0) {
            System.out.println("They are:");
            for (int i = 0; i < v.length; i++) {
                System.out.println("arg " + i + ": " + v[i]);
            }
        }
    }

    public static void main(String args[]) {
        vaTest(1);
        vaTest(3, 2);
    }
}
