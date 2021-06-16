/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.transactional;

import javax.persistence.Entity;

import com.nucleus.cricket.fever.entity.dtype.BreakType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import java.util.Date;

/**
 *
 * @author sandesh.singh
 */
@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
public class CricketMatchBreak extends TransactionalEntity {

	private BreakType breakType;
	private Date startAt;
	private Date endAt;

}
