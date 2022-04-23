package com.hiring.hk.backend.repository;

import com.hiring.hk.backend.model.SubLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubLevelRepo extends JpaRepository<SubLevel, Long> {
    List<SubLevel> findAllByLevelId(Long id);
}
