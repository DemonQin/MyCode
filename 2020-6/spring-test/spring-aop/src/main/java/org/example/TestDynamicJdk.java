package org.example;

public class TestDynamicJdk {
    public static void main(String[] args) {
        JdkHandler jdkHandler = new JdkHandler(new You());
        IMarry jdkProxy = (IMarry) jdkHandler.getProxy();
        jdkProxy.toMarry();

    }
}
