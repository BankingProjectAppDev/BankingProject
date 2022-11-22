package com.banking.banking.ResponseHandler;

import net.bytebuddy.dynamic.DynamicType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ResponseHandler {
        public static ResponseEntity<Object> generateResponse(String message, HttpStatus code, Object responseObj) {

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("code", code.value());
            map.put("message", message);
            map.put("data", responseObj);



            return new ResponseEntity<Object>(map,code);
        }

        //making a response entity that returns a hashmap
    // with a message
    // code value of the status
    // and data having the response obj
    // returns the map with the status code because response entity needs a object and status code




    public static ResponseEntity<Object> generateResponseNoObj(String message, HttpStatus code) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", code.value());
        map.put("message", message);
        return new ResponseEntity<Object>(map, code);
    }

// used for deletes

}



