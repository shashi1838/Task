import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
  public static void main(String[] argv) {

      String PhNum = "414-888-0989";
    

      Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
      Matcher matcher = pattern.matcher(PhNum);
      
      if (matcher.matches()) {
    	  System.out.println("Phone Number Valid");
      }
      else
      {
    	  System.out.println("Phone Number must be in the form XXX-XXXXXXX");
      }
 }
}