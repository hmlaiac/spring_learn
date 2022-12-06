package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InOb {
    private String message;
    private String dummy;

    public InOb(@JsonProperty("message") String message, @JsonProperty("dummy") String dummy) {
        this.message = message;
        this.dummy = dummy;
    }
}
