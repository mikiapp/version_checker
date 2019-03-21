package com.miki.versionshandler.model;

public class AppVersion {
    private String appID;
    private String appName;
    private int versionCode;
    private String versionName;

    public AppVersion(String appID, String appName, int versionCode, String versionName) {
        this.appID = appID;
        this.appName = appName;
        this.versionCode = versionCode;
        this.versionName = versionName;
    }

    public AppVersion() {
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
}
