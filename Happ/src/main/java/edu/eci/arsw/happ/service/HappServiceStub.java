package edu.eci.arsw.happ.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.happ.model.NurseAssistant;
import edu.eci.arsw.happ.model.Patient;

@Service
public class HappServiceStub implements HappService {
    @Autowired
    private DataSource dataSource;


    @Override
    public List<NurseAssistant> getNurseAssistants() {
        String query = "SELECT * FROM nurseassistant;";
        List<NurseAssistant> nursesAssistants = new ArrayList<NurseAssistant>();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String idDocument = rs.getString("idDocument");
				String documentType = rs.getString("documentType");
				String name = rs.getString("name");
				NurseAssistant nurseAssistant = new NurseAssistant(idDocument,documentType,name);
				nursesAssistants.add(nurseAssistant);
			}
			connection.close();
			return nursesAssistants;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }

    @Override
    public List<Patient> getPatients() {
        String query = "SELECT * FROM patient;";
        List<Patient> patients = new ArrayList<Patient>();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String idDocument = rs.getString("idDocument");
				String documentType = rs.getString("documentType");
				String name = rs.getString("name");
				Patient patient = new Patient(idDocument,documentType,name);
				patients.add(patient);
			}
			connection.close();
			return patients;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }

    @Override
    public Patient getPatientId(String id) {
        String query = "SELECT * FROM patient WHERE iddocument="+id+";";;
        Connection connection = null;
        Patient paciente ;
        try {
            connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
            String idDocument = rs.getString("idDocument");
            String documentType = rs.getString("documentType");
            String name = rs.getString("name");
            paciente = new Patient(idDocument,documentType,name);

			connection.close();
			return paciente;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }
    
}