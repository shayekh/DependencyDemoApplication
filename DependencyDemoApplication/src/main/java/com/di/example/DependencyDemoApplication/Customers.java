package com.di.example.DependencyDemoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custName;
    private String courseName;

    @Autowired
    private Technologies techDetail;

    public Technologies getTechDetail() {
        return techDetail;
    }

    public void setTechDetail(Technologies techDetail) {
        this.techDetail = techDetail;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void display()
    {
        System.out.println("Customer Object Returned Succesfully");
        techDetail.tech();
    }
}
