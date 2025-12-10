public class StringConcat{
public static void main(String[] args){
    
    String word1 = "Work ";
    System.out.println("First String: "+word1);
    
    String word2 = "Hard, ";
    System.out.println("Second String: "+word2);
    
    String word3 = "Don't ";
    System.out.println("Third String: "+word3);
    
    String word4 = "Lose ";
    System.out.println("Fourth String: "+word4);
    
    String word5 = "Hope!";
    System.out.println("Fifth String: "+word5);
    
    String joined1 = word1.concat(word2);
    String joined2 = joined1.concat(word3);
    String joined3 = joined2.concat(word4);
    String joined4 = joined3.concat(word5);
    
    System.out.println("Joined String: "+joined4);
}
}