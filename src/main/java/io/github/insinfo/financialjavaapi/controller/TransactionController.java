package io.github.insinfo.financialjavaapi.controller;

import io.github.insinfo.financialjavaapi.model.Transaction;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/financial/v1/transactions")
public class TransactionController {

    private static final Logger logger = Logger.getLogger("TransactionController");

   // @Autowired
   // private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<String> > find() {

        List<String> strings = new ArrayList<>();
        strings.add("transaction 1");
        strings.add("transaction 2");
        strings.add("transaction 3");
        logger.info(strings.toString());
       // return ResponseEntity.ok(strings);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Baeldung-Example-Header",
                "Value-ResponseEntityBuilderWithHttpHeaders");
//.contentType(MediaType.APPLICATION_JSON)
      /*  return ResponseEntity.ok()
                .headers(responseHeaders)
                .body("Response with header using ResponseEntity");*/


        //responseHeaders.setLocation(location);:
        responseHeaders.set("Content-Type", "application/json;charset=UTF-8");
        return new ResponseEntity<List<String>>(strings, responseHeaders, HttpStatus.CREATED);
    }


}