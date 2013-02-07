package com.spt.service;

import com.spt.remote.entity.RemoteRegion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml")
@Transactional(value = "oracleTransactionManager")
@Configurable
public class RemoteRegionServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    RegionService regionService;

    @Before
    public void before(){
        logger.debug("-= Before Method =-");
    }

    @Test
    public void remark(){
        Assert.assertTrue(Boolean.TRUE);
    }

    @Test
    public void getExact(){
        String result = "Europe";
        RemoteRegion region = new RemoteRegion();
        region.setRegionName("E%");
        Assert.assertEquals("!! Record Not Founded !!", result, regionService.getRemoteExact(region).get(0).getRegionName());
    }
}
