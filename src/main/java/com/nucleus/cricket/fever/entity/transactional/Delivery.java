/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.transactional;

import javax.persistence.Entity;

import com.nucleus.cricket.fever.entity.dtype.*;
import com.nucleus.cricket.fever.entity.master.Player;
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
public class Delivery extends TransactionalEntity {

	private Player balledBy;
	private BallType ballType;
	private BallStatusType ballStatusType;
	private Player facedBy;
	private BattingResultType battingResultType;
	private DismissalType dismissalType;
	private int runsScored;
	private List<Player> fieldedBy;
	private UmpireDecision initialUmpireDecision;
	private Team reviewTakingTeam;
	private Player reviewTakenBy;
	private ThirdUmpireDecision thirdUmpireDecision;
//	after third Umpire review
	private UmpireDecision updatedUmpireDecision;

}
