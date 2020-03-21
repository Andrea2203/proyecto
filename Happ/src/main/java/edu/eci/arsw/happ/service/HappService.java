package edu.eci.arsw.happ.service;

import java.util.List;

import edu.eci.arsw.happ.model.Nurses;
import edu.eci.arsw.happ.model.Patient;

public interface HappService {
    List<Nurses> getNurseAssistants();
    /* List<Patient> getPatients();
    Patient getPatientId(String id);
	List<Patient> getPatientofNurseAsistant(String id); */
}
