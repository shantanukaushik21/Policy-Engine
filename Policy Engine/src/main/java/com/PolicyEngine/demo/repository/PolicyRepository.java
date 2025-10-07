package com.PolicyEngine.demo.repository;

import com.PolicyEngine.demo.model.Policy;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface PolicyRepository extends MongoRepository<Policy, String> {
    List<Policy> findByLoanTypeAndActiveTrueOrderByPriorityAsc(String loanType);
}
