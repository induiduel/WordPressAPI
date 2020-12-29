package com.induiduel.word;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.induiduel.word.access.okhttp.RequestNetwork;
import com.induiduel.word.access.okhttp.RequestNetworkController;
import com.induiduel.word.api.wordpress.filter.FilterArguments;
import com.induiduel.word.api.wordpress.read.ReadPosts;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FilterArguments filterArguments = new FilterArguments("https://androidoyun.club/wp-json/wp/v2/posts");
        String a = filterArguments.page(1)
                .postPerPage(50)
                .search("minecraft")
                .order(FilterArguments.DESC)
                .orderBy(0)
                .exclude(1)
                .include(1)
                .offset(2)
                .tags(12)
                .context(2)
                .type(2)
                .title("abc")
                .apply();


        Log.wtf("Url", a);
        RequestNetwork requestNetwork = new RequestNetwork(this);
        requestNetwork.startRequestNetwork(RequestNetworkController.GET, a, "", new RequestNetwork.RequestListener() {
            @Override
            public void onResponse(String tag, String response, HashMap<String, Object> responseHeaders) {


                ArrayList<ReadPosts> readPostsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadPosts>>() {
                }.getType());
                for (int a = 0; a < readPostsArrayList.size(); a++) {
                    Log.wtf("Get Slug", readPostsArrayList.get(a).getSlug());
                }

                Log.wtf("Get WpTerm Href", readPostsArrayList.get(0).getLinks().getWpTerm().get(0).getHref());

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

            }

            @Override
            public void onErrorResponse(String tag, String message) {

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        String username = "induiduel";
        String password = "dddd0909";

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("first_name", "kasim");
        hashMap.put("last_name", "turkan");
        hashMap.put("username", "induiduel");
        hashMap.put("name", "Kasim Turkan");
        hashMap.put("nickname", "induiduel");
        hashMap.put("password", "dddd0909");
        hashMap.put("email", "induiduel@gmail.com");

        RequestNetwork requestUser = new RequestNetwork(this);
        requestUser.setParams(hashMap, 0);
        requestUser.startRequestNetwork(RequestNetworkController.POST,
                "https://www.proevtasima.com/wp-json/wp/v2/users",
                "",
                new RequestNetwork.RequestListener() {
                    @Override
                    public void onResponse(String tag, String response, HashMap<String, Object> responseHeaders) {
                        Log.wtf("Response", response);
                    }

                    @Override
                    public void onErrorResponse(String tag, String message) {
                        Log.wtf("Response Error", message);
                    }
                });


    }
}