import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bodentemperatur {
    
    ArrayList<Double> werteBodentemperatur = new ArrayList<Double>();
    

    public void durchschnittswertAusgeben(ArrayList<String> FileLines) {
        double alleWerte = 0;
        DecimalFormat df = new DecimalFormat("#.###");
        for(int i = 0; i < FileLines.size(); i++){
            String currentLine = FileLines.get(i);
            double bodentemperatur = Double.parseDouble(currentLine.substring(55, 62).trim());
            werteBodentemperatur.add(bodentemperatur);
            alleWerte+=bodentemperatur;
        }
        double durchschnitt = alleWerte/werteBodentemperatur.size();
        System.out.println("Durchschnittswert der Bodentemperatur eines typischen unbewachsenen Bodens in 10 cm Tiefe im Januar " + df.format(durchschnitt) + " °C");
    }
}
