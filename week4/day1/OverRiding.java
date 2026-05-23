package org.week4.day1;

public class OverRiding extends OverLoadSuperClass{
    @Override   
    public void takeSnap(){
        super.takeSnap();
        System.out.println("Snapshot taken in the subclass");
    }
public static void main(String[] args) {
    OverRiding overRiding = new OverRiding();
    overRiding.takeSnap();
}
}

