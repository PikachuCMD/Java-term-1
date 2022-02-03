class B {

    public static void main(String[] args) {
        String[] words = Input.stringArray();
        String result = longWord(words);
        System.out.println(result);
    }

    static String longWord(String[] words) {
        String word ="";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= 6 )
            {
                word = words[i];
                break;

            }
        }
        return word;
    }
}
