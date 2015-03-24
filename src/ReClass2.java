/**
 * Created by Администратор on 24.03.2015.
 */
public class ReClass2 {
    public static String getNumberStandart(String a) {
        try {
            return a.toLowerCase().replaceAll("[^a-z0-9а-я]", "");
        }
        catch (NullPointerException e) {
            return "";
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        {
            String n = "wasD.12s 2e daDv.sW";
            System.out.println(getNumberStandart(n));
        }
    }
}
