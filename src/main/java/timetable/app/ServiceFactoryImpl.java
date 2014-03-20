package timetable.app;

import timetable.repositoryjpa.PersistenceFactory;
import timetable.service.ServiceFactory;
import java.util.HashMap;

public class ServiceFactoryImpl implements ServiceFactory {
    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

	
    
  

}
