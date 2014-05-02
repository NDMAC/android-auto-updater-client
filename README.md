android-auto-updater-client
===========================

Android APK auto updater client

This project allows to automatically update a running APK application using a private update server (see [apk-updater](https://github.com/NDMAC/apk-updater)) instead of Google Play updater.

__Origin__  
Fork of [lenik.terenin](https://code.google.com/u/lenik.terenin/)'s auto-update client https://code.google.com/p/auto-update-apk-client/ for server agnostic usage.

## HOW TO

#### Requirements

Since you don't put your software on Android Market, you have to enable "Unknown Sources (Allow installation of non-Market applications)" in Settings :: Applications. Otherwise you won't be able to install your software or updates.

#### Permissions
The following permissions are needed in Android Manifest:

 * android:name="android.permission.INTERNET"
 * android:name="android.permission.ACCESS_NETWORK_STATE"
 * android:name="android.permission.ACCESS_WIFI_STATE"

### Start updater client

The updater client typically starts during application initialization, simply by creating a new instance.

```java
AutoUpdateApk aua = new AutoUpdateApk(getApplicationContext(), UPDATE_URL);
```

where UPDATE_URL is your update server URL, eg.  
```java
public final static String UPDATE_URL = "http://mydomain.com/updater";
```

### Configuration

Updater configuration may be any time after its creation.

```java
// auto update every day
aua.setUpdateInterval(AutoUpdateApk.DAYS * 1);
```

