package com.spt.remote.repository;

import com.spt.remote.entity.RemoteRegion;
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
public class RemoteRegionHibernateRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext(unitName = "oracleEntityManagerFactory")
    private EntityManager entityManager;

    public List<RemoteRegion> getExact(RemoteRegion region){
        logger.debug("Inp : {}",region);
        Example example = Example.create(region).enableLike(MatchMode.EXACT);
        Criteria c = ((Session) entityManager.getDelegate()).createCriteria(RemoteRegion.class).add(example);
        return c.list();
    }

}
