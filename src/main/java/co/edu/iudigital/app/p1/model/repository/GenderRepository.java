package co.edu.iudigital.app.p1.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.p1.model.entity.Gender;

public interface GenderRepository extends CrudRepository <Gender, Integer> {

}
