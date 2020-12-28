package com.induiduel.word.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;

public class JsonConverter {
    public static HashMap<String, Object> textToHash(String text) {
        return new Gson().fromJson(text, new TypeToken<HashMap<String, Object>>() {
        }.getType());
    }

    public static ArrayList<HashMap<String, Object>> textToArrayMap(String text) {
        return new Gson().fromJson(text, new TypeToken<ArrayList<HashMap<String, Object>>>() {
        }.getType());
    }

    public static String hashToText(HashMap<String, Object> hashmap) {
        return new Gson().toJson(hashmap);
    }

    public static String arrayMapToText(ArrayList<HashMap<String, Object>> arrayList) {
        return new Gson().toJson(arrayList);
    }

    public static <T> T loadGson(String js) {
        return new Gson().fromJson(js, new TypeToken<T>(){}.getType());
    }

}
