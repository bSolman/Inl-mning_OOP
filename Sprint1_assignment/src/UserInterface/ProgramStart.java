package UserInterface;

import plants.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramStart {
    List<Plant> plants = new ArrayList<>();
    Prompts prompts;
    public ProgramStart() {
        initPlantsList();
        prompts = new Prompts();
        run();
    }

    private void initPlantsList() {
        // Här har vi lite polymorfism där vi sparar olika klasser i listan med plantor.
        // Det här fungerar eftersom alla olika klasser ärver från Plants.
        plants.add(new Palm(PlantType.PALM, "Olof", 1));
        plants.add(new Cactus(PlantType.CACTUS, "Igge", 0.2));
        plants.add(new MeatEatingPlant(PlantType.MEAT_EATING_PLANT, "MeatLoaf", 0.7));
        plants.add(new Palm(PlantType.PALM, "Laura", 5));
    }

    private void run() {
        while (true){
            String inputName = prompts.startPrompt();
            if (testInputData(inputName)){
                Plant currentPlant = getPlant(inputName);
                assert currentPlant != null;
                prompts.resultPrompt(currentPlant);
            } else if (inputName.equals("q")){
                break;
            }
            else {
                prompts.errorPrompt(inputName);
            }
        }
    }

    private Plant getPlant(String inputName) {
        for (Plant plant: plants){
            if (plant.getNAME().equalsIgnoreCase(inputName)){
                return plant;
            }
        }
        return null;
    }

    // Testar så att efterfrågad växt existerar.
    private boolean testInputData(String userInput) {
        for (Plant plant : plants) {
            if (plant.getNAME().equalsIgnoreCase(userInput)){
                return true;
            }
        }
        return false;
    }
}
