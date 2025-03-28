package za.ac.cput.domain;
/* MedicalRecord.java
MedicalRecord model class
Author: Sinovuyo Mathungana (230143725)
Date: 28 March 2025
 */

public class MedicalRecord {
    private String  diagnosis;
    private String treatment;

    private MedicalRecord(Builder builder){
        this.diagnosis = builder.diagnosis;
        this.treatment = builder.treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "diagnosis='" + diagnosis + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }
    public static class Builder {
        private String diagnosis;
        private String treatment;

        public MedicalRecord.Builder setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public MedicalRecord.Builder setTreatment(String treatment) {
            this.treatment = treatment;
            return this;
        }

        public MedicalRecord.Builder copy(MedicalRecord medicalRecord) {
            this.diagnosis = medicalRecord.diagnosis;
            this.treatment = medicalRecord.treatment;
            return this;
        }
        public MedicalRecord build(){return new MedicalRecord(this);
        }
    }

}
