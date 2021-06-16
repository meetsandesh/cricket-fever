/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.transactional;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.nucleus.cricket.fever.entity.dtype.*;
import com.nucleus.cricket.fever.entity.master.*;
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
public class CricketMatch extends TransactionalEntity {

	private WeatherType weatherTypeAtStart;
	private Stadium venue;
	private List<Commentator> commentators;
	private List<Umpire> umpires;
	private Referee referee;

//	is it a right annotation?
	@ManyToMany
	private Team teamA;
	@ManyToMany
	private Team teamB;

	private Player coinTossBy;
	private Player tossCalledBy;
	private CoinSideType callerCoinSide;

	private TossResult tossResult;

	private TossWinDecisonType tossWinDecisonType;

	private TournamentCricketMatchType tournamentCricketMatchType;
	private CricketMatchType cricketMatchType;
	private BallColorType ballColorType;
	private List<Inning> innings;

	private List<CricketMatchBreak> cricketMatchBreaks;

	private List<CricketMatchBreak> cricketMatchInterruptions;

	private CricketMatchResult cricketMatchResult;


}
