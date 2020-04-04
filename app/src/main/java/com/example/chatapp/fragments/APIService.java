package com.example.chatapp.fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAALsMvZCM:APA91bGAbRSq9e95Wv1MgE4JvtiEZHWgcmkSkuxLat5ty-uWETYJl-dUW54DtLZru6g_VuQYkqlBedi5qbhhrb8a0eG6dBNS9TwUFvaQM7cRyWVrky5Zu3MgJOVkF4cGY5Zfwf4y9xmb"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
