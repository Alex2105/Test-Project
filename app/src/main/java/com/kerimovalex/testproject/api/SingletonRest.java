package com.kerimovalex.testproject.api;

import com.kerimovalex.testproject.model.ExampleModel;
import com.kerimovalex.testproject.model.RequestModel;


import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class SingletonRest {
    private static final String LIFE_URL = "https://udimi.com/api/";
    private static SingletonRest instance;
    private ServerRequests.IData iData;

    private SingletonRest() {
        init();
    }

    public static synchronized SingletonRest getInstance() {
        if (instance == null) {
            instance = new SingletonRest();
        }
        return instance;
    }

    private void init() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor().
                setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LIFE_URL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        iData = retrofit.create(ServerRequests.IData.class);
    }

    public Observable<ExampleModel> getDataInfo(String token, RequestModel requestModel) {
        return iData.getData(token, requestModel);
    }
}
