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
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.credit_card_enabled", false);
        prefs.put("autofill.address_enabled", false);
        prefs.put("safebrowsing.enabled", true);
        options.setExperimentalOption("prefs", prefs);

        options.addArguments(
                "--disable-popup-blocking",
                "--disable-notifications",
                "--disable-save-password-bubble",
                "--disable-infobars",
                "--disable-extensions",
                "--no-default-browser-check",
                "--disable-blink-features=AutomationControlled",
                "--disable-features=PasswordManagerOnboarding,PasswordLeakDetection,AutofillServerCommunication",
                "--password-store=basic",
                "--window-size=1920,1080"
        );

        return new ChromeDriver(options);
    }
}
