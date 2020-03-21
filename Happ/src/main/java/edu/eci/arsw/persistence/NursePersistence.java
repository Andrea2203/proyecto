package edu.eci.arsw.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.arsw.model.Nurse;
import edu.eci.arsw.model.User;

public interface NursePersistence extends JpaRepository<Nurse, Integer> {
    List<Nurse> findAll();
}
