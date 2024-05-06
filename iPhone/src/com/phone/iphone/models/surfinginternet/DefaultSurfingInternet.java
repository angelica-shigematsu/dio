package com.phone.iphone.models.surfinginternet;

import com.phone.iphone.models.iPhone;

public class DefaultSurfingInternet implements SurfingInternet{

    private String browser;

    private boolean isPageOpen;

    private iPhone phone;

    public DefaultSurfingInternet(String browser, iPhone phone) {
        this.browser = browser;
        this.phone = phone;
        this.isPageOpen = false;
    }

    public String getBrowser() {
        return browser;
    }

    @Override
    public void showPage() {
        if (getBrowser() != null) {
            System.out.println("\nBrowser " + getBrowser() + " is opened");
            this.isPageOpen = true;

        }
    }

    @Override
    public void addPage() {
        if (this.isPageOpen)
            System.out.println("Add new page");
        else
            System.out.print("Browser is not opened");
    }

    @Override
    public void updatePage() {
        if (this.isPageOpen)
            System.out.println("Update page");
        else
            System.out.print("Browser is not opened");
    }
}
