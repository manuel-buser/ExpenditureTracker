package com.ExpenditureTracker.ExpenditureTracker.repository;

import com.ExpenditureTracker.ExpenditureTracker.model.ExpenditureModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenditureRepository extends JpaRepository<ExpenditureModel, Long> {
}
