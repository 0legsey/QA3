package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTherapist {
    @Test
    void therapistClassCreationTest(){
        Electronic_Therapist therapist = new Electronic_Therapist();
        Assertions.assertNotNull(therapist);
    }
}
