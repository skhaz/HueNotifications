package org.nullonerror.huenotifications.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.squareup.otto.Bus;

import org.nullonerror.huenotifications.HueApplication;
import org.nullonerror.huenotifications.R;
import org.nullonerror.huenotifications.model.Device;
import org.nullonerror.huenotifications.network.HueService;

import java.util.Map;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    Bus bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        HueApplication.from(this).getComponent().inject(this);

        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        //startActivity(intent);

    }

    @Override
    protected void onResume() {
        super.onResume();

        bus.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        bus.unregister(this);
    }

    @OnClick(R.id.button)
    public void onClick() {
        http://inthecheesefactory.com/blog/retrofit-2.0/en
    }
}
