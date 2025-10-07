package learnings.concepts.strings;

public class CheckPalindrome {
    public String name = "race car";


    public void getPalindrome(){
        String cleanName = name.replaceAll("\\s+", "").toLowerCase();
        String rev = "";

        for (int i = cleanName.length()-1 ; i>=0; i--){
            rev += cleanName.charAt(i);
        }

        if(rev.equals(cleanName)){
            System.out.println("is palaindrome");
        }else{
            System.out.println("not a palaindrome");
        }

//     return true;
    }
}
