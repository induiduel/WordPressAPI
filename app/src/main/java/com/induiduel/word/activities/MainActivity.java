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













/**/
/*
                 ArrayList<ReadComments> readCommentsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadComments>>(){}.getType());
                ArrayList<ReadCategories> readCategoriesArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadCategories>>(){}.getType());
                ArrayList<ReadMedia> readMediaArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadMedia>>(){}.getType());
                ArrayList<ReadUsers> readUsersArrayList= new Gson().fromJson(response, new TypeToken<ArrayList<ReadUsers>>(){}.getType());
                ArrayList<ReadSearch> readSearchArrayList= new Gson().fromJson(response, new TypeToken<ArrayList<ReadSearch>>(){}.getType());

                Log.wtf("Get Media Size", readMediaArrayList.get(0).getMediaDetails().getSizes().getProjectThumb2x().getSourceUrl());
                Log.wtf("Get Media Meta", readMediaArrayList.get(0).getMediaDetails().getImageMeta().getTitle());
                Log.wtf("Get Media Links", readMediaArrayList.get(0).getLinks().getAbout().get(0).getHref());

                Log.wtf("Get Users Name",readUsersArrayList.get(0).getName());

                Log.wtf("Get Search Url", readSearchArrayList.get(0).getUrl());

                Log.wtf("Get Comment", readCommentsArrayList.get(0).getContent().getRendered());
                Log.wtf("Get Author Url", readCommentsArrayList.get(0).getAuthorAvatarUrls().getUrl96px());

                Log.wtf("Get Comment", readCategoriesArrayList.get(0).getLink());
*/