package pe.edu.cibertec.appLab05Basededatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.appLab05Basededatos.model.bd.Estado;

public interface EstadoRepository 
	extends JpaRepository<Estado, Integer> {

}
