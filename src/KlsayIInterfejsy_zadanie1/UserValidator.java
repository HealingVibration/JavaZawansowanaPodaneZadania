package KlsayIInterfejsy_zadanie1;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public void validateEmails(String emailInput, String alternativeEmail){

        class Email{
            String emailFromClass;
            String alternativeEmailFromClass;
//"[A-Z][a-z]+@{1}[a-z]+[.com]{1}"
            public Email(){
                if(emailInput.equals("") || emailInput.equals(null)) {
                    this.emailFromClass = "unknown";
                }else{
                    this.emailFromClass = emailInput;
                }
               Pattern pattern = Pattern.compile(".+@.+\\.pl");
                Matcher matcher = pattern.matcher(emailInput);
                if(Pattern.compile(".+@.+\\.com").matcher(emailInput).matches() == false){
                    this.emailFromClass = "Unknown";
                }else {
                    this.emailFromClass = emailInput;
                }

            }

        }
        Email email = new Email();

        System.out.println(email.emailFromClass);
    }

}
