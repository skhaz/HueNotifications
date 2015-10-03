package org.nullonerror.huenotifications.network;

import org.nullonerror.huenotifications.model.Device;

import java.util.Map;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

public interface HueService {

    @POST("/api")
    Call<Object> register(@Body Device device);
}
