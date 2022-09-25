package homework2;

public class Primitives {
    private boolean truth;
    private byte spoon;

    private short aShort;
    private int anInt;
    private long aLong;
    private double aDouble;
    private char aChar;

    private String string;
    private  float aFloat;

    public Primitives() {
    }
    public Primitives(boolean truth) {
        this.truth = truth;
    }
    public Primitives(boolean truth, byte spoon) {
        this.truth = truth;
        this.spoon = spoon;
    }
    public Primitives(boolean truth, byte spoon, short aShort) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
    }

    public Primitives(boolean truth, byte spoon, short aShort, int anInt) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
        this.anInt = anInt;
    }

    public Primitives(boolean truth, byte spoon, short aShort, int anInt, long aLong) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
        this.anInt = anInt;
        this.aLong = aLong;
    }
    public Primitives(boolean truth, byte spoon, short aShort, int anInt, long aLong, double aDouble) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
        this.anInt = anInt;
        this.aLong = aLong;
        this.aDouble = aDouble;
    }

    public Primitives(boolean truth, byte spoon, short aShort, int anInt, long aLong, double aDouble, char aChar) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
        this.anInt = anInt;
        this.aLong = aLong;
        this.aDouble = aDouble;
        this.aChar = aChar;
    }

    public Primitives(boolean truth, byte spoon, short aShort, int anInt, long aLong, double aDouble, char aChar, String string) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
        this.anInt = anInt;
        this.aLong = aLong;
        this.aDouble = aDouble;
        this.aChar = aChar;
        this.string = string;
    }

    public Primitives(boolean truth, byte spoon, short aShort, int anInt, long aLong, double aDouble, char aChar, String string, float aFloat) {
        this.truth = truth;
        this.spoon = spoon;
        this.aShort = aShort;
        this.anInt = anInt;
        this.aLong = aLong;
        this.aDouble = aDouble;
        this.aChar = aChar;
        this.string = string;
        this.aFloat = aFloat;
    }

    public boolean isTruth() {
        return truth;
    }

    public void setTruth(boolean truth) {
        this.truth = truth;
    }

    public byte getSpoon() {
        return spoon;
    }

    public void setSpoon(byte spoon) {
        this.spoon = spoon;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
