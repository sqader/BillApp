package com.example.billapp.service;

import com.example.billapp.model.ContractorModel;
import com.example.billapp.repository.ContractorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContractorService {

    private final ContractorRepository cR;

    public List<ContractorModel> getContractorList() {
        return cR.findAll();
    }

    public void addContractor(ContractorModel contractor) {
        cR.save(contractor);
    }

    public ContractorModel findById(Long id) {
        return cR.findById(id).orElse(null);
    }

    public void saveEditContractor(ContractorModel contractor) {
        cR.save(contractor);
    }

    public void removeContractor(Long id) {
        cR.deleteById(id);
    }

    public Page<ContractorModel> getAllContractorsPageable(Pageable pageable) {
        return cR.findAll(pageable);
    }
}
