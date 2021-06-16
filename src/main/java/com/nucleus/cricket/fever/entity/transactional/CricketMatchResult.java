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
public class CricketMatchResult extends TransactionalEntity {

	private Team winningTeam;

//	in case of tie
//	add more attributes to incorporate things like
//	ballout, superover, some different rules like most number of boundaries

}
