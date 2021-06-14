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
public class InvalidInningReasonType extends GenericParameter {
	
	private String reasonType;
	
	public static final String D_TYPE="InvalidInningReasonType"; 
	
	public static final String CHOOSE_NOT_TO_PLAY="CHOOSE_NOT_TO_PLAY";
	public static final String DWL="DWL";
	public static final String WEATHER_INTERRUPTION="WEATHER_INTERRUPTION";
	public static final String MISHAPPENING="MISHAPPENING";
	
}
