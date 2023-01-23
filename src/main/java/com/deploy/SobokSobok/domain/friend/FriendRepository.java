package com.deploy.SobokSobok.domain.friend;

import com.deploy.SobokSobok.domain.friend.repository.FriendRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long>, FriendRepositoryCustom {
}
