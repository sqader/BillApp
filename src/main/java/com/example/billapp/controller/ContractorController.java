package com.example.billapp.controller;

import com.example.billapp.model.ContractorModel;
import com.example.billapp.service.ContractorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContractorController {

    private final ContractorService cS;

    @GetMapping("/contractors")
    public String getContractorList(Model model) {
        List<ContractorModel> contractorList = cS.getContractorList();
        model.addAttribute("contractorModel", contractorList);
        return "contractor/contractorList";
    }

    @GetMapping("/addContractor")
    public String getAddContractor() {
        return "contractors/addNewContractor";
    }

    @PostMapping("/addContractor")
    public RedirectView postAddContractor(ContractorModel contractor) {
        cS.addContractor(contractor);
        return new RedirectView("/contractors");
    }

    @GetMapping("/editContractor/{id}")
    public String getEditContractor(@PathVariable("id") Long id, Model model) {
        ContractorModel contractor = cS.findById(id);
        model.addAttribute("contractorModel", contractor);
        return "contractors/editContractor";
    }

    @PostMapping("/edit/{id}")
    public RedirectView editContractor(ContractorModel contractor) {
        cS.saveEditContractor(contractor);
        return new RedirectView("/contractors");
    }

    @PostMapping("/edit/{id}")
    public RedirectView deleteContractor(@PathVariable("id") Long id) {
        cS.removeContractor(id);
        return new RedirectView("/contractors");
    }

    @GetMapping("/allContractors")
    public Page<ContractorModel> getAllContractorsPageable(Pageable pageable) {
        return cS.getAllContractorsPageable(pageable);
    }
}
