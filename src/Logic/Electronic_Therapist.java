package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electronic_Therapist {
    public Electronic_Therapist(){}

    public List<String> anamnesisCollection(){
        //todo добавить полноценную реализацию anamnesisCollection
        List<String> symptoms = new ArrayList<>();
        symptoms.add("температура");
        symptoms.add("боль в горле");
        return symptoms;
    }

    public String evaluateSymptoms(List<String> symptoms){
        return "Возможный диагноз - ангина/ОРВИ. Необходима консультация врача";
    }
}
