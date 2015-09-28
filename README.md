# CustomFontWidgets

## What is it?
  -----------
It's simple library that allows you to use your custom font in android views.

**the CustomFontWidgets let you :**

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
      
        <!--  library has iran_sans font by default so you dont need to add it to your fonts folder -->
        <net.soroushjavdan.customfontwidgets.CTextView
            android:text="@string/hello_world"
            android:layout_width="wrap_content"
            android:layout_marginTop="10dp"
            custom:customFont="iran_sans"
            android:layout_height="wrap_content" />
    
        <net.soroushjavdan.customfontwidgets.CTextView
            android:text="@string/hello_world"
            android:layout_width="wrap_content"
            android:layout_marginTop="10dp"
            custom:customFont="Lemondrop"
            android:layout_height="wrap_content" />
    
    
    </<LinearLayout>

```
  
  
## Screenshots
  ![light](https://drive.google.com/uc?id=0B3UucKoY-F7YMGRsZVpZZGlDems)
  
## Gradle
  **Step 1 :**
  Select your build system: Gradle 
  
  **Step 2 :**
  Add the specific repository to your build file:
  ```
  repositories {
    maven {
        url "https://jitpack.io"
    }
  }
  ```
  **step 3 :**
  Add the dependency in your build file (do not forget to specify the correct qualifier, usually 'aar'):
   ```
  dependencies {
    compile 'com.github.soroushjavdan:CustomFontWidgets:29426641f6'
  }
  ```
  
## License

```
Copyright 2015 Soroushjavdan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

