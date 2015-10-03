package org.nullonerror.huenotifications.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Device {

    @SerializedName("devicetype")
    String type;
}
