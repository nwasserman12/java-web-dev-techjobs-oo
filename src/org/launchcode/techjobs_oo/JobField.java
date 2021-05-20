package org.launchcode.techjobs_oo;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return value;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
