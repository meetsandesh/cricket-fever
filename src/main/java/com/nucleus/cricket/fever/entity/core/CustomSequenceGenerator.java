/*
 * Copyright [2021] [Sandesh Kumar Singh]
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nucleus.cricket.fever.entity.core;

import com.nucleus.cricket.fever.entity.master.MasterEntity;
import java.io.Serializable;
import java.util.Properties;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.relational.QualifiedName;
import org.hibernate.boot.model.relational.QualifiedNameImpl;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;


/**
 * This is an implementation of SequenceStyleGenerator which limits the name of
 * sequence/table (auto created for sequence generation) to not exceed 30.
 * 
 * @author sandesh.singh
 */
public class CustomSequenceGenerator extends SequenceStyleGenerator {

	public static final String ENTITY_TARGET_TABLE_NAME = "target_table";
	public static final String FULLY_QUALIFIED_ENTITY_NAME = "entity_name";

	/**
	 * Determine the name of the sequence to use. This method overrides the one
	 * provided by SequenceStyleGenerator and uses the target table name to
	 * determine the sequence name instead of the entity name.
	 * <p/>
	 *
	 * @param params  The params supplied in the generator config (plus some
	 *                standard useful extras).
	 * @param dialect The dialect in effect
	 * @return The sequence name
	 */
	@Override
	protected QualifiedName determineSequenceName(Properties params, Dialect dialect, JdbcEnvironment jdbcEnv,
			ServiceRegistry serviceRegistry) {
		String sequencePerEntitySuffix = ConfigurationHelper.getString(CONFIG_SEQUENCE_PER_ENTITY_SUFFIX, params,
				DEF_SEQUENCE_SUFFIX);
		// JPA_ENTITY_NAME value honors <class ... entity-name="..."> (HBM) and
		// @Entity#name (JPA) overrides.
		String sequenceName = ConfigurationHelper.getBoolean(CONFIG_PREFER_SEQUENCE_PER_ENTITY, params, false)
				? params.getProperty(ENTITY_TARGET_TABLE_NAME) + sequencePerEntitySuffix
				: DEF_SEQUENCE_NAME;
		sequenceName = DatabaseObjectNameUtils.abbreviateName(sequenceName);
		sequenceName = ConfigurationHelper.getString(SEQUENCE_PARAM, params, sequenceName);
		return new QualifiedNameImpl(jdbcEnv.getCurrentCatalog(), jdbcEnv.getCurrentSchema(),
				new Identifier(sequenceName, false));
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {

		if (object instanceof MasterEntity) {
			Serializable id = ((MasterEntity) object).getId();
			if (id != null) {
				return id;
			}
			//throw exception for external entity
		}
		return super.generate(session, object);
	}

}
