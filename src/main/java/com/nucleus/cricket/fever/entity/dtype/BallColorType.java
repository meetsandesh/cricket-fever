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
public class BallColorType extends GenericParameter {
	
	private String colorType;
	
	public static final String D_TYPE="BallColorType"; 
	
	public static final String RED="RED";
	public static final String WHITE="WHITE";
	public static final String PINK="PINK";
	
}
