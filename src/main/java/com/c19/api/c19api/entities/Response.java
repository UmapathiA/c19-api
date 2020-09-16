package com.c19.api.c19api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("raw_data")
    C19DAO[] rawData;

    public Response() {
    }

    public C19DAO[] getRawData() {
        return rawData;
    }

    public void setRawData(C19DAO[] rawData) {
        this.rawData = rawData;
    }
}
