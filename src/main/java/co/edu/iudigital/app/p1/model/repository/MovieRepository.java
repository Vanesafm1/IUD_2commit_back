package co.edu.iudigital.app.p1.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.p1.model.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
