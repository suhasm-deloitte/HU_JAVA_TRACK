import java.util.*;

class Anagram {
    public static void main(String[] args) {

        String A = "Silent".toLowerCase();
        String B = "Listen".toLowerCase();

        String[] strA = A.split("");
        String[] strB = B.split("");

        ArrayList<String> List = new ArrayList<String>(Arrays.asList(strA));
        ArrayList<String> List1 = new ArrayList<String>(Arrays.asList(strB));
        Collections.sort(List);
        Collections.sort(List1);

        boolean bool = List.equals(List1);

        if (bool){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("It is not Anagram");
        }
    }
}