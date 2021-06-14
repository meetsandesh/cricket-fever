/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.dtype;

import com.nucleus.cricket.fever.entity.BaseEntity;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

/**
 *
 * @author sandesh.singh
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@FieldNameConstants
public class GenericParameter extends BaseEntity {
	
}
