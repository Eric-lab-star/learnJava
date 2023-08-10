/**
 * main
 */
public class Main {
    public static void main(String[] args) {
	short sMin = -32768;
	short sMax = 32767;
	char cMin = 0;
	char cMax = 65535;

	System.out.println("sMin = " + sMin);
	System.out.println("sMinc -1 = " + (short) (sMin - 1));
	System.out.println("sMax = " + sMax);
	System.out.println("sMax + 1: " + (short) (sMax + 1));
	System.out.println("cMin -1 : " + (int) --cMin);
    }
}
