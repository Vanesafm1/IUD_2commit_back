package co.edu.iudigital.app.p1.service.iface;

import java.util.List;

import co.edu.iudigital.app.p1.model.entity.Gender;

public interface GenderService {
	// Lista todos los generos
	public abstract List<Gender> getAll();

}
