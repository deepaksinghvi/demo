package com.demo.demo.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @RequestMapping(value = "/demo", method = RequestMethod.GET)
  public ResponseEntity demo() {
    return new ResponseEntity("Demo Controller", HttpStatus.OK);
  }

}
