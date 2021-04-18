package co.edu.iudigital.app.p1.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "movie")

public class Movie implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "movie_id")
	private int movieId;
	private String name; 
	private String descripcion;
	private String image;
	@Column (name = "create_at")
	private LocalDateTime createAT;
	@Column (name = "release_date")
	private LocalDate releaseDate;
	private String actors; 
	private int rating;
	@ManyToOne
	@JoinColumn (name = "gender_id")
	private Gender genderId;
	
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public LocalDateTime getCreateAT() {
		return createAT;
	}
	public void setCreateAT(LocalDateTime createAT) {
		this.createAT = createAT;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Gender getGenderId() {
		return genderId;
	}
	public void setGenderId(Gender genderId) {
		this.genderId = genderId;
	}
}
