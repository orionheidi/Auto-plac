package jwd.wafepa.repository;

import jwd.wafepa.model.Automobil;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomobilRepository extends PagingAndSortingRepository<Automobil, Long> {

}
