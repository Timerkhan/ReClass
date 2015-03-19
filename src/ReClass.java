/**
 * Created by Администратор on 19.03.2015.
 */
public class ReClass {
        public static String getNumberStandart(String a) {
            return a.toLowerCase().replaceAll("\\s|\\.", "");
        }
        public static void main(String[] args) throws java.lang.Exception {
            {
                System.out.println("test for commit to Git");
                String n = "wasD.12s 2e daDv.sW";
                System.out.println(getNumberStandart(n));
            }
        }
}
