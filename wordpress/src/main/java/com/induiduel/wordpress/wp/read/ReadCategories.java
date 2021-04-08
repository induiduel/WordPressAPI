package com.induiduel.wordpress.wp.read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ReadCategories {
    @SerializedName("id")
    private int contentId;

    @SerializedName("count")
    private int count;

    @SerializedName("parent")
    private int parent;

    @SerializedName("slug")
    private String slug;

    @SerializedName("taxonomy")
    private String taxonomy;

    @SerializedName("link")
    private String link;

    @SerializedName("description")
    private String description;

    @SerializedName("name")
    private String name;

    @SerializedName("meta")
    private ArrayList<String> meta;

    @SerializedName("yoast_head")
    private String yoastHead;

    @SerializedName("_links")
    private Links links;

    public int getContentId() {
        return contentId;
    }

    public int getCount() {
        return count;
    }

    public int getParent() {
        return parent;
    }

    public String getSlug() {
        return slug;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getMeta() {
        return meta;
    }

    public String getYoastHead() {
        return yoastHead;
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

        @SerializedName("up")
        private ArrayList<Up> up;

        @SerializedName("wp:post_type")
        private ArrayList<WpPostType> wpPostType;

        @SerializedName("curies")
        private ArrayList<Curies> curies;


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

        public static class Up {
            @SerializedName("embeddable")
            private boolean embeddable;

            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }

            public Boolean getEmbeddable() {
                return embeddable;
            }
        }

        public static class WpPostType {
            @SerializedName("href")
            private String href;

            public String getHref() {
                return href;
            }
        }

        public static class Curies {
            @SerializedName("templated")
            private boolean templated;

            @SerializedName("href")
            private String href;

            @SerializedName("name")
            private String name;

            public String getHref() {
                return href;
            }

            public String getName() {
                return name;
            }

            public Boolean getTemplated() {
                return templated;
            }
        }
    }
}
