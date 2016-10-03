package com.shiparoo.data.entity;

public final class Imgur {

    public enum Section {
        HOT("hot"),
        TOP("top"),
        USER("user");

        String mName;

        Section(String name) {
            mName = name;
        }

        @Override public String toString() {
            return mName;
        }
    }

    public enum Sort {
        VIRAL("viral"),
        TOP("top"),
        TIME("time"),
        RISING("rising");

        String mName;

        Sort(String name) {
            mName = name;
        }

        @Override public String toString() {
            return mName;
        }
    }
}
