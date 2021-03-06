/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.TerminationReasons;
import com.rknowsys.eapp.hrm.model.TerminationReasonsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TerminationReasons service. Represents a row in the &quot;terminationreasons&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.TerminationReasonsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TerminationReasonsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see TerminationReasonsImpl
 * @see com.rknowsys.eapp.hrm.model.TerminationReasons
 * @see com.rknowsys.eapp.hrm.model.TerminationReasonsModel
 * @generated
 */
public class TerminationReasonsModelImpl extends BaseModelImpl<TerminationReasons>
	implements TerminationReasonsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a termination reasons model instance should use the {@link com.rknowsys.eapp.hrm.model.TerminationReasons} interface instead.
	 */
	public static final String TABLE_NAME = "terminationreasons";
	public static final Object[][] TABLE_COLUMNS = {
			{ "terminationreasonsId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "terminationreasonsName", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table terminationreasons (terminationreasonsId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,terminationreasonsName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table terminationreasons";
	public static final String ORDER_BY_JPQL = " ORDER BY terminationReasons.terminationreasonsId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY terminationreasons.terminationreasonsId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.TerminationReasons"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.TerminationReasons"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.TerminationReasons"));

	public TerminationReasonsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _terminationreasonsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTerminationreasonsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _terminationreasonsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TerminationReasons.class;
	}

	@Override
	public String getModelClassName() {
		return TerminationReasons.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("terminationreasonsId", getTerminationreasonsId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("terminationreasonsName", getTerminationreasonsName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long terminationreasonsId = (Long)attributes.get("terminationreasonsId");

		if (terminationreasonsId != null) {
			setTerminationreasonsId(terminationreasonsId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String terminationreasonsName = (String)attributes.get(
				"terminationreasonsName");

		if (terminationreasonsName != null) {
			setTerminationreasonsName(terminationreasonsName);
		}
	}

	@Override
	public long getTerminationreasonsId() {
		return _terminationreasonsId;
	}

	@Override
	public void setTerminationreasonsId(long terminationreasonsId) {
		_terminationreasonsId = terminationreasonsId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getTerminationreasonsName() {
		if (_terminationreasonsName == null) {
			return StringPool.BLANK;
		}
		else {
			return _terminationreasonsName;
		}
	}

	@Override
	public void setTerminationreasonsName(String terminationreasonsName) {
		_terminationreasonsName = terminationreasonsName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TerminationReasons.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TerminationReasons toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TerminationReasons)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TerminationReasonsImpl terminationReasonsImpl = new TerminationReasonsImpl();

		terminationReasonsImpl.setTerminationreasonsId(getTerminationreasonsId());
		terminationReasonsImpl.setCompanyId(getCompanyId());
		terminationReasonsImpl.setGroupId(getGroupId());
		terminationReasonsImpl.setCreateDate(getCreateDate());
		terminationReasonsImpl.setModifiedDate(getModifiedDate());
		terminationReasonsImpl.setUserId(getUserId());
		terminationReasonsImpl.setTerminationreasonsName(getTerminationreasonsName());

		terminationReasonsImpl.resetOriginalValues();

		return terminationReasonsImpl;
	}

	@Override
	public int compareTo(TerminationReasons terminationReasons) {
		long primaryKey = terminationReasons.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TerminationReasons)) {
			return false;
		}

		TerminationReasons terminationReasons = (TerminationReasons)obj;

		long primaryKey = terminationReasons.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TerminationReasons> toCacheModel() {
		TerminationReasonsCacheModel terminationReasonsCacheModel = new TerminationReasonsCacheModel();

		terminationReasonsCacheModel.terminationreasonsId = getTerminationreasonsId();

		terminationReasonsCacheModel.companyId = getCompanyId();

		terminationReasonsCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			terminationReasonsCacheModel.createDate = createDate.getTime();
		}
		else {
			terminationReasonsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			terminationReasonsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			terminationReasonsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		terminationReasonsCacheModel.userId = getUserId();

		terminationReasonsCacheModel.terminationreasonsName = getTerminationreasonsName();

		String terminationreasonsName = terminationReasonsCacheModel.terminationreasonsName;

		if ((terminationreasonsName != null) &&
				(terminationreasonsName.length() == 0)) {
			terminationReasonsCacheModel.terminationreasonsName = null;
		}

		return terminationReasonsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{terminationreasonsId=");
		sb.append(getTerminationreasonsId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", terminationreasonsName=");
		sb.append(getTerminationreasonsName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.TerminationReasons");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>terminationreasonsId</column-name><column-value><![CDATA[");
		sb.append(getTerminationreasonsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>terminationreasonsName</column-name><column-value><![CDATA[");
		sb.append(getTerminationreasonsName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TerminationReasons.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TerminationReasons.class
		};
	private long _terminationreasonsId;
	private long _companyId;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private String _terminationreasonsName;
	private TerminationReasons _escapedModel;
}