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
public class WeatherType extends GenericParameter {
	
	private String weatherType;
	
	public static final String D_TYPE="WeatherType"; 
	
	public static final String SUNNY="SUNNY";
	public static final String RAINY="RAINY";
	public static final String DRIZZLE="DRIZZLE";
	public static final String COLD="COLD";
	public static final String WINDY="WINDY";
	public static final String HUMID="HUMID";
	
}
