package com.PolicyEngine.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "policies")
public class Policy {
    @Id
    private String id;
    private String name;
    private String loanType;   // e.g. PERSONAL, HOME, AUTO
    private String action;     // ACCEPT / REJECT
    private Integer priority;
    private boolean active;

    private ConditionGroup conditionGroup;  // root group
}