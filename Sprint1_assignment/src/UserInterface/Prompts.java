package UserInterface;
import plants.Plant;
import plants.PlantType;

import javax.swing.*;

public class Prompts {
    public String startPrompt(){
        return JOptionPane.showInputDialog("Ange namnet på plantan för att får reda på matmängd? \nSkriv 'q' för att avsluta programmet.");
    }

    public void resultPrompt(Plant plant){
        String output = "En " + plant.getPlanTypeName() + " med höjden " + plant.getHeight() +
                "m. behöver matas med " + plant.consumption() + "l " + plant.getPLANT_TYPE().foodType + ".";
        JOptionPane.showMessageDialog(null, output);
    }

    public void errorPrompt(String message){
        String output = "Det finns ingen " + message + " På hotellet";
        JOptionPane.showMessageDialog(null, output);
    }
}
