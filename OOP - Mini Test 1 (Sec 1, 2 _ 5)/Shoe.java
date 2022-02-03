class Shoe {
    private String name;
    private char gender;
    private int size;

    public Shoe(String name, char gender, int size) {
        this.name = name;
        this.gender = gender;
        this.size = size;
    }
    public String getName()
    {
        return name;
    }
    public char getGender()
    {
        return gender;
    }
    public int getSize()
    {
        return size;
    }
}