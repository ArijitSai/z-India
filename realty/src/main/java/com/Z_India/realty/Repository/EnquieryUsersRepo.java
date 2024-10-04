package com.Z_India.realty.Repository;

import com.Z_India.realty.entity.EnquieryUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquieryUsersRepo  extends JpaRepository<EnquieryUsers, Long> {
}
