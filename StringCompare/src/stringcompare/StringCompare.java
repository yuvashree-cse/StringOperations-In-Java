public class StringCompare{

    public static void main(String[] args){
    String name1 = "Yuva";
    System.out.println("Name 1: "+name1);
    
    String name2 = "Yuvi";
    System.out.println("Name 2: "+name2);
    
    String name3 = "shree";
    System.out.println("Name 3: "+name3);
    
    String name4 = "Yuvashree";
    System.out.println("Name 4: "+name4);
    
    Integer length1 = name1.length();
    Integer length2 = name2.length();
    Integer length3 = name3.length();
    Integer length4 = name4.length();
    
    boolean result1 = name1.equals(name2);
    System.out.println("If name 1 equals name 2 ? "+result1);
    
    boolean result2 = name1.equals(name3);
    System.out.println("If name 1 equals name 3 ? "+result2);
    
    boolean result3 = name4.equals(name1.concat(name3));
    System.out.println("If name1 with name 3 equals name 4 ? "+result3);
    
    boolean result4 = length1.equals(length2);
    System.out.println("If length of name 1 equals length of name 2 ? "+result4);
    
    boolean result5 = length4.equals(length1+length3);
    System.out.println("If length of name 4 equals length of name 1 and name 3 ? "+result5);
    }
}