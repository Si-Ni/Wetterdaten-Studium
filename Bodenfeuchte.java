import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bodenfeuchte {

    ArrayList<Integer> werteBodenfeuchte = new ArrayList<Integer>();
    

    public void durchschnittswertAusgeben(ArrayList<String> FileLines) {
        DecimalFormat df = new DecimalFormat("#.###");
        int alleWerte = 0;
        for(int i = 0; i < FileLines.size(); i++){
            String currentLine = FileLines.get(i);
            int bodenwert = Integer.parseInt(currentLine.substring(93, 98).trim());
            werteBodenfeuchte.add(bodenwert);
            alleWerte+=bodenwert;
        }
        double durchschnitt = alleWerte/werteBodenfeuchte.size();
        System.out.println("Durschschnittswert der Bodenfeuchte unter Gras bei sandigem Lehm zwischen 0 - 10cm im Monat Januar: "+ df.format(durchschnitt) + " %nFK");
    }
}
