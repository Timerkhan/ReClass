/**
 * Created by Администратор on 19.03.2015.
 */
public class ReClass {
        public static String getNumberStandart(String a) {
            try {
               return a.toLowerCase().replaceAll("\\s|\\.", "");
            }
            catch (NullPointerException e) {
                return "";
            }
            }
            public static void main(String[] args) throws java.lang.Exception {
            {
                String n = "wasD.12s 2e daDv.sW";
                System.out.println(getNumberStandart(null));
            }
        }
}
