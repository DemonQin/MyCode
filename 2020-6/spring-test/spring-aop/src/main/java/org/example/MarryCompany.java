package org.example;

public class MarryCompany implements IMarry {
    private IMarry targe;

    public void befor() {
        System.out.println("结婚之前谈个恋爱吧");
    }

    public void after() {
        System.out.println("结婚之后就离婚吧");
    }

    public MarryCompany(IMarry targe) {
        this.targe = targe;
    }

    public void toMarry() {
        befor();
        targe.toMarry();
        after();
    }

}
