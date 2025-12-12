
import java.util.Arrays;

public class StringSpilt{
  public static void main(String[] args) {
    String name = "y::u::v:a";

    String[] result = name.split("::");

    System.out.println("result = " + Arrays.toString(result));
  }
}