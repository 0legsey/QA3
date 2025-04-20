package Tests;

import Logic.Electronic_Therapist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class TestTherapist {
    @Test
    void therapistClassCreationTest(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        Assertions.assertNotNull(therapist);
    }

    @Test
    void anamnesisCollectionTemperatureTest(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        Assertions.assertNotNull(therapist.anamnesisCollection());
    }

    @Test
    void evaluateSymptomsOfTempAndSoreThroat(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        List<String> symptoms = new ArrayList<>(Arrays.asList("температура", "боль в горле"));
        String expected_diagnosis = "Возможный диагноз - ангина/ОРВИ. Необходима консультация врача.";
        Assertions.assertEquals(expected_diagnosis, therapist.evaluateSymptoms(symptoms));
    }

    @Test
    void evaluateSymptomsOfStomachAcheAndNausea(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        List<String> symptoms = new ArrayList<>(Arrays.asList("боль в животе", "тошнота"));
        String expected_diagnosis = "Возможный диагноз - гастрит. Необходимо исключить из рациона жирную пищу и обратиться к гастроэнтерологу.";
        Assertions.assertEquals(expected_diagnosis, therapist.evaluateSymptoms(symptoms));
    }

    @Test
    void addQuestionTest(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        therapist.addQuestion("Есть ли у вас повышенная температура? (да/нет)");
        Assertions.assertTrue(therapist.getQuestionList().contains("Есть ли у вас повышенная температура? (да/нет)"));
    }

    @Test
    void addSymptomTest(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        therapist.addSymptom("температура");
        Assertions.assertTrue(therapist.getSymptomList().contains("температура"));
    }

}
