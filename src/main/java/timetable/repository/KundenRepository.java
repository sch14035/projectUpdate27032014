package timetable.repository;


import org.springframework.data.repository.CrudRepository;


import timetable.domain.Kunde;


public interface KundenRepository extends CrudRepository<Kunde, Long>{

	Kunde findByName(String name);
}
 