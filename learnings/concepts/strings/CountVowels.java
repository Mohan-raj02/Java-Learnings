package learnings.concepts.strings;

public class CountVowels {
    private String s = "Hello World";

//    change to lower case first
    public int getCountVowels(){
        String lower = s.toLowerCase();
        int count = 0;

        for(int i=0; i<=lower.length()-1; i++){
            char c = lower.charAt(i);
            if(c=='a' || c=='e'|| c=='i' || c=='o'|| c=='u' ){
                System.out.println("vowels came:"+ c);
                count++;
            }
        }

        return count;
    }

//    System.out.println(lowerCaseString);
}

