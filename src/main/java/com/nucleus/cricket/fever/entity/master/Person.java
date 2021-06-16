/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.master;

import javax.persistence.*;

import com.nucleus.cricket.fever.entity.dtype.PersonRoleType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import java.util.List;

/**
 *
 * @author sandesh.singh
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@FieldNameConstants
public class Person extends MasterEntity {

	@ManyToOne
	private Country nationality;
	@ManyToOne
	private PersonRoleType personRoleType;
	@ManyToMany
	private List<Language> languageSpoken;

}
