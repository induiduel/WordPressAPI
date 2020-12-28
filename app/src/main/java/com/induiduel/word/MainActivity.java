package com.induiduel.word;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.induiduel.word.access.okhttp.RequestNetwork;
import com.induiduel.word.access.okhttp.RequestNetworkController;
import com.induiduel.word.api.wordpress.ReadCategories;
import com.induiduel.word.api.wordpress.ReadComments;
import com.induiduel.word.api.wordpress.ReadMedia;
import com.induiduel.word.api.wordpress.ReadPosts;
import com.induiduel.word.api.wordpress.ReadSearch;
import com.induiduel.word.api.wordpress.ReadUsers;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestNetwork requestNetwork = new RequestNetwork(this);
        requestNetwork.startRequestNetwork(RequestNetworkController.GET, "https://androidoyun.club/wp-json/wp/v2/posts", "", new RequestNetwork.RequestListener() {
            @Override
            public void onResponse(String tag, String response, HashMap<String, Object> responseHeaders) {

                ArrayList<ReadPosts> readPostsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadPosts>>(){}.getType());
                ArrayList<ReadComments> readCommentsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadComments>>(){}.getType());
                ArrayList<ReadCategories> readCategoriesArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadCategories>>(){}.getType());
                ArrayList<ReadMedia> readMediaArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadMedia>>(){}.getType());
                ArrayList<ReadUsers> readUsersArrayList= new Gson().fromJson(response, new TypeToken<ArrayList<ReadUsers>>(){}.getType());
                ArrayList<ReadSearch> readSearchArrayList= new Gson().fromJson(response, new TypeToken<ArrayList<ReadSearch>>(){}.getType());

                Log.wtf("Get Comment", readCommentsArrayList.get(0).getContent().getRendered());
                Log.wtf("Get Author Url", readCommentsArrayList.get(0).getAuthorAvatarUrls().getUrl96px());

                Log.wtf("Get Comment", readCategoriesArrayList.get(0).getLink());

                Log.wtf("Get Slug", readPostsArrayList.get(0).getSlug());
                Log.wtf("Get WpTerm Href", readPostsArrayList.get(0).getLinks().getWpTerm().get(0).getHref());

                Log.wtf("Get Media Size", readMediaArrayList.get(0).getMediaDetails().getSizes().getProjectThumb2x().getSourceUrl());
                Log.wtf("Get Media Meta", readMediaArrayList.get(0).getMediaDetails().getImageMeta().getTitle());
                Log.wtf("Get Media Links", readMediaArrayList.get(0).getLinks().getAbout().get(0).getHref());

                Log.wtf("Get Users Name",readUsersArrayList.get(0).getName());

                Log.wtf("Get Search Url", readSearchArrayList.get(0).getUrl());

            }

            @Override
            public void onErrorResponse(String tag, String message) {

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

    }
}