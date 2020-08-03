package org.example;

public class TestDynamiCGLib {
    public static void main(String[] args) {
        CGLibIntercepter cgLibIntercepter = new CGLibIntercepter(new You());
        You you = (You) cgLibIntercepter.getProxy();
        you.toMarry();
    }
}
