[![](https://jitpack.io/v/Alan9435/DynamicTabLayout.svg)](https://jitpack.io/#Alan9435/DynamicTabLayout)

## DynamicTabLayout
#### This library is available for Android.
#### When you want your TabLayout to be scrollable but also fill the screen, you can use this library.

## Sample
 ![image](https://github.com/Alan9435/DynamicTabLayout/assets/81663054/913e88be-441b-4f14-8ef6-73d0d06e7607)
 ![image](https://github.com/Alan9435/DynamicTabLayout/assets/81663054/9ff1fa95-0731-4170-a3f7-13d59b6455ec)

 
### Step 1. Add the JitPack repository to your build file

&nbsp;&nbsp;Add it in your root build.gradle at the end of repositories:
 ```
buildscript {
    repositories {
	  ...
	  maven { url 'https://jitpack.io' }
	}
}
 ```
### Step 2. Add the dependency
```
dependencies {
  ...
  implementation 'com.github.Alan9435:DynamicTabLayout:3.0'
}
```
### Step 3. Replace your TabLayout with DynamicTabLayout

 ```
 <com.gomaji.dynamictablayout.DynamicTabLayout
        android:id="@+id/myTabLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:tabMode="scrollable"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

### Step 4. Set the width of tabs using setDividerFactor
```
yourTabLayout.setDividerFactor(3)
```
For example, when you set the `dividerFactor` to 3, the width of each tab will be one-third of the screen width.
Then, you will see the following screen.

![image](https://github.com/Alan9435/DynamicTabLayout/assets/81663054/d9c29ebd-1351-41a1-95b1-14e0264cbadf)
![image](https://github.com/Alan9435/DynamicTabLayout/assets/81663054/387a60d8-7c3a-404b-bc54-e28f6ddb2672)

### You can view the complete example at [here](app/src/main/java/com/gomaji/dynamictablayoutlibrary/MainActivity.kt)


