package com.yeahbutstill.springkafka.repository;

import com.yeahbutstill.springkafka.entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiMediaDataRepository extends JpaRepository<WikiMediaData, Long> {
}
