/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.master;

import com.nucleus.cricket.fever.entity.dtype.TeamType;
import com.nucleus.cricket.fever.entity.transactional.TransactionalEntity;
import java.util.List;
import javax.persistence.*;

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
public class Team extends TransactionalEntity {
	
	@ManyToOne
	private Country country;
	@OneToOne
	private TeamType teamType;
	@ManyToMany
	private List<Player> players;
	@OneToMany
	private List<TeamStaff> teamStaffs;

}
