public class StringContains{
public static void main(String[] args){
    String sentence = "I love watching anime, playing violin, and learning martial arts and Japanese!";

boolean result = sentence.contains("anime");
    System.out.println(result);
    
    boolean result1 = sentence.contains("Karate");
    System.out.println(result1);
    }
}