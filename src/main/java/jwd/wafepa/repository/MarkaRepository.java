package jwd.wafepa.repository;

import jwd.wafepa.model.Author;
import jwd.wafepa.model.Marka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkaRepository  extends JpaRepository<Marka, Long> {

}
