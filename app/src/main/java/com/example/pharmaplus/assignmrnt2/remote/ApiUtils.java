package com.example.pharmaplus.assignmrnt2.remote;

public class ApiUtils {



    public static final String BASE_URL="http://google.com";

    public static UserService getUserService()
    {
return RetrofitClient.getClient(BASE_URL).create(UserService.class);


    }
}
