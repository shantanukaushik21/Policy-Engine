package com.PolicyEngine.demo.model;

import java.util.List;

public class ConditionGroup {
    private String operator; // AND / OR
    private List<Object> conditions; // can hold sub-conditions or nested groups

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public List<Object> getConditions() { return conditions; }
    public void setConditions(List<Object> conditions) { this.conditions = conditions; }
}
