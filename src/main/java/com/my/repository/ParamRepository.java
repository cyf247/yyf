package com.my.repository;

import com.my.model.RequestParam;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yufan_cai
 * @date 2025/4/8 10:28
 */
public interface ParamRepository extends JpaRepository<RequestParam, Long> {
}
