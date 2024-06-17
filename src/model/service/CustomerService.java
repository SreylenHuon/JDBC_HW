package model.service;

import exception.ExceptionHandling;
import model.dto.CustomerDto;
import model.entity.Customer;

import java.util.List;

public interface CustomerService  {
    List<CustomerDto> queryAllCustomers() throws ExceptionHandling;
    void addNewCustomer(Customer customer) throws ExceptionHandling;
    void updateCustomerById(Integer id) throws ExceptionHandling;
    void deleteCustomerById(Integer id);
}
