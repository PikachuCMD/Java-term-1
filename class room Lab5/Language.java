public class Language {
    private int consonants;
    private int vowels;

    public Language(int consonants,int vowels)
    {
        this.consonants=consonants;
        this.vowels=vowels;
    }
    public int getConsonants()
    {
        return consonants;
    }
    public int getVowels()
    {
        return vowels;
    }
    public String toString()
    {
        return consonants+" consonants, "+vowels+" vowels, total "+(consonants+vowels)+" letters";
    }
    public boolean hasNoVowels()
    {
        if(vowels==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
