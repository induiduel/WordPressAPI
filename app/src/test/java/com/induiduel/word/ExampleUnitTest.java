package com.induiduel.word;

import com.induiduel.word.api.wordpress.filter.FilterArguments;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void aa () {
        FilterArguments filterArguments = new FilterArguments("https://androidoyun.club/wp-json/wp/v2/posts");
        String a = filterArguments.page(1)
                .postPerPage(50)
                .search("minecraft")
                .order(FilterArguments.DESC)
                .orderBy(0)
                .exclude(1)
                .offset(0)
                .context(0)
                .type(0)
                .title("abc")
                .apply();

        System.out.println(a);
    }
}