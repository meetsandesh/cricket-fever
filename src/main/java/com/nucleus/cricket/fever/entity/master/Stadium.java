/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.master;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import java.util.List;

/**
 *
 * @author sandesh.singh
 */
@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
@Cacheable
public class Stadium extends MasterEntity {

//	this can also be considered as VENUE
	@ManyToOne
	private City city;
	private Long audienceCapacity;
	@OneToMany
	private List<StadiumStaff> StadiumStaffs;

}
