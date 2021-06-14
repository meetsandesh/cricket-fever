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
public class TeamType extends GenericParameter {
	
	private String teamType;
	
	public static final String D_TYPE="TeamType"; 
	
	public static final String INTERNATIONAL_TEAM="INTERNATIONAL_TEAM";	
	public static final String TEAM_A="TEAM_A";
	public static final String TEAM_B="TEAM_B";
	public static final String U_19="U_19";
	
}
