package com.example.customerservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621084
 * 2016-07-26T17:39:28.449+05:30
 * Generated source version: 3.0.4.redhat-621084
 * 
 */
@WebService(targetNamespace = "http://customerservice.example.com/", name = "CustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {

    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://customerservice.example.com/", className = "com.example.customerservice.UpdateCustomer")
    public void updateCustomer(
        @WebParam(name = "customer", targetNamespace = "http://customerservice.example.com/")
        com.example.customerservice.Customer customer
    );

    @WebMethod
    @RequestWrapper(localName = "getCustomersByName", targetNamespace = "http://customerservice.example.com/", className = "com.example.customerservice.GetCustomersByName")
    @ResponseWrapper(localName = "getCustomersByNameResponse", targetNamespace = "http://customerservice.example.com/", className = "com.example.customerservice.GetCustomersByNameResponse")
    @WebResult(name = "return", targetNamespace = "http://customerservice.example.com/")
    public java.util.List<com.example.customerservice.Customer> getCustomersByName(
        @WebParam(name = "name", targetNamespace = "http://customerservice.example.com/")
        java.lang.String name
    ) throws NoSuchCustomerException;
}
