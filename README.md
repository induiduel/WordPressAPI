## Wordpress API
### Implementation
- Add the JitPack repository to your root build.gradle file

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

- Add the dependency

```gradle
dependencies {
	implementation 'com.github.induiduel:wordpressapi:1.0.2'
}
```

[![](https://jitpack.io/v/induiduel/wordpressapi.svg)](https://jitpack.io/#induiduel/wordpressapi) 


### Example

Create a new project and  add the main URL with Wordpress API location.

```java
InitializeApp.url = "https://androidoyun.club/wp-json/wp/v2/";
```

Call Parameters to modify your base URL so you can request correctly

```java
Parameters parameters = new Parameters(InitializeApp.url, "posts");

String mUrl = parameters.page(0).apply();
```

You can use other parameters to return specific values from URL

```java
String mUrl = parameters.page(0).postPerPage(10).search("football").apply();
```

Then you must request to the URL and put into the class

```java
@Override
public void onResponse(String response) {

	ArrayList<ReadPosts> readPostsArrayList = new Gson().fromJson(response, new TypeToken<ArrayList<ReadPosts>>() {}.getType());

}
```
Now response has been implemented in variables and you can easily access them

```java
for (int i = 0; i < readPostsArrayList.size(); i++) {
	Log.wtf("POST SLUGS", readPostsArrayList.get(i).getSlug());
}
```



### Documentation


------------



| ReadPost  |     Description          |
| ------------- | ------------------------------ |
| `getSlug()`      | Return Post Slug     `String `    |
| `getContentId()`   | Return Post ID  `int `   |
| `getContentDate()`      | Return Post Date `String `     |
| `getContentDateGmt()`   | Return Post Date `String `     |
| `getGuid()`      | Return Post Guid     `Guid ` &raquo;   `String `  |
| `getModified()`   | Return Post Modified   `String `   |
| `getModifiedGmt()`      | Return Post Modified GMT  `String `     |
| `getStatus()`   | Return Post Status `String `     |
| `getType()`      | Return Post Type    `String `    |
| `getLink()`   | Return Post Link  `String `   |
| `getTitle()`      | Return Post Title `Title ` &raquo;   `String `    |
| `getContent()`   | Return Post Content `Content `   &raquo;   `String `    |
| `getExcerpt()`      | Return Post Excerpt     `Excerpt ` &raquo;   `String `  |
| `getAuthor()`   | Return Post Author   `String `   |
| `getFeatured_media()`      | Return Post Featured Media  `String `     |
| `getComment_status()`   | Return Post Comment Status `String `     |
| `getPing_status()`   | Return Post Ping Status   `String `   |
| `getSticky()`      | Return Post Sticky  `String `     |
| `getTemplate()`   | Return Post Template `String `     |
| `getFormat()`   | Return Post Format `String `     |
| `getMeta()`   | Return Post Meta ` ArrayList<String>`|
| `getCategories()`   | Return Post Categories  ` ArrayList<Integer>`   |
| `getTags()`   | Return Post  Tags ` ArrayList<Integer>`  |
| `getYoastHead()`   | Return Post YoastHead ` String`    |
| `getLinks()`   | Return Post  Links ` Links`   |


##### Links in ReadPost


| ReadPost &raquo; Links  |   |
| ------------- | ------------------------------ |
| `getLinks()`   |  ` getAbout()`   |
|` getAuthor()`   |` getReplies()`   |
|` getVersionHistory()`   |` getCuries()`   |
|` getWpAttachment()`   |` getWpTerm()`   |

##### Pagination with Parameters

| Parameters  | Pagination|
| ------------- | ------------------- |
| postPerPage(int i)  |  ` per_page=i`   |
| page(int i)   |  ` page=i`   |
| search(String search)   |  `search=search`   |
| title(String title)  |  `title=title`   |
| order(int mode)  | ` (0) order=desc` , ` (1) order=asc`    |
| include(int id)   |  `include=id`   |
| exclude(int id)  |  `exclude=id`   |
| offset(int number)   |  `offset=number`   |
| tags(int tag)   |  `tags=tag`   |
| orderBy(String mode)   |  `orderby=mode`   |
| context(String mode)  |  `context=mode`   |
| type(String mode)   |  `type=mode`   |
| fields(String sb)   |  `_fields=sb`   |
| embed(boolean bool)   |  `?_embed`   |

| Parameters  | Description |
| ------------- | ------------------- |
| Parameters(String main, String path)  |  Input main url and Path |
| apply()  |  Returns String to User  |






##### _[@nofrost.life](https://www.instagram.com/nofrost.life/)_
