package com.hiring.hk.backend.repository;

import com.hiring.hk.backend.model.Sectors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepo extends JpaRepository<Sectors, Long> {
}
