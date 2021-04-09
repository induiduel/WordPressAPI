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


### Documentation

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
String mUrl = parameters.page(0)
.postPerPage(10).search("football").apply();
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
