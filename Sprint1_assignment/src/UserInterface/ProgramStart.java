package UserInterface;

import plants.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramStart {
    List<Plant> plants = new ArrayList<Plant>();
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
                // prompts.resultPrompt(inputName, getConsumption(inputName), PlantType.getPlantFoodType(currentPlant.getPLANT_TYPE()), PlantType.getPlantType(currentPlant.getPLANT_TYPE()));
            } else {
                prompts.errorPrompt(inputName);
            }
        }
    }

    private double getConsumption(String inputName) {
        int noNameFound = 0;
        for (Plant plant: plants){
            if (plant.getNAME().equalsIgnoreCase(inputName)){
                return getPlantConsumption(plant);
            }
        }
        return noNameFound;
    }

    private double getPlantConsumption(Plant plant) {
        double noNameFound = 0;

        // här har vi lite polymorfism. Där vi går igenom lite plantor för att se om dom
        // är av en speciell typ av planta.
        if (plant instanceof Palm){
            return plant.consumption();
        } else if (plant instanceof Cactus){
            return plant.consumption();
        } else if (plant instanceof MeatEatingPlant){
            return plant.consumption();
        }
        return noNameFound;
    }

    private Plant getPlant(String inputName) {
        for (Plant plant: plants){
            if (plant.getNAME().equalsIgnoreCase(inputName)){
                return plant;
            }
        }
        return null;
    }

    private boolean testInputData(String userInput) {
        for (Plant plant : plants) {
            if (plant.getNAME().equalsIgnoreCase(userInput)){
                return true;
            }
        }
        return false;
    }
}
