package com.example.mybmi;

import java.io.Serializable;

public class emp implements Serializable {


    private String name;
    private String process;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
}
