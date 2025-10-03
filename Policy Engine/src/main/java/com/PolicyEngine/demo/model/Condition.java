package com.PolicyEngine.demo.model;

public class Condition {
    private String field;    // e.g. "creditScore"
    private String operator; // ==, !=, >=, <=, <, >
    private Object value;    // flexible type (string, int, double, boolean)
}
