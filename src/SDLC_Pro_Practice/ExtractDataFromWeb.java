package SDLC_Pro_Practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Simple Java program to extract all email and phone number
from a web page. Java Regex are used for this program.
To get the content from we page, there have used URL class.
BufferedReader class used to get the lines from web page then
extract those lines to Email and Phone numbers.*/

public class ExtractDataFromWeb {
    public static void main(String[] args){
        try {
            URL url = new URL("https://www.scribd.com/document/523732905/Bangladesh-Business-email-Mobile");
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            Pattern pattern = Pattern.compile("((\\+88)?01[356789]\\d{8})|([\\w\\.]+@[\\w\\.]+)");

            // Regex for BD phone number: (\+88)?01[356789]\d{8}
            // Simple Regex for Email: [\w\.]+@[\\w\\.]+

            /*    Regular Expression for Phone numbers: (0|91)?[6-9][0-9]{9}
            Regular Expression for EmailIds:
            ^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$   */

            /*    Regular Expression for Extract Website Links ::

    (?i)\b((?:[\w-]+:(?:/{1,3}|[a-z0-9%])|www\d{0,3}[.]|[a-z0-9.\-]+[a-z]{2,4}/)(?:[^\s()<>]+|(([^\s()<>]+|(([^\s()<>]+)))))+(?:(([^\s()<>]+|(([^\s()<>]+))))|[^\s`!()\[\]{};:'".,<>?«»""‘’]))  */

            /*
                Regular Expression for Extract Email Addresses ::

    (?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])
            * */

            while ((line=bufferedReader.readLine())!=null){
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    System.out.println(matcher.group());
                }
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
