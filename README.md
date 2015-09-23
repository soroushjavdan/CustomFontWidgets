# CustomFontWidgets

## What is it?
  -----------
It's simple library that allows you to use your custom font in android views.
the CustomFontWidgets let you :
set diffrent font for each of your view .
set default font for your project .
just need to set customFont attribute with value of your font name for the Widgets.


## How to use it
  -----------

**Step 1 :**
Create sub folder in asset folder and save your fonts inside it.
![light](https://drive.google.com/uc?id=0B3UucKoY-F7YTE0xSEFvQzJvSHc)
  
**Step 2 :**
  creat class and extend from Application

```java
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FontUtils.createFonts(this,"fonts");
        FontUtils.setDefaultFont(this, "fonts", "RightWay");
    }
}
```
and change your AndroidManifest to something like this
```xml
  <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:name=".MyApplication"
```

**Step 3 :**

```xml

    <LinearLayout
        android:layout_width="match_parent"
        android:gravity="center_horizontal"
        android:layout_height="match_parent"
        xmlns:custom="http://schemas.android.com/apk/res-auto"
        android:orientation="vertical">

        <net.soroushjavdan.customfontwidgets.CTextView
            android:text="@string/hello_world"
            android:layout_width="wrap_content"
            android:layout_marginTop="10dp"
            custom:customFont="iran_sans"
            android:layout_height="wrap_content" />
    
    </<LinearLayout>

```
  
  
## Screenshots
  ![light](https://drive.google.com/uc?id=0B3UucKoY-F7YMGRsZVpZZGlDems)
  

## PS
 the library has iranSnas ttf 


