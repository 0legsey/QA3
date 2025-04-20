import Logic.Electronic_Therapist;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Electronic_Therapist therapist = new Electronic_Therapist();
        therapist.addQuestion("У вас есть температура? (да/нет)");
        therapist.addSymptom("температура");
        therapist.addQuestion("У вас болит горло? (да/нет)");
        therapist.addSymptom("боль в горле");
        therapist.addQuestion("Вы испытывете слабость? (да/нет)");
        therapist.addSymptom("слабость");
        therapist.addQuestion("Вы кашляете? (да/нет)");
        therapist.addSymptom("кашель");
        therapist.addQuestion("Вы испытываете боль в животе? (да/нет)");
        therapist.addSymptom("боль в животе");
        therapist.addQuestion("Вы испытывете тошноту? (да/нет)");
        therapist.addSymptom("тошнота");
        List<String> symptoms = therapist.anamnesisCollection();
        String dyagnosis = therapist.evaluateSymptoms(symptoms);
        System.out.println(dyagnosis);
    }
}