
/**
 * Write a description of interface SquareMatrixInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface SquareMatrixInterface {
    public int getSize();
    public void setValue(int r, int c, int value);
    public int getValue(int r, int c);
    public void fillValue(int value);
    public void makeZero();
    public SquareMatrixInterface add(SquareMatrixInterface other);
    public SquareMatrixInterface subtract(SquareMatrixInterface other);
    public SquareMatrixInterface copy();
    public String toString();
}
