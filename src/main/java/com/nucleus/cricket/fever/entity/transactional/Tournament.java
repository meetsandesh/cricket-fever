/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.transactional;

import com.nucleus.cricket.fever.entity.master.Team;
import com.nucleus.cricket.fever.entity.dtype.TournamentType;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
public class Tournament extends TransactionalEntity {
	
	@ManyToMany
	private TournamentType tournamentType;
	@Temporal(TemporalType.DATE)
	private Date tournamenStartDate;
	@Temporal(TemporalType.DATE)
	private Date tournamenEndDate;
	@OneToMany
	private List<CricketMatch> matches;
	@ManyToMany
	private List<Team> teams;

	private List<TeamRank> teamRanks;
	private List<PlayerRank> battingRanks;
	private List<TeamRank> ballingRanks;

	
	
}
