package com.spt.repository;

import com.spt.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * User: Panupong Chantaklang
 * Date: 06/02/2013
 */
public interface RegionRepository  extends JpaSpecificationExecutor<Region>, JpaRepository<Region,Long> {}
