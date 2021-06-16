package com.nucleus.cricket.fever.entity.transactional;

import com.nucleus.cricket.fever.entity.master.Team;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
public class TeamRank extends TransactionalEntity {

	private Team team;
	private int rank;
	private int winCount;
	private int lossCount;
	private int drawCount;
	private double points;

}
