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
public class UmpireDecisionType extends GenericParameter {
	
	private String umpireDecisionType;
	
	public static final String D_TYPE="UmpireDecisionType"; 
	
	public static final String BYE="BYE";	
	public static final String LEG_BYE="LEG_BYE";
	public static final String OUT="OUT";
	public static final String NOT_OUT="NOT_OUT";
	public static final String BOUNCER="BOUNCER";
	public static final String NO_BALL="NO_BALL";
	public static final String WIDE_BALL="WIDE_BALL";
	public static final String DEAD_BALL="DEAD_BALL";
	public static final String BOUNDARY_FOUR="BOUNDARY_FOUR";
	public static final String BOUNDARY_SIX="BOUNDARY_SIX";
//	when umpire decides to go upstairs
	public static final String THRID_UMPIRE="THRID_UMPIRE";
//	when captain/batsman decides to go upstairs
	public static final String THRID_UMPIRE_REVIEW="THRID_UMPIRE_REVIEW";
	
}
