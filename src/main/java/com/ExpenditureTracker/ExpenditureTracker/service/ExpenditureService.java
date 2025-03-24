package com.ExpenditureTracker.ExpenditureTracker.service;

import com.ExpenditureTracker.ExpenditureTracker.model.ExpenditureModel;
import com.ExpenditureTracker.ExpenditureTracker.repository.ExpenditureRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenditureService {

    private final ExpenditureRepository expenditureRepository;

    public ExpenditureService(ExpenditureRepository expenditureRepository) {
        this.expenditureRepository = expenditureRepository;
    }

    public ExpenditureModel saveExpenditure(ExpenditureModel expenditure) {
        return expenditureRepository.save(expenditure);
    }

    public List<ExpenditureModel> getAllExpenditures() {
        return expenditureRepository.findAll();
    }
}