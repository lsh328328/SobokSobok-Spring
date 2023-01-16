package com.deploy.SobokSobok.domain.pill;

import com.deploy.SobokSobok.domain.pill.repository.PillRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PillRepository extends JpaRepository<Pill, Long>, PillRepositoryCustom {
}
