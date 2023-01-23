package com.deploy.SobokSobok.domain.sendPill;

import com.deploy.SobokSobok.domain.sendPill.repository.SendPillRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SendPillRepository extends JpaRepository<SendPill, Long>, SendPillRepositoryCustom {
}
