/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.dtype;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

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
public class CricketMatchType extends GenericParameter {
	
	private String cricketMatchType;
	
	public static final String D_TYPE="CricketMatchType"; 
	
	public static final String ONE_DAY="ONE_DAY";	
	public static final String TEST="TEST";
	public static final String T20="T20";
	
}
