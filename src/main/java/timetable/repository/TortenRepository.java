package timetable.repository;


import org.springframework.data.repository.CrudRepository;


import timetable.domain.Torte;


public interface TortenRepository extends CrudRepository<Torte, Long>{

	Torte findByName(String name);
}
 