package com.saucedemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class CustomChromeDriver {

    public static WebDriver create() {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("profile.default_content_setting_values.popups", 2);
        prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        prefs.put("safebrowsing.enabled", true);

        options.setExperimentalOption("prefs", prefs);

        options.addArguments(
                "--disable-save-password-bubble",
                "--disable-features=PasswordManagerOnboarding,PasswordLeakDetection,AutofillServerCommunication",
                "--disable-notifications",
                "--disable-infobars",
                "--no-default-browser-check",
                "--disable-extensions",
                "--disable-popup-blocking",
                "--disable-blink-features=AutomationControlled",
                "--start-maximized",
                "--no-first-run",
                "--no-service-autorun",
                "--password-store=basic",
                "--user-data-dir=" + System.getProperty("java.io.tmpdir") + "tempChromeProfile"
        );

        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        System.setProperty("webdriver.chrome.silentOutput", "true");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        return new ChromeDriver(options);
    }
}
