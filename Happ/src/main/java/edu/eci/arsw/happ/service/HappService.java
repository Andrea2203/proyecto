package edu.eci.arsw.happ.service;

import java.util.List;

import edu.eci.arsw.happ.model.NurseAssistant;
import edu.eci.arsw.happ.model.Patient;

public interface HappService {
    List<NurseAssistant> getNurseAssistants();
    List<Patient> getPatients();
    Patient getPatientId(String id);
}
