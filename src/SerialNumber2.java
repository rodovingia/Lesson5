/**
 * Created by ronald on 13-3-2016.
 */
public class SerialNumber2 {
    private static int internalNumber;
    private int mySerialNumber;

    static {
        internalNumber = 0;
    }

    public SerialNumber2() {
        mySerialNumber = internalNumber++;
    }

    public int getSerialNumber() {
        return mySerialNumber;
    }
}
