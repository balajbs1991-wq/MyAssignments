package org.week3.day2;

public class Edge extends browserName {
    public void takesnap() {
        System.out.println("Take snap in Edge browser");
    }
public void clearCookies(){
    System.out.println("Clear cookies in Edge browser");}

    public static void main (String[] args) {
        Edge edge = new Edge();
        System.err.println();
        edge.takesnap();
        edge.clearCookies();
        edge.closeBrowser();
        edge.navigateBack();
        edge.openURL();
    }
    }
