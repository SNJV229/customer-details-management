package com.springbootguide.customer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmailid;
    private Long customerContactNumber;

    public Customer() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmailid() {
        return customerEmailid;
    }

    public void setCustomerEmailid(String customerEmailid) {
        this.customerEmailid = customerEmailid;
    }

    public Long getCustomerContactNumber() {
        return customerContactNumber;
    }

    public void setCustomerContactNumber(Long customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public Customer(Long customerId, String customerName, String customerAddress, String customerEmailid, Long customerContactNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmailid = customerEmailid;
        this.customerContactNumber = customerContactNumber;
    }


}
