import java.text.*;
import java.util.*;
public class PROGRAM4 {
    public static void main(String args[])
    {
        SimpleDateFormat formatDate = new SimpleDateFormat(
            "dd/MM/yyyy  HH:mm:ss z");
        //"SimpleDateForma" class initialize with object
        //"formatDate" this class acceptes the format of
        // date and time as ""dd/MM/yyyy" and "HH:mm:ss z""
        //"z" use for print the time zone
  
        Date date = new Date();
        // initialize "Date" class
  
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        // converting to IST or fornmat the Date as IST
  
        System.out.println(formatDate.format(date));
        // print formatted date and time
    }
}