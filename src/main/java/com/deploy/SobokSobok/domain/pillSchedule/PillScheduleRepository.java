package com.deploy.SobokSobok.domain.pillSchedule;

import com.deploy.SobokSobok.domain.pillSchedule.repository.PillScheduleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PillScheduleRepository extends JpaRepository<PillSchedule, Long>, PillScheduleRepositoryCustom {
}
