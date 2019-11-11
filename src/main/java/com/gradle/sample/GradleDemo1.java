package com.gradle.sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GradleDemo1 {

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpContact() {
        return empContact;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }

    private int empId;
    private String empName;
    private String empContact;

    public String getString(){
        StringBuffer buf = new StringBuffer();
        return buf.append("empId:").append(empId).append("  ").append("empName:").append(empName).append("  ").append("empContact:").append(empContact).toString();
    }

    public static void main(String [] str){

        GradleDemo1 empObject = new GradleDemo1();
        empObject.setEmpId(1);
        empObject.setEmpName("Siva");
        empObject.setEmpContact("111111111");

        System.out.println("EmpDetails: "+empObject.getString());

        Gson gson = new GsonBuilder().create();
        String empJson = gson.toJson(empObject);
        System.out.println(empJson);

    }
}
