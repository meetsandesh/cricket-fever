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
public class BreakType extends GenericParameter {
	
	private String breakType;
	
	public static final String D_TYPE="BreakType"; 
	
	public static final String INTER_INNING="INTER_INNING";
	public static final String LUNCH="LUNCH";
	public static final String SNACKS="SNACKS";
	public static final String WEATHER_INTTERUPTION="WEATHER_INTTERUPTION";
	public static final String MISHAPPENING="MISHAPPENING";
	
}
