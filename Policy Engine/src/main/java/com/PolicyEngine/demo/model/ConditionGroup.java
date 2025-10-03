package com.PolicyEngine.demo.model;

import java.util.List;

public class ConditionGroup {
    private String logic; // AND, OR, NOT

    private List<Condition> conditions;          // simple field checks
    private List<ConditionGroup> subGroups;      // nested condition groups
}
