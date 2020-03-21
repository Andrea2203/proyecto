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

    //Consultar todas las enfermeras auxiliares
    @RequestMapping(value = "/nurses-assistants",method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETNursesAssistants() throws HappException {
        return new ResponseEntity<>(happService.getNurseAssistants(), HttpStatus.ACCEPTED);
    }
    
   /*  //Consultar un paciente por su id
    @RequestMapping(path ="patient/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETPatientID(@PathVariable ("id") String id) throws HappException {
        return new ResponseEntity<>(happService.getPatientId(id), HttpStatus.ACCEPTED);
    }

    //Consultar los pacientes asignados a una enfermera auxiliar con su id 
    @RequestMapping(path ="nurses-assistants/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETPatientofNurseAsistant(@PathVariable ("id") String id) throws HappException {
        return new ResponseEntity<>(happService.getPatientofNurseAsistant(id), HttpStatus.ACCEPTED);
    } */
    //Consultar estado de un paciente por su id
    //Actualizar el estado de procedimiento de un paciente por su id
    //informar novedades
    //solicitar permisos
    //Iniciar turno
    //Cerrar turno
    //login app
    //logout app
    
  /*   //Consultar todos los pacientes
    @RequestMapping(value ="/patients", method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGETPatients() throws HappException {
        return new ResponseEntity<>(happService.getPatients(), HttpStatus.ACCEPTED);
    } */
    
    //Asignar auxiliares de enfermeria

}