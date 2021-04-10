package com.induiduel.wordpress.wp.filter;

import android.webkit.URLUtil;

import com.induiduel.wordpress.utils.InvalidUrl;

import java.util.ArrayList;
import java.util.List;

public class Parameters {

    public static int DATE = 0;             //date
    public static int AUTHOR = 1;           //author
    public static int ID = 2;               //id
    public static int INCLUDE = 3;          //include
    public static int MODIFIED = 4;         //modified
    public static int PARENT = 5;           //parent
    public static int RELEVANCE = 6;        //relevance
    public static int SLUG = 7;             //slug
    public static int INCLUDE_SLUGS = 8;    //include_slugs
    public static int TITLE = 9;            //title

    public static int DESC = 0;             //desc
    public static int ASC = 1;              //asc

    public static int VIEW = 0;             //view
    public static int EMBED = 1;            //embed
    public static int EDIT = 2;             //edit

    public static int POST = 0;             //post
    public static int TERM = 1;             //term
    public static int POST_FORMAT = 2;      //post-format

    private String url;
    private List<String> list;

    public Parameters(String main, String path) throws RuntimeException, InvalidUrl {
        this.list = new ArrayList<>();
        if (URLUtil.isValidUrl(main + path)) {
            this.url = main + path;
        } else {
            throw new InvalidUrl("Using of Invalid URL" + " : " + main + path);
        }
    }

    public Parameters(String main) throws RuntimeException, InvalidUrl {

        this.list = new ArrayList<>();
        if (URLUtil.isValidUrl(main)) {
            this.url = main;
        } else {
            throw new InvalidUrl("Using of Invalid URL" + " : " + main);
        }
    }

    public Parameters postPerPage(int i) {
        list.add("per_page=" + i);
        return this;
    }

    public Parameters page(int i) {
        list.add("page=" + i);
        return this;
    }

    public Parameters search(String search) {
        list.add("search=" + search);
        return this;
    }

    public Parameters title(String title) {
        list.add("title=" + title);
        return this;
    }

    public Parameters order(int mode) {
        if (mode == 1) {
            list.add("order=" + "asc");
        } else if (mode == 0) {
            list.add("order=" + "desc");
        } else {
            list.add("order=" + "desc");
        }
        return this;
    }

    public Parameters order(String mode) {
        list.add("order=" + mode.toLowerCase().trim());
        return this;
    }

    public Parameters include(int id) {
        list.add("include=" + id);
        return this;
    }

    public Parameters exclude(int id) {
        list.add("exclude=" + id);
        return this;
    }

    public Parameters offset(int number) {
        list.add("offset=" + number);
        return this;
    }

    public Parameters tags(int tag) {
        list.add("tags=" + tag);
        return this;
    }

    public Parameters orderBy(int mode) {
        if (mode == 0) {
            list.add("orderby=" + "date");
        } else if (mode == 1) {
            list.add("orderby=" + "author");
        } else if (mode == 2) {
            list.add("orderby=" + "id");
        } else if (mode == 3) {
            list.add("orderby=" + "include");
        } else if (mode == 4) {
            list.add("orderby=" + "modified");
        } else if (mode == 5) {
            list.add("orderby=" + "parent");
        } else if (mode == 6) {
            list.add("orderby=" + "relevance");
        } else if (mode == 7) {
            list.add("orderby=" + "slug");
        } else if (mode == 8) {
            list.add("orderby=" + "include_slugs");
        } else if (mode == 9) {
            list.add("orderby=" + "title");
        } else {
            list.add("orderby=" + "date");
        }
        return this;
    }

    public Parameters orderBy(String mode) {

        list.add("orderby=" + mode.toLowerCase().trim());

        return this;
    }

    public Parameters context(int mode) {
        if (mode == 0) {
            list.add("context=" + "view");
        } else if (mode == 1) {
            list.add("context=" + "embed");
        } else if (mode == 2) {
            list.add("context=" + "edit");
        } else {
            list.add("context=" + "view");
        }

        return this;
    }

    public Parameters context(String mode) {

        list.add("context=" + mode.toLowerCase().trim());

        return this;
    }

    public Parameters type(int mode) {
        if (mode == 0) {
            list.add("type=" + "post");
        } else if (mode == 1) {
            list.add("type=" + "term");
        } else if (mode == 2) {
            list.add("type=" + "post-format");
        } else {
            list.add("type=" + "post");
        }

        return this;
    }

    public Parameters type(String mode) {

        list.add("type=" + mode.toLowerCase().trim());

        return this;
    }

    public Parameters fields(String sb) {

        list.add("_fields=" + sb.toLowerCase().trim());

        return this;
    }

    /**
     * Embed can be used only itself alone
     *
     * @return
     **/
    public String embed(boolean bool) {
        if (bool) {
            return url + "?_embed";
        } else {
            return url;
        }
    }

    /*public Parameters fields(ArrayList<String> arrayList) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(arrayList.get(i));
        }

        list.add("_fields=" + sb.toString().toLowerCase().trim());
        return this;
    }*/

    public String apply() {

        StringBuilder sb = new StringBuilder();
        sb.append(url);

        for (int i = 0; i < list.size(); i++) {

            if (i == 0) {
                if (!url.contains("?")) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
            } else {
                sb.append("&");
            }

            sb.append(list.get(i));
        }

        return sb.toString();
    }

}
