package jwd.wafepa.repository;


import java.util.List;

import jwd.wafepa.model.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{
	
	List<Model> findByMarkaId(Long markaId);

}
