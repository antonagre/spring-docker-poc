package com.example.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("books")
public class testController {

    @GetMapping("/test/{data}")
    public ResponseEntity<String> test(@PathVariable String data) {
        return new ResponseEntity<String>("Hello World! "+data, HttpStatus.OK);
    }

}