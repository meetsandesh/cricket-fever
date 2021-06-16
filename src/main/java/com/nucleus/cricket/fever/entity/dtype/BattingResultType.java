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
public class BattingResultType extends GenericParameter {
	
	private String resultType;
	
	public static final String D_TYPE="BattingResultType"; 
	
	public static final String DISMISSED="DISMISSED";
	public static final String DOT_BALL="DOT_BALL";
	public static final String SINGLE="SINGLE";
	public static final String DOUBLE="DOUBLE";
	public static final String TRIPLE="TRIPLE";
	public static final String BOUNDARY_FOUR="BOUNDARY_FOUR";
	public static final String BOUNDARY_SIX="BOUNDARY_SIX";
	public static final String EXTRAS="EXTRAS";
	public static final String PENALTY="PENALTY";
	
}
