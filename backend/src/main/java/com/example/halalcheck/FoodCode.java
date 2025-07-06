package com.example.halalcheck;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodCode {
    @Id
    private String code;
    private String status;

    public FoodCode() {}

    public FoodCode(String code, String status) {
        this.code = code;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
