package com.my.repository;

import com.my.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yufan_cai
 * @date 2025/4/8 15:59
 */
public interface RateRepository extends JpaRepository<Rate,Long> {
}
