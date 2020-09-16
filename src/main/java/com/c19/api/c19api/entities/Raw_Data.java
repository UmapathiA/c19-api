package com.c19.api.c19api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Raw_Data {
    @JsonProperty
    List<C19DAO> c19DAOS;

    public Raw_Data() {
    }

    public List<C19DAO> getC19DAOS() {
        return c19DAOS;
    }

    public void setC19DAOS(List<C19DAO> c19DAOS) {
        this.c19DAOS = c19DAOS;
    }
}
