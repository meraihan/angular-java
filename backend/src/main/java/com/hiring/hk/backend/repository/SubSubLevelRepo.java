package com.hiring.hk.backend.repository;

import com.hiring.hk.backend.model.SubSubLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubSubLevelRepo extends JpaRepository<SubSubLevel, Long> {
    List<SubSubLevel> findAllBySubLevelId(Long id);
}
