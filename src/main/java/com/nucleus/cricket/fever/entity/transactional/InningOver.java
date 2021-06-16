/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.transactional;

import javax.persistence.Entity;

import com.nucleus.cricket.fever.entity.master.Player;
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
public class InningOver extends TransactionalEntity {

	private List<Delivery> deliveries;
	private Player balledBy;

}
