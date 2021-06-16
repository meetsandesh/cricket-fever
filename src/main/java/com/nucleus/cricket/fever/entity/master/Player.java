package com.nucleus.cricket.fever.entity.master;

import com.nucleus.cricket.fever.entity.dtype.ArmType;
import com.nucleus.cricket.fever.entity.dtype.BallerType;
import com.nucleus.cricket.fever.entity.dtype.PersonRoleType;
import com.nucleus.cricket.fever.entity.dtype.TeamRoleType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
public class Player extends Person {

//	can play for multiple teams
	@ManyToMany
	private List<Team> teams;
	@ManyToOne
	private ArmType battingArmType;
	@ManyToOne
	private ArmType ballingArmType;
	@ManyToOne
	private BallerType ballerType;
//	can be captain and a baller
	@ManyToMany
	private List<TeamRoleType> teamRoleTypes;

}
