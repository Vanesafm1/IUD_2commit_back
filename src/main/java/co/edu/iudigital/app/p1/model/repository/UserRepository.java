package co.edu.iudigital.app.p1.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.p1.model.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
