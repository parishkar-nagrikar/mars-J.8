package com.mojo.corejava;

import java.util.Objects;

public class EqualsHashcode {
    private int id;
    private int enNo;

    public static void main(String[] args) {
        System.out.println("main called!");
        EqualsHashcode equalsHashcode = new EqualsHashcode();
        equalsHashcode.m1();
    }

    private  void m1() {
        System.out.println(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsHashcode that = (EqualsHashcode) o;
        return id == that.id &&
                enNo == that.enNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enNo);
    }
}