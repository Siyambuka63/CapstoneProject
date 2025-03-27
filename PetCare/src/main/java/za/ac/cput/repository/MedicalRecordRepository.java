package za.ac.cput.repository;

import za.ac.cput.domain.MedicalRecord;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordRepository implements IRepository<MedicalRecord,String> {
    private static MedicalRecordRepository repository;

    private List<MedicalRecord> medicalRecords;

    private MedicalRecordRepository() {
        medicalRecords = new ArrayList<MedicalRecord>();
    }

    public static MedicalRecordRepository getRepository() {
        if (repository == null) {
            repository = new MedicalRecordRepository();
        }
        return repository;
    }

    @Override
    public MedicalRecord create(MedicalRecord medicalRecord) {
        if (medicalRecords.add(medicalRecord)) {
            return medicalRecord;
        }
        return null;
    }

    @Override
    public MedicalRecord read(String diagnosis) {
        for (MedicalRecord medicalRecord : medicalRecords) {
            if (medicalRecord.getDiagnosis().equals(diagnosis)) {
                return medicalRecord;
            }
        }
        return null;
    }

    @Override
    public MedicalRecord update(MedicalRecord medicalRecord) {
        MedicalRecord oldMedicalRecord = read(medicalRecord.getDiagnosis());
        if (oldMedicalRecord == null) {
            return null;
        }
        MedicalRecord deletedMedicalRecord = delete(oldMedicalRecord.getDiagnosis());
        if (deletedMedicalRecord == null) {
            return null;
        }
        return create(medicalRecord);
    }

    @Override
    public MedicalRecord delete(String diagnosis) {
        MedicalRecord medicalRecord = read(diagnosis);
        if (medicalRecord == null) {
            return null;
        }
        if (medicalRecords.remove(medicalRecord)) {
            return medicalRecord;
        }
        return null;
    }

    @Override
    public List<MedicalRecord> getAll() {
        return medicalRecords;
    }
//    private static MedicalRecordRepository repository = null;
//
//    private List<MedicalRecord> medicalRecords;
//
//    private MedicalRecordRepository() {
//        medicalRecords = new ArrayList<MedicalRecord>();
//    }
//
//    public static MedicalRecordRepository getRepository() {
//        if (repository == null) {
//            repository = new MedicalRecordRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public MedicalRecord create(MedicalRecord medicalRecord) {
//        if (medicalRecords.add(medicalRecord)) {
//            return medicalRecord;
//        }
//        return null;
//    }
//
//    @Override
//    public MedicalRecord read(String s) {
//        for (MedicalRecord medicalRecord : medicalRecords) {
//            if (medicalRecord.getDiagnosis().equals(s)) {
//                return medicalRecord;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public MedicalRecord update(MedicalRecord medicalRecord) {
//        MedicalRecord oldMedicalRecord = read(medicalRecord.getDiagnosis());
//        if (oldMedicalRecord == null) {
//            return null;
//        }
//        MedicalRecord deletedMedicalRecord = delete(oldMedicalRecord.getDiagnosis());
//        if (deletedMedicalRecord == null) {
//            return null;
//        }
//        return create(medicalRecord);
//    }
//
//    @Override
//    public MedicalRecord delete(String s) {
//        MedicalRecord medicalRecord = read(s);
//        if (medicalRecord == null) {
//            return null;
//        }
//        if (medicalRecords.remove(medicalRecord)) {
//            return medicalRecord;
//        }
//        return null;
//    }
//
//    @Override
//    public List<MedicalRecord> getAll() {
//        return medicalRecords;
//    }
}
