package main.Service;

import main.Model.BasicProcess;
import main.Repository.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {


    @Autowired
    private ProcessRepository processRepository;

    public Iterable<BasicProcess> findAll() {
        return this.processRepository.findAll();
    }


}
