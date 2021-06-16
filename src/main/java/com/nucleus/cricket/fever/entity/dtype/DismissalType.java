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
public class DismissalType extends GenericParameter {

	private String DismissalType;

	public static final String D_TYPE="DismissalType";
	public static final String CAUGHT="CAUGHT";
	public static final String STUMPED="STUMPED";
	public static final String DIRECT_WICKET="DIRECT_WICKET";
	public static final String RUN_OUT="RUN_OUT";
	public static final String HIT_WICKET="HIT_WICKET";

}
