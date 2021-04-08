package com.induiduel.wordpress.wp.read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ReadUsers {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("link")
    private String link;

    @SerializedName("slug")
    private String slug;

    @SerializedName("url")
    private String url;

    @SerializedName("yoast_head")
    private String yoastHead;

    @SerializedName("meta")
    private ArrayList<String> meta;

    @SerializedName("avatar_urls")
    private AuthorAvatarUrls authorAvatarUrls;

    @SerializedName("_links")
    private Links links;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getSlug() {
        return slug;
    }

    public String getUrl() {
        return url;
    }

    public String getYoastHead() {
        return yoastHead;
    }

    public ArrayList<String> getMeta() {
        return meta;
    }

    public AuthorAvatarUrls getAuthorAvatarUrls() {
        return authorAvatarUrls;
    }

    public Links getLinks() {
        return links;
    }

    public String getName() {
        return name;
    }

    public static class Links {

        @SerializedName("collection")
        private ArrayList<Collection> collection;

        @SerializedName("self")
        private ArrayList<Self> self;

        @SerializedName("about")
        private ArrayList<About> about;

        public ArrayList<Collection> getCollection() {
            return collection;
        }

        public ArrayList<Self> getSelf() {
            return self;
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

        public static class About {

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

    }

    public static class AuthorAvatarUrls {
        @SerializedName("96")
        private String url96;

        @SerializedName("48")
        private String url48;

        @SerializedName("24")
        private String url24;

        public String getUrl96px(){
            return url96;
        }

        public String getUrl48px() {
            return url48;
        }

        public String getUrl24px() {
            return url24;
        }
    }
}
