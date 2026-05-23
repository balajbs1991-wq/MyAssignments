package org.week3.day2;

public class Chrome extends browserName {
    public void openIncognito(){
        System.out.println("Open incognito window in Chrome browser");
    }
    
    public void clearCache(){
        System.out.println("Clear cache in Chrome browser");
    }
    public static void main(String[] args) {
        Chrome chrm = new Chrome();
        System.err.println();
        chrm.openIncognito();
        chrm.clearCache();
        chrm.openURL();
        chrm.closeBrowser();
        chrm.navigateBack();
        
    }   

}