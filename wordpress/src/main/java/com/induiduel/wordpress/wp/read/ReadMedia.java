package com.induiduel.wordpress.wp.read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ReadMedia {

    @SerializedName("author")
    private int author;

    @SerializedName("id")
    private int id;

    @SerializedName("post")
    private int post;

    @SerializedName("date")
    private String date;

    @SerializedName("date_gmt")
    private String dateGmt;

    @SerializedName("link")
    private String link;

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

    @SerializedName("permalink_template")
    private String permalinkTemplate;

    @SerializedName("generated_slug")
    private String generatedSlug;

    @SerializedName("comment_status")
    private String commentStatus;

    @SerializedName("ping_status")
    private String pingStatus;

    @SerializedName("template")
    private String template;

    @SerializedName("alt_text")
    private String altText;

    @SerializedName("media_type")
    private String mediaType;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("meta")
    private ArrayList<String> meta;

    @SerializedName("guid")
    private Guid guid;

    @SerializedName("caption")
    private Caption caption;

    @SerializedName("description")
    private Description description;

    @SerializedName("media_details")
    private MediaDetails mediaDetails;

    @SerializedName("_links")
    private Links links;

    public int getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public int getPost() {
        return post;
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

    public String getModified() {
        return modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getPermalinkTemplate() {
        return permalinkTemplate;
    }

    public String getGeneratedSlug() {
        return generatedSlug;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public String getTemplate() {
        return template;
    }

    public String getAltText() {
        return altText;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public ArrayList<String> getMeta() {
        return meta;
    }

    public Guid getGuid() {
        return guid;
    }

    public Caption getCaption() {
        return caption;
    }

    public Description getDescription() {
        return description;
    }

    public MediaDetails getMediaDetails() {
        return mediaDetails;
    }

    public Links getLinks() {
        return links;
    }

    public static class Guid {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered() {
            return rendered;
        }
    }

    public static class Caption {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered() {
            return rendered;
        }
    }

    public static class Description {

        @SerializedName("rendered")
        private String rendered;

        public String getRendered() {
            return rendered;
        }
    }

    public static class MediaDetails {

        @SerializedName("width")
        private int width;

        @SerializedName("height")
        private int height;

        @SerializedName("file")
        private String file;

        @SerializedName("sizes")
        private Sizes sizes;

        @SerializedName("image_meta")
        private ImageMeta imageMeta;

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public String getFile() {
            return file;
        }

        public Sizes getSizes() {
            return sizes;
        }

        public ImageMeta getImageMeta() {
            return imageMeta;
        }

        public static class Sizes {

            @SerializedName("medium")
            private Medium medium;

            @SerializedName("thumbnail")
            private Thumbnail thumbnail;

            @SerializedName("medium_large")
            private MediumLarge mediumLarge;

            @SerializedName("thumbnail-2x")
            private Thumbnail2x thumbnail2x;

            @SerializedName("medium-2x")
            private Medium2x medium2x;

            @SerializedName("post-image")
            private PostImage postImage;

            @SerializedName("project-thumb")
            private ProjectThumb projectThumb;

            @SerializedName("project-thumb-2x")
            private ProjectThumb2x projectThumb2x;

            @SerializedName("project-medium")
            private ProjectMedium projectMedium;

            @SerializedName("full")
            private Full full;

            public Medium getMedium() {
                return medium;
            }

            public Thumbnail getThumbnail() {
                return thumbnail;
            }

            public MediumLarge getMediumLarge() {
                return mediumLarge;
            }

            public Thumbnail2x getThumbnail2x() {
                return thumbnail2x;
            }

            public Medium2x getMedium2x() {
                return medium2x;
            }

            public PostImage getPostImage() {
                return postImage;
            }

            public ProjectThumb getProjectThumb() {
                return projectThumb;
            }

            public ProjectThumb2x getProjectThumb2x() {
                return projectThumb2x;
            }

            public ProjectMedium getProjectMedium() {
                return projectMedium;
            }

            public Full getFull() {
                return full;
            }

            public static class Medium {

                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class Thumbnail {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class MediumLarge {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class Thumbnail2x {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class Medium2x {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class PostImage {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class ProjectThumb {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class ProjectThumb2x {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class ProjectMedium {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

            public static class Full {
                @SerializedName("width")
                private int width;

                @SerializedName("height")
                private int height;

                @SerializedName("file")
                private String file;

                @SerializedName("mime_type")
                private String mimeType;

                @SerializedName("source_url")
                private String sourceUrl;


                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }

                public String getFile() {
                    return file;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public String getSourceUrl() {
                    return sourceUrl;
                }
            }

        }

        public static class ImageMeta {

            @SerializedName("aperture")
            private String aperture;

            @SerializedName("camera")
            private String camera;

            @SerializedName("caption")
            private String caption;

            @SerializedName("copyright")
            private String copyright;

            @SerializedName("created_timestamp")
            private String createdTimestamp;

            @SerializedName("credit")
            private String credit;

            @SerializedName("focal_length")
            private String focalLength;

            @SerializedName("iso")
            private String iso;

            @SerializedName("orientation")
            private String orientation;

            @SerializedName("shutter_speed")
            private String shutter_speed;

            @SerializedName("title")
            private String title;

            @SerializedName("keywords")
            private ArrayList<String> keywords;

            public String getAperture() {
                return aperture;
            }

            public String getCamera() {
                return camera;
            }

            public String getCaption() {
                return caption;
            }

            public String getCopyright() {
                return copyright;
            }

            public String getCreatedTimestamp() {
                return createdTimestamp;
            }

            public String getCredit() {
                return credit;
            }

            public String getFocalLength() {
                return focalLength;
            }

            public String getIso() {
                return iso;
            }

            public String getOrientation() {
                return orientation;
            }

            public String getShutter_speed() {
                return shutter_speed;
            }

            public String getTitle() {
                return title;
            }

            public ArrayList<String> getKeywords() {
                return keywords;
            }
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

        public static class Author {
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

        public static class Replies {
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
