#Material Font Icons For android (Library)

This Project Will help you using Material Font Icons in your android Project WITHOUT using images or png or svg files. 
in this library i used Google Material Icons from here https://design.google.com/icons/

#Why Using This ?
According to Google on this link http://google.github.io/material-design-icons/#icons-for-android
which explain how to use it for Android using Images and downloading them.
so i make this library to make it lighter and easier to use it in your application.

#Features.
1. No Images at all.
2. Light and doesn't take size
3. control everything in it
    - Colors
    - Size
    - style
4. doesn't require to download anything from Google Material Icons
5. 

#How to use.
simple just provide text view into your application layout where you want to use the icons
    
      <yousefalsbaihi.materialfonticon.YousefTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="&#xE90D;"
        android:textSize="100dp"
        android:textColor="@color/colorPrimary"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true" />

#Icons Codes.
To select your own icon you have to go to https://design.google.com/icons/
press on the icon you want to use 
and take the code which say's for IE it should look like this 

<img src="https://github.com/YousefAlsbaihi/FontIcons/blob/master/Material%20icons%20%20%20Google%20Design.png?raw=true">

all we need is the &#xE84E; use it in the text of the YousefTextView

<yousefalsbaihi.materialfonticon.YousefTextView
        ...
        android:text="The Code Goes Here"
        ...
        />
