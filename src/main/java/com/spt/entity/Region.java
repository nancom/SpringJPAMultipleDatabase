package com.spt.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Integer version;

    @Column(name= "region_code")
    private String regionCode;

    @Column(name= "region_name")
    private String regionName;

    @Column(name= "inactive")
    private Date inactive;

    @Column(name= "transfer")
    private Date transfer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Date getInactive() {
		return inactive;
	}

	public void setInactive(Date inactive) {
		this.inactive = inactive;
	}

	public Date getTransfer() {
		return transfer;
	}

	public void setTransfer(Date transfer) {
		this.transfer = transfer;
	}

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
