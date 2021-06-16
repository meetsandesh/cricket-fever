package com.nucleus.cricket.fever.entity.transactional;

import com.nucleus.cricket.fever.entity.master.Player;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@FieldNameConstants
public class PlayerRank extends TransactionalEntity {

	private Player player;
	private int rank;
	private double rating;
	private double average;
	private double totalRuns;
	private double totalWickets;
	private double maidenOvers;
	private double ballingEconomy;

}
