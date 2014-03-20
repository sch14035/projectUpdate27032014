package timetable.repository;


import org.springframework.data.repository.CrudRepository;


import timetable.domain.Kaffee;


public interface KaffeeRepository extends CrudRepository<Kaffee, Long>{

	Kaffee findByName(String name);
}
 