package com.induiduel.word.api.wordpress.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterArguments {
    public static int DATE = 0; //date
    public static int AUTHOR = 1; //author
    public static int ID = 2; //id
    public static int INCLUDE = 3; //include
    public static int MODIFIED = 4; //modified
    public static int PARENT = 5; //parent
    public static int RELEVANCE = 6; //relevance
    public static int SLUG = 7; //slug
    public static int INCLUDE_SLUGS = 8; //include_slugs
    public static int TITLE = 9; //title
    public static int DESC = 0; //desc
    public static int ASC = 1; //asc

    private String url;
    private List<String> list;

    public FilterArguments(String url) {
        this.url = url;
        this.list = new ArrayList<>();
    }

    public FilterArguments postPerPage(int i) {
        list.add("per_page=" + i);
        return this;
    }

    public FilterArguments page(int i) {
        list.add("page=" + i);
        return this;
    }

    public FilterArguments search(String search){
        list.add("search="+ search);
        return this;
    }

    public FilterArguments order(int mode){
       if (mode == 1){
           list.add("search="+ "asc");
       }else if(mode == 0){
           list.add("search="+ "desc");
       }else{
           list.add("search="+ "desc");
       }
        return this;
    }

    public FilterArguments include(int id){
        list.add("include="+ id);
        return this;
    }

    public FilterArguments exclude(int id){
        list.add("exclude="+ id);
        return this;
    }

    public FilterArguments offset(int number){
        list.add("offset="+ number);
        return this;
    }

    public FilterArguments tags(int tag){
        list.add("tags="+ tag);
        return this;
    }

    public FilterArguments orderBy(int mode){
        if (mode == 0){
            list.add("orderby="+ "date");
        }else if (mode == 1){
            list.add("orderby="+ "author");
        }else if (mode == 2){
            list.add("orderby="+ "id");
        }else if (mode == 3){
            list.add("orderby="+ "include");
        }else if (mode == 4){
            list.add("orderby="+ "modified");
        }else if (mode == 5){
            list.add("orderby="+ "parent");
        }else if (mode == 6){
            list.add("orderby="+ "relevance");
        }else if (mode == 7){
            list.add("orderby="+ "slug");
        }else if (mode == 8){
            list.add("orderby="+ "include_slugs");
        }else if (mode == 9){
            list.add("orderby="+ "title");
        }else {
            list.add("orderby="+ "date");
        }
        return this;
    }

    public String get() {

        StringBuilder sb = new StringBuilder();
        sb.append(url);

        for(int i = 0; i < list.size(); i++) {

            if(i == 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }

            sb.append(list.get(i));
        }

        return sb.toString();
    }



}
