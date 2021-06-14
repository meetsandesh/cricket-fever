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
public class TournamentCricketMatchType extends GenericParameter {
	
	private String tournamentCricketMatchType;
	
	public static final String D_TYPE="TournamentCricketMatchType"; 
	
	public static final String BASIC="BASIC";	
	public static final String GROUP_STAGE="GROUP_STAGE";
	public static final String QUARTER_FINAL="QUARTER_FINAL";
	public static final String SEMI_FINAL="SEMI_FINAL";
	public static final String FINAL="FINAL";
	
}
