package com.induiduel.word.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.induiduel.word.R;

import com.induiduel.wordpress.wp.read.ReadPosts;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostActivity extends AppCompatActivity {

    public static String RESPONSE;
    public int position;
    ArrayList<ReadPosts> readPostsArrayList;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    TextView headText;
    TextView contentText;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        customLogic();
        customUi();
        setValues();
        if (!readPostsArrayList.isEmpty()) {
            getImages();
            Log.wtf("PostActivity Read", String.valueOf(getIntent().getIntExtra("postPosition", 0)));
            Log.wtf("PostActivity Post", readPostsArrayList.get(position).getLink());

        }

    }

    private void customLogic() {
        readPostsArrayList = new Gson().fromJson(RESPONSE, new TypeToken<ArrayList<ReadPosts>>() {
        }.getType());
        position = getIntent().getIntExtra("postPosition", 0);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void setValues(){
        headText.setText(readPostsArrayList.get(position).getTitle().getRendered());
        contentText.setText(removeUrl(Html.fromHtml(readPostsArrayList.get(position).getContent().getRendered(), Html.FROM_HTML_MODE_COMPACT | Html.FROM_HTML_MODE_LEGACY).toString()));

        Log.wtf("Content", contentText.getText().toString().replace("￼",""));
    }

    private void customUi() {
        headText = findViewById(R.id.headText);
        contentText = findViewById(R.id.contentText);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView1.setClipToOutline(true);
        imageView2.setClipToOutline(true);
        imageView3.setClipToOutline(true);
    }

    private void getImages() {
        Pattern p = Pattern.compile("<img loading=\\\".*?\\\" class=\\\".*?\\\" src=\\\".*?\\\" alt=\\\".*?\\\" width=\\\".*?\\\" height=\\\".*?\\\" srcset=\\\"(.*?)\\\"", Pattern.DOTALL);
        Matcher m = p.matcher(readPostsArrayList.get(position).getContent().getRendered());

        for (int i = 0; m.find(); i++){
            final String regex = ",(.*?) [0-9]";
            final String string = m.group(1);

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(string);
            String loadImage = "0";
            while (matcher.find()) {
                //System.out.println(matcher.group(0));
                String a1 = matcher.group(matcher.groupCount() - 1).substring(0, matcher.group(matcher.groupCount() - 1).length() - 2).replace(",", "");

                if (a1.endsWith(".jpg")) {
                    loadImage = a1;
                }
            }

            if (i == 1){
                Log.wtf("A==1", loadImage);
                Picasso.get().load(loadImage.trim()).into(imageView1);
               /* GradientDrawable imageShape1 = new GradientDrawable();
                imageShape1.setCornerRadius(26);
                imageView1.setBackground(imageShape1);*/
                //Log.wtf("GroupCount", String.valueOf(m.groupCount()));
            }

            if (i == 2){
                imageView2.setVisibility(View.VISIBLE);
                Log.wtf("A==2", loadImage);
                Picasso.get().load(loadImage.trim()).into(imageView2);
                /*GradientDrawable imageShape1 = new GradientDrawable();
                imageShape1.setCornerRadius(26);
                imageView2.setBackground(imageShape1);*/
                //Log.wtf("GroupCount", String.valueOf(m.groupCount()));
            }else{
                imageView2.setVisibility(View.GONE);
            }

            if (i == 3){
                imageView3.setVisibility(View.VISIBLE);
                Log.wtf("A==3", loadImage);
                Picasso.get().load(loadImage.trim()).into(imageView3);
                /*GradientDrawable imageShape1 = new GradientDrawable();
                imageShape1.setCornerRadius(26);
                imageView1.setBackground(imageShape1);*/
                //Log.wtf("GroupCount", String.valueOf(m.groupCount()));
            }else{
                imageView3.setVisibility(View.GONE);
            }

        }

    }

    private String removeUrl(String commentstr)
    {
        String urlPattern = "((https?|ftp|gopher|img|telnet|file|Unsure|http):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
        Pattern p = Pattern.compile(urlPattern,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(commentstr);
        int i = 0;
        while (m.find()) {
            commentstr = commentstr.replaceAll(m.group(i),"").trim();
            i++;
        }
        return commentstr.replaceAll("[\uFEFF-\uFFFF]", "");
    }
}

