package com.demo.app.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

  @RequestMapping(value = "/demo", method = RequestMethod.GET)
  public ResponseEntity demo() {
    log.info("Demo Controller ....");
    log.info("===============\n");
    return new ResponseEntity("Demo Controller\n", HttpStatus.OK);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ResponseEntity health(){
    log.info("Demo Health Check ....");
    return new ResponseEntity("health ok ", HttpStatus.OK);
  }


  @RequestMapping(value = "/myeahlth", method = RequestMethod.GET)
  public ResponseEntity myhealth(){
    log.info("This is my Demo Health Check ....");
    return new ResponseEntity("health ok ", HttpStatus.OK);
  }
}
