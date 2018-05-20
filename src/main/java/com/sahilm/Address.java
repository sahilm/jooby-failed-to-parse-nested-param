package com.sahilm;

import javax.inject.Inject;

public class Address {
    public final String country;
    public final String city;

    @Inject
    public Address(final String country, final String city) {
        this.country = country;
        this.city = city;
    }
}
