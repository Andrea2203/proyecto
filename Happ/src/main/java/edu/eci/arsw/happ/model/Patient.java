package edu.eci.arsw.happ.model;

public class Patient extends User {

    private String idPatient; 
    private String rh;
    private String birthDay;

    public Patient(String idDocument, String documentType, String name,String rh, String birthDay) {
        super(idDocument, documentType, name);
        this.rh = rh;
        this.birthDay = birthDay;
    }

    public String getIdDocumentAdmin() {
        return this.idDocument;
    }

    public String getDocumentTypeAdmin() {
        return this.documentType;
    }

    public String getNameAdmin() {
        return this.name;
    }

    public String getIdPatient(){
        return idPatient;
    }

    public String getRH(){
        return rh;
    }

    public String getBirthDay(){
        return birthDay;
    }

    public void setRH(String rh){
        this.rh = rh;
    }

    public void setIdPatient(String idPatient){
        this.idPatient = idPatient;
    }

    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

}