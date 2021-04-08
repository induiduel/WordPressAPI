package com.induiduel.wordpress.wp.read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ReadPosts {

    @SerializedName("id")
    private int contentId;

    @SerializedName("date")
    private String contentDate;

    @SerializedName("date_gmt")
    private String contentDateGmt;

    @SerializedName("guid")
    private Guid guid;

    @SerializedName("modified")
    private String modified;

    @SerializedName("modified_gmt")
    private String modifiedGmt;

    @SerializedName("slug")
    private String slug;

    @SerializedName("status")
    private String status;

    @SerializedName("type")
    private String type;

    @SerializedName("link")
    private String link;

    @SerializedName("title")
    private Title title;

    @SerializedName("content")
    private Content content;

    @SerializedName("excerpt")
    private Excerpt excerpt;

    @SerializedName("author")
    private String author;

    @SerializedName("featured_media")
    private String featured_media;

    @SerializedName("comment_status")
    private String comment_status;

    @SerializedName("ping_status")
    private String ping_status;

    @SerializedName("sticky")
    private String sticky;

    @SerializedName("template")
    private String template;

    @SerializedName("format")
    private String format;

    @SerializedName("meta")
    private ArrayList<String> meta;

    @SerializedName("categories")
    private ArrayList<Integer> categories;

    @SerializedName("tags")
    private ArrayList<Integer> tags;

    @SerializedName("yoast_head")
    private String yoastHead;

    @SerializedName("_links")
    private Links links;

    public ReadPosts(){

    }

    public String getSlug(){
        return slug;
    }

    public int getContentId() {
        return contentId;
    }

    public String getContentDate() {
        return contentDate;
    }

    public String getContentDateGmt() {
        return contentDateGmt;
    }

    public Guid getGuid() {
        return guid;
    }

    public String getModified() {
        return modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    public Title getTitle() {
        return title;
    }

    public Content getContent() {
        return content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public String getAuthor() {
        return author;
    }

    public String getFeatured_media() {
        return featured_media;
    }

    public String getComment_status() {
        return comment_status;
    }

    public String getPing_status() {
        return ping_status;
    }

    public String getSticky() {
        return sticky;
    }

    public String getTemplate() {
        return template;
    }

    public String getFormat() {
        return format;
    }

    public ArrayList<String> getMeta() {
        return meta;
    }

    public ArrayList<Integer> getCategories() {
        return categories;
    }

    public ArrayList<Integer> getTags() {
        return tags;
    }

    public String getYoastHead() {
        return yoastHead;
    }

    public Links getLinks() {
        return links;
    }

    public static class Content {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered(){
            return rendered;
        }
    }

    public static class Guid {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered(){
            return rendered;
        }
    }

    public static class Title {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered(){
            return rendered;
        }
    }

    public static class Excerpt {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered(){
            return rendered;
        }
    }

    public static class Links {

        @SerializedName("self")
        private ArrayList<Self> self;

        @SerializedName("collection")
        private ArrayList<Collection> collection;

        @SerializedName("about")
        private ArrayList<About> about;

        @SerializedName("author")
        private ArrayList<Author> author;

        @SerializedName("replies")
        private ArrayList<Replies> replies;

        @SerializedName("version-history")
        private ArrayList<VersionHistory> versionHistory;

        @SerializedName("predecessor-version")
        private ArrayList<PredecessorVersion> predecessorVersion;

        @SerializedName("wp:attachment")
        private ArrayList<WpAttachment> wpAttachment;

        @SerializedName("wp:term")
        private ArrayList<WpTerm> wpTerm;

        @SerializedName("curies")
        private ArrayList<Curies> curies;

        public ArrayList<Self> getSelf() {
            return self;
        }

        public ArrayList<Collection> getCollection() {
            return collection;
        }

        public ArrayList<About> getAbout() {
            return about;
        }

        public ArrayList<Author> getAuthor() {
            return author;
        }

        public ArrayList<Replies> getReplies() {
            return replies;
        }

        public ArrayList<VersionHistory> getVersionHistory() {
            return versionHistory;
        }

        public ArrayList<PredecessorVersion> getPredecessorVersion() {
            return predecessorVersion;
        }

        public ArrayList<WpAttachment> getWpAttachment() {
            return wpAttachment;
        }

        public ArrayList<WpTerm> getWpTerm() {
            return wpTerm;
        }

        public ArrayList<Curies> getCuries() {
            return curies;
        }

        public static class Self {

            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }
        }

        public static class Collection {
            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }
        }

        public static class About {
            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }
        }

        public static class Author {
            @SerializedName("embeddable")
            private boolean embeddable;

            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }

            public Boolean getEmbeddable(){
                return embeddable;
            }
        }

        public static class Replies {
            @SerializedName("embeddable")
            private boolean embeddable;

            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }

            public Boolean getEmbeddable(){
                return embeddable;
            }
        }

        public static class VersionHistory {
            @SerializedName("count")
            private int count;

            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }

            public int getEmbeddable(){
                return count;
            }
        }

        public static class PredecessorVersion {
            @SerializedName("id")
            private int id;

            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }

            public int getEmbeddable(){
                return id;
            }
        }

        public static class WpAttachment {
            @SerializedName("href")
            private String href;

            public String getHref(){
                return href;
            }
        }

        public static class WpTerm {
            @SerializedName("embeddable")
            private boolean embeddable;

            @SerializedName("href")
            private String href;

            @SerializedName("taxonomy")
            private String taxonomy;

            public String getHref(){
                return href;
            }

            public String getTaxonomy(){
                return taxonomy;
            }

            public Boolean getEmbeddable(){
                return embeddable;
            }
        }

        public static class Curies {
            @SerializedName("templated")
            private boolean templated;

            @SerializedName("href")
            private String href;

            @SerializedName("name")
            private String name;

            public String getHref(){
                return href;
            }

            public String getName(){
                return name;
            }

            public Boolean getTemplated(){
                return templated;
            }
        }
    }
}

