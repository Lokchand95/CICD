package com.Lokchand.CICD.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class CiCDController {

    @GetMapping("/getCustomer")
    public String getCustomerData(){
        return " welcome for CICD pipleine";
    }

}
