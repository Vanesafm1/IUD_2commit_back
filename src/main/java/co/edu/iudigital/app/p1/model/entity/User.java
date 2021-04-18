package co.edu.iudigital.app.p1.model.entity;

import java.io.Serializable;
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
@Table (name="user")

public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "user_id")
	private int userId;
	private String name;
	private String email;
	private String password;
	@Column (name= "create_at")
	private LocalDateTime createAT;
	
	@ManyToOne
	@JoinColumn (name="profile_id")
	private Profile ProfileId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreateAT() {
		return createAT;
	}

	public void setCreateAT(LocalDateTime createAT) {
		this.createAT = createAT;
	}

	public Profile getProfileId() {
		return ProfileId;
	}

	public void setProfileId(Profile profileId) {
		ProfileId = profileId;
	}
	
	
	
}
