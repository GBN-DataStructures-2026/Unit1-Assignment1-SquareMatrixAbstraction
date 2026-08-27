
/**
 * Write a description of interface SquareMatrixInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface SquareMatrixInterface {
    /**
    *  returns the size (1-dimensional) of the matrix
    */
    public int getSize();

    /**
    *  mutates the matrix so that the entry at row r, column c is set to value
    */
    public void setValue(int r, int c, int value);

    /**
    *   accesses and returns the entry at row r, column c
    */
    public int getValue(int r, int c);

    /**
    *   mutates the matrix so that every entry is set to value
    */
    public void fillValue(int value);

    /**
    *    mutates the matrix so that every etnry is set to zero
    */
    public void makeZero();

    /**
    *  adds other to this and returns a new matrix representing the sum
    */
    public SquareMatrixInterface add(SquareMatrixInterface other);

    /**
    *  subtacts other from this and returns a new matrix representing the difference
    */
    public SquareMatrixInterface subtract(SquareMatrixInterface other);

    /**
    *  constructs and returns a clone of this matrix
    */
    public SquareMatrixInterface copy();

    /**
    *  returns a String representation of the matrix, displayed 2d in rows and columns
    */
    public String toString();
}
