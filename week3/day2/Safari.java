package org.week3.day2;

public class Safari extends browserVersion {
    public void readerMode() {
        System.out.println("Open reader mode in Safari browser");
    }
    
    public void fullScreenMode() {
        System.out.println("Enter full-screen mode in Safari browser");
    }
    
    public static void main(String[] args) {
        Safari safari = new Safari();
        safari.readerMode();
        safari.fullScreenMode();
        safari.browserVersion();
    }
    }
