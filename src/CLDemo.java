/**
 * Created by ronald on 13-3-2016.
 */
public class CLDemo {
    public static void main(String args[]) {
        System.out.println("There are " + args.length + " command-line arguments.");

        if (args.length > 0) {
            System.out.println("They are:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("arg[" + i + "]: " + args[i]);
            }
        }
    }
}
