package com.springbootguide.customer.Services;

import com.springbootguide.customer.Entity.Customer;
import com.springbootguide.customer.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.parser.Part;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> fetchCustomerList() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer, Long customerId) {
        Customer custDB = customerRepository.findById(customerId).get();

        if(Objects.nonNull(customer.getCustomerName()) &&
                !"".equalsIgnoreCase(customer.getCustomerName())){
            custDB.setCustomerName(customer.getCustomerName());
        }

        if(Objects.nonNull(customer.getCustomerAddress()) &&
                !"".equalsIgnoreCase(customer.getCustomerAddress())){
            custDB.setCustomerAddress(customer.getCustomerAddress());
        }

        if(Objects.nonNull(customer.getCustomerEmailid())){
            custDB.setCustomerEmailid(customer.getCustomerEmailid());
        }

        if(Objects.nonNull(customer.getCustomerContactNumber())){
            custDB.setCustomerContactNumber(customer.getCustomerContactNumber());
        }

        return customerRepository.save(custDB);
    }

    @Override
    public void deleteCustomerById(Long customerID) {
        customerRepository.deleteById(customerID);
    }
}
