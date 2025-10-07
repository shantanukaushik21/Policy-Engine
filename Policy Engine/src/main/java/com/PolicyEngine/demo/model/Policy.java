package com.PolicyEngine.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Policies")
public class Policy {

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("loanType")
    private String loanType;

    @Field("action")
    private String action;

    @Field("priority")
    private Integer priority;

    @Field("active")
    private boolean active;

    @Field("conditionGroup")
    private ConditionGroup conditionGroup;

    // ✅ Add Getters and Setters (Jackson needs them)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public ConditionGroup getConditionGroup() { return conditionGroup; }
    public void setConditionGroup(ConditionGroup conditionGroup) { this.conditionGroup = conditionGroup; }
}