package com.microservicesdemo.customer;

public record CustomerRegistrationRequest(String firstName, String lastName, String email) {
}
