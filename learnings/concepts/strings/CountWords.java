package learnings.concepts.strings;

public class CountWords {
    public String text;

    CountWords(String word){
        this.text = word;
    }

    public void getWords(){
        String[] words = text.split(" ");
        System.out.println(words.length);
    }
//    String[]
}
