package com.nucleus.cricket.fever.entity.master;

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
public class TeamStaff extends Person {

	@ManyToMany
	private List<TeamRoleType> teamRoleTypes;
	@ManyToOne
	private Team team;

}
