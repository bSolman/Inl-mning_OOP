package UserInterface;
import javax.swing.*;

public class Prompts {
    public String startPrompt(){
        return JOptionPane.showInputDialog("Ange namnet på plantan för att får reda på matmängd?");
    }

    public void resultPrompt(String message, double amountOfNutricoun, String nutrition){
        String output = "Plantan " + message + " behöver " + amountOfNutricoun + "l " + nutrition;
        JOptionPane.showMessageDialog(null, output);
    }

    public void errorPrompt(String message){
        String output = "Det finns ingen " + message + ". På hotellet";
        JOptionPane.showMessageDialog(null, output);
    }
}
