package com.spt.service;

import com.spt.entity.Region;
import com.spt.remote.entity.RemoteRegion;
import com.spt.remote.repository.RemoteRegionHibernateRepository;
import com.spt.repository.RegionHibernateRepository;
import com.spt.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
    RegionRepository regionRepository;
    @Autowired
    RegionHibernateRepository regionHibernateRepository;
    @Autowired
    RemoteRegionHibernateRepository remoteRegionHibernateRepository;


    @Override
	public long count() {
		return regionRepository.count();
	}

    @Override
	public Region find(Long id) {
		return regionRepository.findOne(id);
	}

    @Override
	public Region add(Region obj) {
		return regionRepository.save(obj);
	}

    @Override
	public Region update(Region obj) {
		return regionRepository.saveAndFlush(obj);
	}

    @Override
	public void delete(Region obj) {
    	regionRepository.delete(obj);
	}

    @Override
	public List<Region> findAll() {
		return regionRepository.findAll();
	}

    @Override
	public List<Region> getExact(Region
                                             obj) {
		return regionHibernateRepository.getExact(obj);
	}

    @Override
    public List<RemoteRegion> getRemoteExact(RemoteRegion obj) {
        return remoteRegionHibernateRepository.getExact(obj);
    }
}
