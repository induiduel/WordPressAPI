package com.induiduel.wordpress.wp.read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ReadSearch {

    @SerializedName("id")
    private int id;

    @SerializedName("subtype")
    private String subtype;

    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private String type;

    @SerializedName("url")
    private String url;

    @SerializedName("_links")
    private Links links;

    public int getId() {
        return id;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public Links getLinks() {
        return links;
    }

    public static class Links {

        @SerializedName("self")
        private ArrayList<Self> self;

        @SerializedName("collection")
        private ArrayList<Collection> collection;

        @SerializedName("about")
        private ArrayList<About> about;

        public ArrayList<Self> getSelf() {
            return self;
        }

        public ArrayList<Collection> getCollection() {
            return collection;
        }

        public ArrayList<About> getAbout() {
            return about;
        }

        public static class Self {

            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class Collection {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class About {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }
    }
}
