package timetable.repositoryjpa;


import timetable.repositoryjpa.KundenJpaRepository;
import timetable.repositoryjpa.TortenJpaRepository;
import timetable.repositoryjpa.KaffeeJpaRepository;

public interface PersistenceFactory {

    KundenJpaRepository kundenRepository();


    KaffeeJpaRepository KaffeeRepository();

    TortenJpaRepository TortenRepository();

}