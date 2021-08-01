package main.Repository;

import main.Model.BasicProcess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Repository
public interface ProcessRepository extends CrudRepository<BasicProcess, List> {




}

