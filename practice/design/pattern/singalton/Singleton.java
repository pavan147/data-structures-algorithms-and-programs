package practice.design.pattern.singalton;

import java.io.Serializable;

public final class Singleton implements Serializable {

    private static volatile Singleton instance;
    private String data;

    private Singleton() {
        // Protect against reflection
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    // Protect against serialization
    private Object readResolve() {
        return getInstance();
    }
    // Protect against cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of singleton not allowed");
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
}