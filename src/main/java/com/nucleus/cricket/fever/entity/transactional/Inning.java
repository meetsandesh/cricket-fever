/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.transactional;

import javax.persistence.Entity;

import com.nucleus.cricket.fever.entity.dtype.InvalidInningReasonType;
import com.nucleus.cricket.fever.entity.master.Team;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import java.util.List;

/**
 *
 * @author sandesh.singh
 */
@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
public class Inning extends TransactionalEntity {

	private int oversToBePlayed;
	private int oversPlayed;
	private Team battingTeam;
	private int runsInThisInning;
	private int carryOnRuns;
	private int totalRuns;
	private Boolean validInning;
	private List<InningOver> inningOvers;
	private InvalidInningReasonType invalidInningReasonType;
	
}
