package com.miki.versionshandler.controller;

import com.miki.versionshandler.model.AppVersion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @GetMapping("/{appId}/lastest")
    public ResponseEntity<AppVersion> getLatestVersion(@PathVariable String appId) {
        return  ResponseEntity.ok(getAppVersion(appId));
    }

    private AppVersion getAppVersion(String appID) {
        if ("kirpiwords".equals(appID)) {
            return new AppVersion("kirpiwords", "KirpiWords", 7, "1.0.0");
        }
        return null;
    }
}
