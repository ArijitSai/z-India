package com.Z_India.realty.Controller;

import com.Z_India.realty.entity.EnquieryUsers;
import com.Z_India.realty.service.EnqueryUserServices.EnqueryUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enq")
public class EnqueryUserController {

    @Autowired
    private EnqueryUserServices enqueryUserServices;
    @PostMapping("/storeUserDetails")
    public ResponseEntity<String> storeUserDetails(@RequestBody EnquieryUsers enquieryUsers){

        enqueryUserServices.storeUserDetails(enquieryUsers);

        return ResponseEntity.ok("User Details store sucessfully");
    }
}
