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
        Assertions.assertTrue(therapist.anamnesisCollection().contains("температура"));
    }

    @Test
    void anamnesisCollectionTempAndSoreThroatTest(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        Assertions.assertTrue(therapist.anamnesisCollection().contains("температура") && therapist.anamnesisCollection().contains("боль в горле"));
    }

    void evaluateSymptomsOfTempAndSoreThroat(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        List<String> symptoms = new ArrayList<>(Arrays.asList("температура", "боль в горле"));
        String expected_diagnosys = "Возможный диагноз - ангина/ОРВИ. Необходима консультация врача";
        Assertions.assertEquals(expected_diagnosys, therapist.evaluateSymptoms(symptoms));
    }

}
