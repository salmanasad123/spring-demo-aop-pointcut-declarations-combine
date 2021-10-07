package com.luv2code.aopdemo.dao;


import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

// this class is our target object for AOP programming
@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount() {

        // we are not doing any hibernate work here just doing output
        System.out.println(getClass() + ": DOING MY DB WORK ADDING ACCOUNT");
    }

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
