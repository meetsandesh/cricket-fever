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
public class TeamRoleType extends GenericParameter {
	
	private String roleType;
	
	public static final String D_TYPE="TeamRoleType"; 
//	responsible for team selection
	public static final String HEAD_COACH="HEAD_COACH";	
//	responsible for coaching in batting area
	public static final String BATTING_COACH="BATTING_COACH";
//	responsible for coaching in balling area
	public static final String BALLING_COACH="BALLING_COACH";
//	responsible for coaching in fielding area
	public static final String FIELDING_COACH="FIELDING_COACH";
	public static final String CAPTAIN="FIELDING_COACH";
	public static final String VICE_CAPTAIN="FIELDING_COACH";
	public static final String BATSMAN="BATSMAN";
	public static final String BALLER="BALLER";
	public static final String WICKETKEEPER="WICKETKEEPER";
//	responsible for fetching refreshments to playing members
	public static final String EXTRA="EXTRA";
	
//	not including allrounder as i will have one to many mapping
}
