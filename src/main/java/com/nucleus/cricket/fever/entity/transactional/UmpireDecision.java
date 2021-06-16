package com.nucleus.cricket.fever.entity.transactional;

import com.nucleus.cricket.fever.entity.dtype.UmpireDecisionType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
public class UmpireDecision extends TransactionalEntity {

	private List<UmpireDecisionType> umpireDecisionTypes;

}
