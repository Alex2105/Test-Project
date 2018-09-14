package com.kerimovalex.testproject.api;


import com.kerimovalex.testproject.model.ExampleModel;
import com.kerimovalex.testproject.model.RequestModel;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public class ServerRequests {
    interface IData {
        @POST("profile")
        Observable<ExampleModel> getData(@Header("Auth") String token, @Body RequestModel requestModel);
    }
}
