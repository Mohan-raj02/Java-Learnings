package learnings.concepts.strings;

public class ReverseStrings {
    private String s = "Hello World JAva";

    public String getReverseString(){
        String reversedString = "";
        for (int i=s.length()-1; i>=0; i--){
            reversedString += s.charAt(i);
        }
        return reversedString;
    }
}
