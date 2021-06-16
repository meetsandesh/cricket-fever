package com.nucleus.cricket.fever.entity.dtype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
@Cacheable
public class BallStatusType extends GenericParameter {

	private String statusType;

	public static final String D_TYPE="BallStatusType";

	public static final String NEW="NEW";
	public static final String OLD="OLD";

}
