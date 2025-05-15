package com.test.RakeshTestDemo.services;

import com.test.RakeshTestDemo.dao.PolicyRepository;
import com.test.RakeshTestDemo.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(Long id) {
        Optional<Policy> policy = policyRepository.findById(id);
        return policy.orElse(null);
    }
}