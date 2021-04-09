package com.induiduel.word.activities;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.induiduel.word.R;
import com.induiduel.wordpress.config.InitializeApp;
import com.induiduel.wordpress.okhttp.RequestNetwork;
import com.induiduel.wordpress.okhttp.RequestNetworkController;
import com.induiduel.wordpress.wp.filter.Parameters;
import com.induiduel.wordpress.wp.read.ReadPosts;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, Object>> arrayComment;

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
        // Change Your URL
        InitializeApp.url = "https://androidoyun.club/wp-json/wp/v2/";
    }

    public void onLayoutInit() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    public void onLogicInit() {

        try {
            // Change PATH to request in a specific location
            Parameters parameters = new Parameters(InitializeApp.url, "posts");
            // Change PARAMETERS to request in a specific location
            String mUrl = parameters.page(0).apply();

            // See your URL
            Log.wtf("URL CUSTOMISED", mUrl);
            RequestNetwork requestNetwork = new RequestNetwork(this);

            requestNetwork.startRequestNetwork(RequestNetworkController.GET, mUrl, "tag", new RequestNetwork.RequestListener() {
                @Override
                public void onResponse(String tag, String response, HashMap<String, Object> responseHeaders) {
                    // Your request has a response
                    if (response.contains("rest_invalid_param")) {
                        // Something went wrong
                        Log.wtf("REST", response);
                    } else {
                        // Your Response is readable
                        Log.wtf("Everything fine", response);
                        try {
                            // Save response in a static variable
                            PostActivity.RESPONSE = response;

                            // Read your RESPONSE through ReadPost (change class if you request to an another path)
                            ArrayList<ReadPosts> readPostsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadPosts>>() {
                            }.getType());

                            /*
                             Now you can use the methods in your class
                             */
                            for (int i = 0; i < readPostsArrayList.size(); i++) {
                                //Returns all slugs
                                Log.wtf("POST SLUGS", readPostsArrayList.get(i).getSlug());

                            }
                            // Returns post date in 0.position
                            Log.wtf("POST DATE", readPostsArrayList.get(0).getContentDate());

                            // Adding your values into a custom Adapter and show it in a list
                            recyclerView.setAdapter(new RecyclerViewAdapterMain(readPostsArrayList));
                            recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));

                        } catch (Exception e) {
                            e.printStackTrace();
                            Log.wtf("response", e.toString());
                        }
                    }


                }

                @Override
                public void onErrorResponse(String tag, String message) {
                    Log.wtf("POSTS RESPONSE ERROR", message);
                }
            });

        } catch (Exception e) {
            Log.wtf(" TRY CATCH ERROR POST ", e.toString());
        }

    }

    public void onClickInit() {
    }

    public class RecyclerViewAdapterMain extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        ArrayList<ReadPosts> _data;

        public RecyclerViewAdapterMain(ArrayList<ReadPosts> _arr) {
            _data = _arr;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater _inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View _v = _inflater.inflate(R.layout.gridlayout_custom, parent, false);
            return new ViewHolder(_v);
        }

        @SuppressLint("SetTextI18n")
        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int _position) {
            View _view = holder.itemView;

            final LinearLayout lin = _view.findViewById(R.id.lin);
            final TextView headerText = _view.findViewById(R.id.headText);
            // final TextView excerptText = _view.findViewById(R.id.excerptText);
            //final TextView comments = _view.findViewById(R.id.comments);
            //  final TextView dateText = _view.findViewById(R.id.dateText);
            final ImageView image = _view.findViewById(R.id.image);
            final Button button = _view.findViewById(R.id.devamBtn);
            image.setClipToOutline(true);
            GradientDrawable gd = new GradientDrawable();
            gd.setCornerRadius(16);
            gd.setColor(Color.parseColor("#fefefe"));
            lin.setBackground(gd);

            GradientDrawable gradientButton = new GradientDrawable();
            gradientButton.setCornerRadius(16);
            gradientButton.setColor(getColor(R.color.colorGreen));
            button.setBackground(gradientButton);
            // An example to get titles
            headerText.setText(_data.get(_position).getTitle().getRendered());
            //excerptText.setText(Html.fromHtml(_data.get(_position).getExcerpt().getRendered()));

            int idPost = _data.get(_position).getContentId();

            //String newDate = _data.get(_position).getContentDate().substring(0,_data.get(_position).getContentDate().indexOf("T"));
            //dateText.setText(newDate);

            // You can also use regex to extract values from string
            Pattern p = Pattern.compile("<p><a href=\\\"(.*?)\"><img loading=\\\"(.*?)\\\" class=\\\"(.*?)\" src=\\\"(.*?)\".*<\\/a>", Pattern.DOTALL);
            Matcher m = p.matcher(_data.get(_position).getContent().getRendered());

            while (m.find()) {
                if (m.group(1).length() > 15) {

                    Log.wtf("API KEY IS REGEX 1", m.group(1) + "\n\n\n");

                    Picasso.get().load(m.group(1)).into(image);
                    GradientDrawable imageShape = new GradientDrawable();
                    imageShape.setCornerRadius(26);
                    image.setBackground(imageShape);
                }
            }
            Log.wtf("Media URL", _data.get(_position).getLinks().getWpAttachment().get(0).getHref());
            Log.wtf("Comments URL", _data.get(_position).getLinks().getReplies().get(0).getHref());


            lin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getApplicationContext(), PostActivity.class);

                    intent.putExtra("postPosition", _position);
                    startActivity(intent);
                }
            });

        }

        @Override
        public long getItemId(int _index) {
            return _index;
        }

        @Override
        public int getItemCount() {
            return _data.size();
            // return (_data == null) ? 0 : _data.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }


}