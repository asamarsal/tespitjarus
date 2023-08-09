package com.example.asamarsal;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }
}
