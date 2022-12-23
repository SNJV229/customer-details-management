package com.springbootguide.customer.Services;

import com.springbootguide.customer.Entity.Customer;

import java.util.List;

public interface CustomerService {
    //Save operation
    Customer saveCustomer(Customer customer);
    //read operation
    List<Customer> fetchCustomerList();

    //Update operation
    Customer updateCustomer(Customer customer,
                            Long customerId);

    //Delete operation
    void deleteCustomerById(Long depertmentId);

}
