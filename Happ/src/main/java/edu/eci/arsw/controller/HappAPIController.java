package edu.eci.arsw.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.persistence.UserPersistence;
import edu.eci.arsw.persistence.NursePersistence;
import edu.eci.arsw.model.Nurse;
import edu.eci.arsw.model.User;

@RestController
@RequestMapping("api/public")
public class HappAPIController {
	
	private UserPersistence userPersistence;
	private NursePersistence nursePersistence;

    public HappAPIController(UserPersistence userPersistence){
        this.userPersistence = userPersistence;
    }
	
	@GetMapping("users")
    public List<User> users(){
        return this.userPersistence.findAll();
    }

    @GetMapping("nurses")
    public List<Nurse> nurses(){
        return this.nursePersistence.findAll();
    }
}