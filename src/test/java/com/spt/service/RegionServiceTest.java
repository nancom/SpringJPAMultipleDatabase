package com.spt.service;

import com.spt.entity.Region;
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

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml")
@Transactional(value = "derbyTransactionManager")
@Configurable
public class RegionServiceTest {

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
    public void findAll(){
        Assert.assertEquals("!! Record Founded !!", 10, regionService.findAll().size());
    }

    @Test
    public void count() {
    	Assert.assertEquals("!! Record Founded !!", 10, regionService.count());
    }

    @Test
    public void add() {
    	Region region = new Region();
    	region.setRegionCode("9980");
    	region.setRegionName("Region 999");
    	region.setInactive(new Date());
    	region.setTransfer(new Date());
    	regionService.add(region);

    	Assert.assertEquals("!! Record Founded !!", 11, regionService.count());
    }

    @Test
    public void update(){
        String result = "Region XXX";
        List<Region> regionList = regionService.findAll();
        Long regionId = regionList.get(0).getId();
        Region region = regionList.get(0);
        region.setRegionName(result);
        regionService.update(region);

        Assert.assertEquals("!! not expect value !!", result, regionService.find(regionId).getRegionName());
    }

    @Test
    public void delete(){
        List<Region> regionList = regionService.findAll();
        Region region = regionList.get(0);
        regionService.delete(region);

        Assert.assertEquals("!! Record Founded !!", 9, regionService.findAll().size());
    }

    @Test
    public void getExact(){
    	Region region = new Region();
    	region.setRegionName("Center");

        Assert.assertEquals("!! Un-Expect result !!", 1, regionService.getExact(region).size());
    }


    @Test
    public void getThaiExact(){
        Region region = new Region();
        region.setRegionName("ภาคเหนือ%");

        Assert.assertEquals("!! Un-Expect result !!", 2, regionService.getExact(region).size());
    }

}
