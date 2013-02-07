package com.spt.service;

import com.spt.entity.Region;
import com.spt.remote.entity.RemoteRegion;

import java.util.List;

public interface RegionService {

    public abstract long count();

    public abstract Region find(Long id);

    public abstract Region add(Region obj);

    public abstract Region update(Region obj);

    public abstract void delete(Region obj);

    public abstract List<Region> findAll();

    public abstract List<Region> getExact(Region obj);

    /* Remote Service */
    public List<RemoteRegion> getRemoteExact(RemoteRegion obj);

}
