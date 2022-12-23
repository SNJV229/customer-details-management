package com.springbootguide.customer.Controller;

import com.springbootguide.customer.Entity.Customer;
import com.springbootguide.customer.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> fetchCustomerList(){
        return customerService.fetchCustomerList();
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("id") Long customerId){
        return customerService.updateCustomer(customer, customerId);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomerById(@PathVariable("id") Long customerId){
        customerService.deleteCustomerById(customerId);
        return "Deleted Successfully";
    }
}
