package edu.eci.arsw.persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.eci.arsw.model.Nurse;
import edu.eci.arsw.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserPersistence userRepository;
    private PasswordEncoder passwordEncoder;
    private NursePersistence nurseRepository; 

    public DbInit(UserPersistence userRepository, NursePersistence nurseRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder =passwordEncoder;
        this.nurseRepository = nurseRepository;
    }   

    @Override
    public void run(String... args) {
       /*  // Delete all
        this.userRepository.deleteAll();
        this.nurseRepository.deleteAll(); */

        /* // Create users
        User juan = new User("juan",passwordEncoder.encode("juan123"),"jualme18@gmail.com","1015443182","CC","USER");
        User admin = new User("admin",passwordEncoder.encode("admin123"),"admin@mail.com","123456789","CC","ADMIN");
        User manager = new User("manager",passwordEncoder.encode("manager123"),"manager@mail.com","987654321","CC","MANAGER");
        User patriciaUser = new User("patricia123",passwordEncoder.encode("1234"),"patricia@gmail.com","124567898","CC","MANAGER");
        User carlaUser = new User("carla123",passwordEncoder.encode("1234"),"carla@gmail.com","9087653242","CC","MANAGER");
        
        List<User> users = Arrays.asList(juan,admin,manager,patriciaUser,carlaUser);
        this.userRepository.saveAll(users);
        Nurse patricia = new Nurse(patriciaUser, "patricia","A+","1"); 
        Nurse carla = new Nurse(carlaUser, "carla","A+","1"); 
        List<Nurse> nurses = Arrays.asList(patricia,carla);
        // Save to db
        this.nurseRepository.saveAll(nurses);  */
    }
}