public class Task {
    private int first;
    private int second;
    
    /** Constructs a domino with the given two numbers on its two faces. */
    public Domino(int first, int second) {
        checkRange(first);
        checkRange(second);
        this.first = first;
        this.second = second;
    }

    /** Returns the first of the two numbers on this domino. */
    public int first() {
        return first;
    }

    /** Returns the second of the two numbers on this domino. */
    public int second() {
        return second;
    }
    
    /** Reverses the first and second number on this domino. */
    public void flip() {
        int temp = first;
        first = second;
        second = temp;
    }
    
    /**
     * Returns true if the given number is either the first or second number
     * on this domino.
     */
    public boolean contains(int number) {
    	return first == number || second == number;
    }
    
    /**
     * Returns a String representation of this domino, such as "(3|5)".
     */
    public String toString() {
        return "(" + first + "|" + second + ")";
    }
    
    // throws an exception if the given number is not between 0 and 6 inclusive.
    private void checkRange(int d) {
        if (d < 0 || d > 6) {
            throw new IllegalArgumentException("dots out of range: " + d);
        }
    }
}