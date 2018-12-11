package com.example.pharmaplus.assignmrnt2.remote;

import android.telecom.Call;

import com.example.pharmaplus.assignmrnt2.model.ResObj;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("login/(username)/(password)")

    Call<ResObj> login(@Path("username") String username,@Path("password") String password);



}
