package org.nullonerror.huenotifications.network;

import org.nullonerror.huenotifications.model.Device;

import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

public interface HueService {

    @POST("/api")
    Observable<Object> register(@Body Device device);
}
