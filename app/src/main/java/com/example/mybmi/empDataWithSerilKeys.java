
package com.example.mybmi;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class empDataWithSerilKeys implements Serializable {

    @SerializedName("name")
    private String empName ;

    @SerializedName("process")
    private String empProcess;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpProcess() {
        return empProcess;
    }

    public void setEmpProcess(String empProcess) {
        this.empProcess = empProcess;
    }
}
