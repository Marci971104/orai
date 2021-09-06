import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        aboutPrint();
        Bekeres();
        int Success = 0; 
        
        //Az a objektummal kérhetünk be a konzolról
        
    
        try {                  */
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


    public static void Bekeres(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Felhasználónév: ");
        String Name = scan.nextLine(); 
        System.out.print("Jelszó: ");                                           //Nem jó megnevezés//
        String Pw = scan.nextLine();
        System.out.print("Hely: ");
        String Place = scan.nextLine();
        scan.close();

    }


    public static void aboutPrint() {
        System.out.println("Nagy János");
        System.out.println("Jelszavak");
        //Verzió kiírása
        System.out.println("Verzió: 0.0.1");

    }
}
