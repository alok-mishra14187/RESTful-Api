package com.rest.api.controller;



import com.rest.api.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/customer-info")
public class CustomerController {

    @PostMapping(path = "/save")
    public String customerInformation(@RequestBody Customer cust) {



        return "Customer Details " + "Id :"+cust.getCustNo() + ", " +  " Name : " + cust.getName() + ",  " +" Country: "+ cust.getCountry();
    }
}
