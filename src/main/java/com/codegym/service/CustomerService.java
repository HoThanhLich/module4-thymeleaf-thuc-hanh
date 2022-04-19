package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{

    private static ArrayList<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.add(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.add(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.add(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.add(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.add(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public void create(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void updateById(int id, Customer customer) {
        customers.add(id, customer);
    }

    @Override
    public void deleteById(int id) {
        customers.remove(id);
    }
}
