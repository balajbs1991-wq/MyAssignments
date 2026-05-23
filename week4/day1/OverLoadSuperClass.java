package org.week4.day1;

public class OverLoadSuperClass {
public void takeSnap() {
    System.out.println("Snapshot taken in the superclass");
}
public void reportStep(){
    System.out.println("Report step in the superclass");
}
public static void main(String[] args) {
    OverLoadSuperClass overLoadSuperClass = new OverLoadSuperClass();
    overLoadSuperClass.takeSnap();
    overLoadSuperClass.reportStep();
}
}
