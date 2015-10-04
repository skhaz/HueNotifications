package org.nullonerror.huenotifications.network;

import com.squareup.okhttp.HttpUrl;

import retrofit.BaseUrl;

public class BridgeEndpoint implements BaseUrl {

    @Override
    public HttpUrl url() {
        // TODO uPNP
        return HttpUrl.parse("http://192.168.1.30/");
    }
}
