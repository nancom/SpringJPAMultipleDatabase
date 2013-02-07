package com.spt.remote.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;


@Entity
@Table(name = "REGIONS")
public class RemoteRegion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REGION_ID")
    private Long id;

    @Column(name= "REGION_NAME")
    private String regionName;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
