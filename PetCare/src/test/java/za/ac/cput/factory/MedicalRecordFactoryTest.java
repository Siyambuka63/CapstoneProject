package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;
/* MedicalRecordFactoryTest.java
MedicalRecordFactoryTest model class
Author: Sinovuyo Mathungana (230143725)
Date: 28 March 2025
 */
class MedicalRecordFactoryTest {
    private MedicalRecord medicalRecordWithoutDiagnosis = MedicalRecordFactory.createMedicalRecord("","Cold medicine");
    private MedicalRecord medicalRecordWithoutTreatment = MedicalRecordFactory.createMedicalRecord("Flu","");
    private MedicalRecord medicalRecord= MedicalRecordFactory.createMedicalRecord("Flu","Parnado");

    @Test
    void createMedicalRecord() {
        assertNotNull(medicalRecord);
        System.out.println(medicalRecord);
    }
    @Test
    void createmedicalRecordWithoutDiagnosis() {
        assertNotNull(medicalRecordWithoutDiagnosis);
        System.out.println(medicalRecordWithoutDiagnosis);
    }
    @Test
    void createmedicalRecordWithoutTreatment() {
        assertNotNull(medicalRecordWithoutTreatment);
        System.out.println(medicalRecordWithoutTreatment);
    }

}