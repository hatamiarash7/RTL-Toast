## RTL-Toast

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-RTL%20Toast-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7695) ![JitPack](https://img.shields.io/jitpack/v/github/hatamiarash7/rtl-toast.svg) [![GitHub license](https://img.shields.io/github/license/hatamiarash7/RTL-Toast.svg)](https://github.com/hatamiarash7/RTL-Toast/blob/master/LICENSE)

Android library to show Toasts in a pretty RTL way

![ScreenShot](./assets/template.jpg)

### Install
Add it in your root build.gradle
```java
allprojects {
    repositories {
        ...
	maven {
	    url 'https://jitpack.io'
	}
    }
}
```
Add the dependency
```java
dependencies {
    implementation 'com.github.hatamiarash7:RTL-Toast:1.2'
}
```

### Usage
```java
RTLToast.error(context, message, length, withIcon);
RTLToast.success(context, message, length, withIcon);
RTLToast.info(context, message, length, withIcon);
RTLToast.warning(context, message, length, withIcon);
RTLToast.normal(context, message, length, withIcon);
```

You can use formatted strings
```java
RTLToast.info(context, getFormattedMessage())

private CharSequence getFormattedMessage() {  
    final String prefix = "متن ";  
    final String highlight = "با فرمت ";  
    final String suffix = " مخصوص";  
    SpannableStringBuilder ssb = new SpannableStringBuilder(prefix).append(highlight).append(suffix);  
    int prefixLen = prefix.length();  
    ssb.setSpan(new StyleSpan(BOLD_ITALIC), prefixLen, prefixLen + highlight.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);  
    return ssb;  
}
```

Or you can customize your toast with `RTLToast.Config`
```java
RTLToast.Config.getInstance()  
    .setTextColor(Color.GREEN)  
    .setToastTypeface(Typeface.createFromAsset(getAssets(), "IRANSans.ttf"))  
    .apply();  
RTLToast.custom(context, message, getResources().getDrawable(R.drawable.laptop512), Color.BLACK, length, withIcon, shouldTint).show();
RTLToast.Config.reset();
```
## Support

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/D1D1WGU9)

## Contributing

1. Fork it!  
2. Create your feature branch : `git checkout -b my-new-feature`  
3. Commit your changes : `git commit -am 'Add some feature'`    
4. Push to the branch : `git push origin my-new-feature`  
5. Submit a pull request :D  

## Issues

Each project may have many problems. Contributing to the better development of this project by reporting them
