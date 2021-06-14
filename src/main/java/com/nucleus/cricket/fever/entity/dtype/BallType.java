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
public class BallType extends GenericParameter {
	
	private String ballType;
	
	public static final String D_TYPE="BallType"; 
	
	public static final String SHORT_PITCH="SHORT_PITCH";
	public static final String FULL_LENGTH="FULL_LENGTH";
	public static final String YORKER="YORKER";
	public static final String FULL_TOSS="FULL_TOSS";
	
}
