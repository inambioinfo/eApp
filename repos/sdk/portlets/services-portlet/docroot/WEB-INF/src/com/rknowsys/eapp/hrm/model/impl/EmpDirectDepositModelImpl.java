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

import com.rknowsys.eapp.hrm.model.EmpDirectDeposit;
import com.rknowsys.eapp.hrm.model.EmpDirectDepositModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EmpDirectDeposit service. Represents a row in the &quot;emp_direct_deposit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.EmpDirectDepositModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpDirectDepositImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpDirectDepositImpl
 * @see com.rknowsys.eapp.hrm.model.EmpDirectDeposit
 * @see com.rknowsys.eapp.hrm.model.EmpDirectDepositModel
 * @generated
 */
public class EmpDirectDepositModelImpl extends BaseModelImpl<EmpDirectDeposit>
	implements EmpDirectDepositModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emp direct deposit model instance should use the {@link com.rknowsys.eapp.hrm.model.EmpDirectDeposit} interface instead.
	 */
	public static final String TABLE_NAME = "emp_direct_deposit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "empDirectDepositId", Types.BIGINT },
			{ "employeeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "amount", Types.BIGINT },
			{ "accountNumber", Types.BIGINT },
			{ "bankName", Types.VARCHAR },
			{ "accountType", Types.VARCHAR },
			{ "branchLocation", Types.VARCHAR },
			{ "routingNumber", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table emp_direct_deposit (empDirectDepositId LONG not null primary key,employeeId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,amount LONG,accountNumber LONG,bankName VARCHAR(75) null,accountType VARCHAR(75) null,branchLocation VARCHAR(75) null,routingNumber VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table emp_direct_deposit";
	public static final String ORDER_BY_JPQL = " ORDER BY empDirectDeposit.empDirectDepositId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY emp_direct_deposit.empDirectDepositId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.EmpDirectDeposit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.EmpDirectDeposit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.EmpDirectDeposit"),
			true);
	public static long EMPDIRECTDEPOSITID_COLUMN_BITMASK = 1L;
	public static long EMPLOYEEID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.EmpDirectDeposit"));

	public EmpDirectDepositModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _empDirectDepositId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmpDirectDepositId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empDirectDepositId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmpDirectDeposit.class;
	}

	@Override
	public String getModelClassName() {
		return EmpDirectDeposit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empDirectDepositId", getEmpDirectDepositId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("amount", getAmount());
		attributes.put("accountNumber", getAccountNumber());
		attributes.put("bankName", getBankName());
		attributes.put("accountType", getAccountType());
		attributes.put("branchLocation", getBranchLocation());
		attributes.put("routingNumber", getRoutingNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empDirectDepositId = (Long)attributes.get("empDirectDepositId");

		if (empDirectDepositId != null) {
			setEmpDirectDepositId(empDirectDepositId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Long accountNumber = (Long)attributes.get("accountNumber");

		if (accountNumber != null) {
			setAccountNumber(accountNumber);
		}

		String bankName = (String)attributes.get("bankName");

		if (bankName != null) {
			setBankName(bankName);
		}

		String accountType = (String)attributes.get("accountType");

		if (accountType != null) {
			setAccountType(accountType);
		}

		String branchLocation = (String)attributes.get("branchLocation");

		if (branchLocation != null) {
			setBranchLocation(branchLocation);
		}

		String routingNumber = (String)attributes.get("routingNumber");

		if (routingNumber != null) {
			setRoutingNumber(routingNumber);
		}
	}

	@Override
	public long getEmpDirectDepositId() {
		return _empDirectDepositId;
	}

	@Override
	public void setEmpDirectDepositId(long empDirectDepositId) {
		_columnBitmask |= EMPDIRECTDEPOSITID_COLUMN_BITMASK;

		if (!_setOriginalEmpDirectDepositId) {
			_setOriginalEmpDirectDepositId = true;

			_originalEmpDirectDepositId = _empDirectDepositId;
		}

		_empDirectDepositId = empDirectDepositId;
	}

	public long getOriginalEmpDirectDepositId() {
		return _originalEmpDirectDepositId;
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeId) {
			_setOriginalEmployeeId = true;

			_originalEmployeeId = _employeeId;
		}

		_employeeId = employeeId;
	}

	public long getOriginalEmployeeId() {
		return _originalEmployeeId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
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
	public long getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(long amount) {
		_amount = amount;
	}

	@Override
	public long getAccountNumber() {
		return _accountNumber;
	}

	@Override
	public void setAccountNumber(long accountNumber) {
		_accountNumber = accountNumber;
	}

	@Override
	public String getBankName() {
		if (_bankName == null) {
			return StringPool.BLANK;
		}
		else {
			return _bankName;
		}
	}

	@Override
	public void setBankName(String bankName) {
		_bankName = bankName;
	}

	@Override
	public String getAccountType() {
		if (_accountType == null) {
			return StringPool.BLANK;
		}
		else {
			return _accountType;
		}
	}

	@Override
	public void setAccountType(String accountType) {
		_accountType = accountType;
	}

	@Override
	public String getBranchLocation() {
		if (_branchLocation == null) {
			return StringPool.BLANK;
		}
		else {
			return _branchLocation;
		}
	}

	@Override
	public void setBranchLocation(String branchLocation) {
		_branchLocation = branchLocation;
	}

	@Override
	public String getRoutingNumber() {
		if (_routingNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _routingNumber;
		}
	}

	@Override
	public void setRoutingNumber(String routingNumber) {
		_routingNumber = routingNumber;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EmpDirectDeposit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmpDirectDeposit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmpDirectDeposit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmpDirectDepositImpl empDirectDepositImpl = new EmpDirectDepositImpl();

		empDirectDepositImpl.setEmpDirectDepositId(getEmpDirectDepositId());
		empDirectDepositImpl.setEmployeeId(getEmployeeId());
		empDirectDepositImpl.setGroupId(getGroupId());
		empDirectDepositImpl.setCompanyId(getCompanyId());
		empDirectDepositImpl.setCreateDate(getCreateDate());
		empDirectDepositImpl.setModifiedDate(getModifiedDate());
		empDirectDepositImpl.setUserId(getUserId());
		empDirectDepositImpl.setAmount(getAmount());
		empDirectDepositImpl.setAccountNumber(getAccountNumber());
		empDirectDepositImpl.setBankName(getBankName());
		empDirectDepositImpl.setAccountType(getAccountType());
		empDirectDepositImpl.setBranchLocation(getBranchLocation());
		empDirectDepositImpl.setRoutingNumber(getRoutingNumber());

		empDirectDepositImpl.resetOriginalValues();

		return empDirectDepositImpl;
	}

	@Override
	public int compareTo(EmpDirectDeposit empDirectDeposit) {
		long primaryKey = empDirectDeposit.getPrimaryKey();

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

		if (!(obj instanceof EmpDirectDeposit)) {
			return false;
		}

		EmpDirectDeposit empDirectDeposit = (EmpDirectDeposit)obj;

		long primaryKey = empDirectDeposit.getPrimaryKey();

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
		EmpDirectDepositModelImpl empDirectDepositModelImpl = this;

		empDirectDepositModelImpl._originalEmpDirectDepositId = empDirectDepositModelImpl._empDirectDepositId;

		empDirectDepositModelImpl._setOriginalEmpDirectDepositId = false;

		empDirectDepositModelImpl._originalEmployeeId = empDirectDepositModelImpl._employeeId;

		empDirectDepositModelImpl._setOriginalEmployeeId = false;

		empDirectDepositModelImpl._originalGroupId = empDirectDepositModelImpl._groupId;

		empDirectDepositModelImpl._setOriginalGroupId = false;

		empDirectDepositModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmpDirectDeposit> toCacheModel() {
		EmpDirectDepositCacheModel empDirectDepositCacheModel = new EmpDirectDepositCacheModel();

		empDirectDepositCacheModel.empDirectDepositId = getEmpDirectDepositId();

		empDirectDepositCacheModel.employeeId = getEmployeeId();

		empDirectDepositCacheModel.groupId = getGroupId();

		empDirectDepositCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			empDirectDepositCacheModel.createDate = createDate.getTime();
		}
		else {
			empDirectDepositCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			empDirectDepositCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			empDirectDepositCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		empDirectDepositCacheModel.userId = getUserId();

		empDirectDepositCacheModel.amount = getAmount();

		empDirectDepositCacheModel.accountNumber = getAccountNumber();

		empDirectDepositCacheModel.bankName = getBankName();

		String bankName = empDirectDepositCacheModel.bankName;

		if ((bankName != null) && (bankName.length() == 0)) {
			empDirectDepositCacheModel.bankName = null;
		}

		empDirectDepositCacheModel.accountType = getAccountType();

		String accountType = empDirectDepositCacheModel.accountType;

		if ((accountType != null) && (accountType.length() == 0)) {
			empDirectDepositCacheModel.accountType = null;
		}

		empDirectDepositCacheModel.branchLocation = getBranchLocation();

		String branchLocation = empDirectDepositCacheModel.branchLocation;

		if ((branchLocation != null) && (branchLocation.length() == 0)) {
			empDirectDepositCacheModel.branchLocation = null;
		}

		empDirectDepositCacheModel.routingNumber = getRoutingNumber();

		String routingNumber = empDirectDepositCacheModel.routingNumber;

		if ((routingNumber != null) && (routingNumber.length() == 0)) {
			empDirectDepositCacheModel.routingNumber = null;
		}

		return empDirectDepositCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{empDirectDepositId=");
		sb.append(getEmpDirectDepositId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", accountNumber=");
		sb.append(getAccountNumber());
		sb.append(", bankName=");
		sb.append(getBankName());
		sb.append(", accountType=");
		sb.append(getAccountType());
		sb.append(", branchLocation=");
		sb.append(getBranchLocation());
		sb.append(", routingNumber=");
		sb.append(getRoutingNumber());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.EmpDirectDeposit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empDirectDepositId</column-name><column-value><![CDATA[");
		sb.append(getEmpDirectDepositId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
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
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountNumber</column-name><column-value><![CDATA[");
		sb.append(getAccountNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankName</column-name><column-value><![CDATA[");
		sb.append(getBankName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountType</column-name><column-value><![CDATA[");
		sb.append(getAccountType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>branchLocation</column-name><column-value><![CDATA[");
		sb.append(getBranchLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>routingNumber</column-name><column-value><![CDATA[");
		sb.append(getRoutingNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmpDirectDeposit.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmpDirectDeposit.class
		};
	private long _empDirectDepositId;
	private long _originalEmpDirectDepositId;
	private boolean _setOriginalEmpDirectDepositId;
	private long _employeeId;
	private long _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _amount;
	private long _accountNumber;
	private String _bankName;
	private String _accountType;
	private String _branchLocation;
	private String _routingNumber;
	private long _columnBitmask;
	private EmpDirectDeposit _escapedModel;
}