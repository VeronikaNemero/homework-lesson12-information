import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Information {

    public String text;

    public Information(String text) {
        this.text = text;
    }

    public void getPhoneNumber(){
        String exp = "\\+\\(\\d{2}\\)\\d{7}";
        Pattern pattern = Pattern.compile(exp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println("phone number: " + group);
        }
    }

    public void getEMail(){
        String exp = "[a-z]+\\@[a-z]+\\.[a-z]+";
        Pattern pattern = Pattern.compile(exp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println("email: " + group);
        }
    }

    public void getDocNumber(){
        String exp = "\\d{4}-\\d{4}-\\d{2}";
        Pattern pattern = Pattern.compile(exp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println("document number: " + group);
        }
    }
}
