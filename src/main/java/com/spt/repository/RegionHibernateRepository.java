package com.spt.repository;

import com.spt.entity.Region;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class RegionHibernateRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext(unitName = "derbyEntityManagerFactory")
    private EntityManager entityManager;

    public List<Region> getExact(Region region){
        logger.debug("Inp : {} {}",region);
        Example example = Example.create(region).enableLike(MatchMode.EXACT);
        Criteria c = ((Session) entityManager.getDelegate()).createCriteria(Region.class).add(example);
        return c.list();
    }

}
