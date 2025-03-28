package za.ac.cput.repository;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.factory.MedicalRecordFactory;
/* MedicalRecordRepositoryTest.java
MedicalRecordRepository model class
Author: Sinovuyo Mathungana (230143725)
Date: 28 March 2025
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
class MedicalRecordRepositoryTest {
    private static  MedicalRecordRepository repository = MedicalRecordRepository.getRepository() ;
    private MedicalRecord medicalRecord = MedicalRecordFactory.createMedicalRecord("Tuberculosis","Antibiotics");

    @Test
    void a_create() {
        MedicalRecord created = repository.create(medicalRecord);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
        MedicalRecord read = repository.read(medicalRecord.getDiagnosis());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        MedicalRecord newmedicalRecord = new MedicalRecord.Builder().copy(medicalRecord).setTreatment("Surgery").build();
        MedicalRecord updated = repository.update(newmedicalRecord);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        MedicalRecord deletedMedicalRecord = repository.delete(medicalRecord.getDiagnosis());
        assertNotNull(deletedMedicalRecord);
        System.out.println(deletedMedicalRecord);
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}