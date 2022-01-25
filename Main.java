import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    private static ArrayList<String> FileLines = new ArrayList<String>();
    public static void main(String[] args){
        getFileLinesForCurrentMonth();
        Bodenfeuchte bodenfeuchte = new Bodenfeuchte();
        bodenfeuchte.durchschnittswertAusgeben(FileLines);
        Bodentemperatur bodentemperatur = new Bodentemperatur();
        bodentemperatur.durchschnittswertAusgeben(FileLines);
    }

    private static void getFileLinesForCurrentMonth(){

        try{
            BufferedReader br = new BufferedReader(new FileReader("wetterdaten_2932.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                int beginYear = line.indexOf(";")+1;
               String year = line.substring(beginYear, beginYear+4);
               String month = line.substring(beginYear+4, beginYear+6);
               if(year.equals("2022") && month.equals("01")){
                FileLines.add(line);
               }
            }
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Something went wrong");
        }
    }
}