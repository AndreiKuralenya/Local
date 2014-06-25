
import java.io.IOException; 
import java.io.UnsupportedEncodingException; 
import java.util.Locale; 
import java.util.ResourceBundle; 

public class HamletInternational { 
  public static void main(String[] args) { 
    String country = "", language = ""; 
    System.out.println("1 - Английский"); 
    System.out.println("2 - Белорусский"); 
    System.out.println("Любой символ - Русский");
    char i = 0; 
    try { 
      i = (char) System.in.read(); 
    } catch (IOException e1) { 
      e1.printStackTrace(); 
    } 
    switch (i) { 
     case '1': 
      country = "US"; 
      language = "EN"; 
      break; 
     case '2': 
      country = "BY"; 
      language = "BEL"; 
    } 
    Locale current = new Locale(language, country);
    ResourceBundle rb =  
ResourceBundle.getBundle("text", current); 
    try { 
      String st = rb.getString("str1"); 
      String s1 =  
new String(st.getBytes("ISO-8859-1"), "UTF-8");
      System.out.println(s1); 
 
      st = rb.getString("str2"); 
      String s2 =  
new String(st.getBytes("ISO-8859-1"), "UTF-8");
      System.out.println(s2); 
    } catch (UnsupportedEncodingException e) { 
      e.printStackTrace(); 
    } 
  } 
} 