/**
 * Created by ronald on 13-3-2016.
 */
public class SerialNumber {
    private static int internalNumber = 0;
    private int mySerialNumber;

    public SerialNumber() {
        mySerialNumber = internalNumber++;
    }

    public int getSerialNumber() {
        return mySerialNumber;
    }
}
