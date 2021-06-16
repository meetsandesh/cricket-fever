/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.dtype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

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
public class BallerType extends GenericParameter {
	
	private String ballerType;
	
	public static final String D_TYPE="BallerType";
	public static final String LEG_SPIN="LEG_SPIN";
	public static final String OFF_SPIN="OFF_SPIN";
	public static final String FAST_PACE="FAST_PACE";
	public static final String MEDIUM_PACE="MEDIUM_PACE";

}
