package com.induiduel.wordpress.wp.read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ReadComments {

    @SerializedName("id")
    private int contentId;

    @SerializedName("author")
    private int author;

    @SerializedName("parent")
    private int parent;

    @SerializedName("post")
    private int post;

    @SerializedName("author_name")
    private String authorName;

    @SerializedName("author_avatar_urls")
    private AuthorAvatarUrls authorAvatarUrls;

    @SerializedName("date")
    private String date;

    @SerializedName("date_gmt")
    private String dateGmt;

    @SerializedName("link")
    private String link;

    @SerializedName("status")
    private String status;

    @SerializedName("type")
    private String type;

    @SerializedName("meta")
    private ArrayList<String> meta;

    @SerializedName("content")
    private Content content;

    @SerializedName("_links")
    private Links links;

    public int getContentId() {
        return contentId;
    }

    public int getAuthor() {
        return author;
    }

    public int getParent() {
        return parent;
    }

    public int getPost() {
        return post;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getDate() {
        return date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public String getLink() {
        return link;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getMeta() {
        return meta;
    }

    public Content getContent() {
        return content;
    }

    public Links getLinks() {
        return links;
    }

    public AuthorAvatarUrls getAuthorAvatarUrls() {
        return authorAvatarUrls;
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

    public static class Content {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered() {
            return rendered;
        }
    }

    public static class Links {

        @SerializedName("self")
        private ArrayList<Self> self;

        @SerializedName("collection")
        private ArrayList<Collection> collection;

        @SerializedName("up")
        private ArrayList<Up> up;

        @SerializedName("in-reply-to")
        private ArrayList<InReplyTo> inReplyTo;

        public ArrayList<Self> getSelf() {
            return self;
        }

        public ArrayList<Collection> getCollection() {
            return collection;
        }

        public ArrayList<Up> getUp() {
            return up;
        }

        public ArrayList<InReplyTo> getInReplyTo() {
            return inReplyTo;
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

        public static class Up {

            @SerializedName("embeddable")
            private boolean embeddable;

            @SerializedName("href")
            private String href;

            @SerializedName("post-type")
            private String postType;

            public String getHref() {
                return href;
            }

            public String getPostType() {
                return postType;
            }

            public Boolean getEmbeddable() {
                return embeddable;
            }
        }

        public static class InReplyTo {
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


    }
}
