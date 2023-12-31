package com.example.asamarsal;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginService {
    @FormUrlEncoded
    @POST("loginTest")
    Call<LoginResponse> login(
            @Field("username") String username,
            @Field("password") String password
    );
}