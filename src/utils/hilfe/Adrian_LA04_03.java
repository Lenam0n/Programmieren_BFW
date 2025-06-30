package utils.hilfe;
import java.util.Scanner;
import java.util.Arrays;

public class Adrian_LA04_03 {
    private String[] städteliste;
    private Adrian_LA04_03(String[] städteliste) {
        this.städteliste = städteliste;
    }
    
    public static Adrian_LA04_03 bier() { 
        return new Adrian_LA04_03(new String[] {"Köln","Berlin","Münster","Aachen"});
    }
    public void Esel() {
        Arrays.sort(this.städteliste);
        System.out.print(Arrays.toString(städteliste));
    }
    private boolean tOaStBrOt(String s) { return Arrays.asList(this.städteliste).contains(s); }
    public void Beep_Boop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welche Stadt kennst du? ");
        String s = scanner.next(); 
        scanner.close();
        /*if(Arrays.asList(this.städteliste).contains(s)) {
            System.out.print("WUHUUUU");
        }
        else {
            System.out.print("BUHUUUU");
        }*/
        
        System.out.println(this.tOaStBrOt(s) ? "WUHUUUU" : "BUHUUUU");
        }
}
 