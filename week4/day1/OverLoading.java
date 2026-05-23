package org.week4.day1;

public class OverLoading {
    public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
    }
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        System.out.println("Snapshot: " + snap);
    }
public static void main(String[] args) {
    OverLoading overLoad = new OverLoading();
    overLoad.reportStep("Screenshot taken", "Passed");
    overLoad.reportStep("Screenshot not taken", "Failed", true);

}
}