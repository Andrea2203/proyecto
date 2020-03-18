package edu.eci.arsw.happ.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.happ.service.HappException;
import edu.eci.arsw.happ.service.HappService;

@RestController
public class HappController {

    @Autowired
    HappService happService;

    @RequestMapping(value = "/nurses-assistants",method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETNursesAssistants() throws HappException {
        return new ResponseEntity<>(happService.getNurseAssistants(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value ="/patient", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETPatients() throws HappException {
        return new ResponseEntity<>(happService.getPatients(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETPatientID(@PathVariable ("id") String id) throws HappException {
        return new ResponseEntity<>(happService.getPatientId(id), HttpStatus.ACCEPTED);
    }

}