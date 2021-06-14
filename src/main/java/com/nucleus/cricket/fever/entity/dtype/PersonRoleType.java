/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.dtype;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Transient;
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
public class PersonRoleType extends GenericParameter {
	
	private String roleType;
	
	public static final String D_TYPE="PersonRoleType"; 
//	responsible for maintaining the ground even after the match
	public static final String GROUND_STAFF="GROUND_STAFF";	
	public static final String UMPIRE_ONE="UMPIRE_ONE";
	public static final String UMPIRE_TWO="UMPIRE_TWO";
	public static final String UMPIRE_THREE="UMPIRE_THREE";
	public static final String REFFREE="REFFREE";
	public static final String COMMENTATOR="COMMENTATOR";
	public static final String PLAYER="PLAYER";
//	responsible for fetching the ball after it has been hit beyond boundary
	public static final String BALL_BOY="BALL_BOY";
	
}
