package main.controller;

import main.Model.BasicProcess;
import main.Service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProcessController {

   @Autowired
   public ProcessService processService;

   @GetMapping(path="/all")
   public Iterable<BasicProcess> getAllUsers() {
      return processService.findAll();
   }

}
