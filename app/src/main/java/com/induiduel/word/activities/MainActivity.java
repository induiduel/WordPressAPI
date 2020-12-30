package com.induiduel.word.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.induiduel.word.R;
import com.induiduel.word.access.okhttp.RequestNetwork;
import com.induiduel.word.access.okhttp.RequestNetworkController;
import com.induiduel.word.api.wordpress.filter.Parameters;
import com.induiduel.word.api.wordpress.read.ReadPosts;
import com.induiduel.word.config.InitializeApp;
import com.induiduel.word.utils.InvalidUrl;
import com.induiduel.word.utils.JsonConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCreateInit();
        onLayoutInit();
        onLogicInit();
        onClickInit();
    }

    public void onCreateInit() {
        InitializeApp.url = "https://androidoyun.club/wp-json/wp/v2/";
    }

    public void onLayoutInit(){

    }

    public void onLogicInit() {

        try {
            Parameters parameters = new Parameters(InitializeApp.url, "posts");
            String a = parameters.page(1).postPerPage(50).search("minecraft").order(Parameters.DESC)
                    .orderBy(0).context(0).type(0).title("abc").apply();

            RequestNetwork requestNetwork = new RequestNetwork(this);

            requestNetwork.startRequestNetwork(RequestNetworkController.GET, a, "tag", new RequestNetwork.RequestListener() {
                @Override
                public void onResponse(String tag, String response, HashMap<String, Object> responseHeaders) {

                    try {
                        ArrayList<ReadPosts> readPostsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadPosts>>() {}.getType());
                        for ( int i = 0; i < readPostsArrayList.size(); i++){

                            Log.wtf("My Gudniz" , readPostsArrayList.get(i).getSlug());

                        }
                    } catch (Exception e){
                        Log.wtf(e.toString(), response);
                    }

                }

                @Override
                public void onErrorResponse(String tag, String message) {
                    Log.wtf("Oh May Gud Error", message);
                }
            });

        } catch (Exception e) {
            Log.wtf(" sss " ,  e.toString());
        }

    }

    public void onClickInit() {}

}