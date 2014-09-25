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

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.rknowsys.eapp.hrm.service.ClpSerializer;
import com.rknowsys.eapp.hrm.service.WorkExpCompanyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rknowsys
 */
public class WorkExpCompanyClp extends BaseModelImpl<WorkExpCompany>
	implements WorkExpCompany {
	public WorkExpCompanyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return WorkExpCompany.class;
	}

	@Override
	public String getModelClassName() {
		return WorkExpCompany.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _workExpCompanyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkExpCompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workExpCompanyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workExpCompanyId", getWorkExpCompanyId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("company", getCompany());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("comment", getComment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workExpCompanyId = (Long)attributes.get("workExpCompanyId");

		if (workExpCompanyId != null) {
			setWorkExpCompanyId(workExpCompanyId);
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

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}
	}

	@Override
	public long getWorkExpCompanyId() {
		return _workExpCompanyId;
	}

	@Override
	public void setWorkExpCompanyId(long workExpCompanyId) {
		_workExpCompanyId = workExpCompanyId;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkExpCompanyId",
						long.class);

				method.invoke(_workExpCompanyRemoteModel, workExpCompanyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", long.class);

				method.invoke(_workExpCompanyRemoteModel, employeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_workExpCompanyRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_workExpCompanyRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_workExpCompanyRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_workExpCompanyRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_workExpCompanyRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompany() {
		return _company;
	}

	@Override
	public void setCompany(String company) {
		_company = company;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompany", String.class);

				method.invoke(_workExpCompanyRemoteModel, company);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJobTitle() {
		return _jobTitle;
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setJobTitle", String.class);

				method.invoke(_workExpCompanyRemoteModel, jobTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFromDate() {
		return _fromDate;
	}

	@Override
	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setFromDate", Date.class);

				method.invoke(_workExpCompanyRemoteModel, fromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getToDate() {
		return _toDate;
	}

	@Override
	public void setToDate(Date toDate) {
		_toDate = toDate;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setToDate", Date.class);

				method.invoke(_workExpCompanyRemoteModel, toDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComment() {
		return _comment;
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;

		if (_workExpCompanyRemoteModel != null) {
			try {
				Class<?> clazz = _workExpCompanyRemoteModel.getClass();

				Method method = clazz.getMethod("setComment", String.class);

				method.invoke(_workExpCompanyRemoteModel, comment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWorkExpCompanyRemoteModel() {
		return _workExpCompanyRemoteModel;
	}

	public void setWorkExpCompanyRemoteModel(
		BaseModel<?> workExpCompanyRemoteModel) {
		_workExpCompanyRemoteModel = workExpCompanyRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _workExpCompanyRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_workExpCompanyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WorkExpCompanyLocalServiceUtil.addWorkExpCompany(this);
		}
		else {
			WorkExpCompanyLocalServiceUtil.updateWorkExpCompany(this);
		}
	}

	@Override
	public WorkExpCompany toEscapedModel() {
		return (WorkExpCompany)ProxyUtil.newProxyInstance(WorkExpCompany.class.getClassLoader(),
			new Class[] { WorkExpCompany.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WorkExpCompanyClp clone = new WorkExpCompanyClp();

		clone.setWorkExpCompanyId(getWorkExpCompanyId());
		clone.setEmployeeId(getEmployeeId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCompany(getCompany());
		clone.setJobTitle(getJobTitle());
		clone.setFromDate(getFromDate());
		clone.setToDate(getToDate());
		clone.setComment(getComment());

		return clone;
	}

	@Override
	public int compareTo(WorkExpCompany workExpCompany) {
		long primaryKey = workExpCompany.getPrimaryKey();

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

		if (!(obj instanceof WorkExpCompanyClp)) {
			return false;
		}

		WorkExpCompanyClp workExpCompany = (WorkExpCompanyClp)obj;

		long primaryKey = workExpCompany.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{workExpCompanyId=");
		sb.append(getWorkExpCompanyId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", company=");
		sb.append(getCompany());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.WorkExpCompany");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workExpCompanyId</column-name><column-value><![CDATA[");
		sb.append(getWorkExpCompanyId());
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
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>company</column-name><column-value><![CDATA[");
		sb.append(getCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _workExpCompanyId;
	private long _employeeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _company;
	private String _jobTitle;
	private Date _fromDate;
	private Date _toDate;
	private String _comment;
	private BaseModel<?> _workExpCompanyRemoteModel;
}