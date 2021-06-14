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
public class TournamentType extends GenericParameter {
	
	private String tournamentType;
	
	public static final String D_TYPE="TournamentType"; 
	
	public static final String BI_LATERAL_SERIES="BI_LATERAL_SERIES";	
	public static final String TRI_SERIES="TRI_SERIES";
	public static final String IPL="IPL";
	public static final String ASIA_CUP="ASIA_CUP";
	public static final String CHAMPIONS_LEAGUE="CHAMPIONS_LEAGUE";
	public static final String THE_ASHES="THE_ASHES";
	public static final String WORLD_CUP="WORLD_CUP";
	
}
