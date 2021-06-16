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
public class ArmType extends GenericParameter {
	
	private String armType;
	
	public static final String D_TYPE="ArmType";
	public static final String LEFT_ARM="LEFT_ARM";
	public static final String RIGHT_ARM="RIGHT_ARM";

}
