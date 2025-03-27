package za.ac.cput.factory;

import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.util.Helper;

public class MedicalRecordFactory {
    public static MedicalRecord createMedicalRecord(
                                String diagnosis,
                                String treatment){
        if (Helper.isNullOrEmpty(diagnosis)) return null;
        if (Helper.isNullOrEmpty(treatment)) return null;
        return new MedicalRecord.
                   Builder().
                   setDiagnosis(diagnosis).
                   setTreatment(treatment).
                   build();
    }
}
