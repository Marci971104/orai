import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        aboutPrint();
        //Fejrész kiírása
        System.out.println("Jelszavak");
        //Verzió kiírása
        System.out.println("Verzió: 0.0.1");
        
        //Az a objektummal kérhetünk be a konzolról
        Scanner scan = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        // A b változó tárolja a fnév
        String Name = scan.nextLine(); 
        System.out.print("Jelszó: ");                                           //Nem jó megnevezés//
        String Pw = scan.nextLine();
        System.out.print("Hely: ");
        String Place = scan.nextLine();
        scan.close();
        int Success = 0;                                                             //Interface megjelölése nem helyes//
        try {
            /* 
            A jelszó, a felhasználónév és a 
            használati helye a profile 
            objektumban van tárolva                    */
            Profile profile = new Profile(Name, Pw, Place);
            FileWriter fileWriter = new FileWriter("pass.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(profile.user);
            if(!profile.isPassEmpty()) { printWriter.print(profile.getPass()); }
            printWriter.print(profile.place);
            printWriter.close();
           Success = 1;
        } catch (IOException exc) {
            System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
        }

        if(Success == 1) { System.out.println("Ok. A kiírás sikeres.");  }
        
        else {  System.out.println("Hiba! A kiírás sikertelen"); }

    }

    public static void aboutPrint() {
        System.out.println("Nagy János");

    }
}
