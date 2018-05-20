package com.sahilm;

import javax.inject.Inject;

public class Profile {
    public final String name;
    public final int age;
    public final Address address;

    @Inject
    public Profile(final String name, final int age, final Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
