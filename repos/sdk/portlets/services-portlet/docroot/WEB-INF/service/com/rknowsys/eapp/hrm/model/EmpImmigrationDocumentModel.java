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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmpImmigrationDocument service. Represents a row in the &quot;emp_immigration_document&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpImmigrationDocumentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpImmigrationDocumentImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpImmigrationDocument
 * @see com.rknowsys.eapp.hrm.model.impl.EmpImmigrationDocumentImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpImmigrationDocumentModelImpl
 * @generated
 */
public interface EmpImmigrationDocumentModel extends BaseModel<EmpImmigrationDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ImmigrationDocument model instance should use the {@link EmpImmigrationDocument} interface instead.
	 */

	/**
	 * Returns the primary key of this ImmigrationDocument.
	 *
	 * @return the primary key of this ImmigrationDocument
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ImmigrationDocument.
	 *
	 * @param primaryKey the primary key of this ImmigrationDocument
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp immigration document ID of this ImmigrationDocument.
	 *
	 * @return the emp immigration document ID of this ImmigrationDocument
	 */
	public long getEmpImmigrationDocumentId();

	/**
	 * Sets the emp immigration document ID of this ImmigrationDocument.
	 *
	 * @param empImmigrationDocumentId the emp immigration document ID of this ImmigrationDocument
	 */
	public void setEmpImmigrationDocumentId(long empImmigrationDocumentId);

	/**
	 * Returns the employee ID of this ImmigrationDocument.
	 *
	 * @return the employee ID of this ImmigrationDocument
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this ImmigrationDocument.
	 *
	 * @param employeeId the employee ID of this ImmigrationDocument
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this ImmigrationDocument.
	 *
	 * @return the group ID of this ImmigrationDocument
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this ImmigrationDocument.
	 *
	 * @param groupId the group ID of this ImmigrationDocument
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ImmigrationDocument.
	 *
	 * @return the company ID of this ImmigrationDocument
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this ImmigrationDocument.
	 *
	 * @param companyId the company ID of this ImmigrationDocument
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this ImmigrationDocument.
	 *
	 * @return the create date of this ImmigrationDocument
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this ImmigrationDocument.
	 *
	 * @param createDate the create date of this ImmigrationDocument
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ImmigrationDocument.
	 *
	 * @return the modified date of this ImmigrationDocument
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ImmigrationDocument.
	 *
	 * @param modifiedDate the modified date of this ImmigrationDocument
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this ImmigrationDocument.
	 *
	 * @return the user ID of this ImmigrationDocument
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this ImmigrationDocument.
	 *
	 * @param userId the user ID of this ImmigrationDocument
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ImmigrationDocument.
	 *
	 * @return the user uuid of this ImmigrationDocument
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this ImmigrationDocument.
	 *
	 * @param userUuid the user uuid of this ImmigrationDocument
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the doc type of this ImmigrationDocument.
	 *
	 * @return the doc type of this ImmigrationDocument
	 */
	@AutoEscape
	public String getDocType();

	/**
	 * Sets the doc type of this ImmigrationDocument.
	 *
	 * @param docType the doc type of this ImmigrationDocument
	 */
	public void setDocType(String docType);

	/**
	 * Returns the doc number of this ImmigrationDocument.
	 *
	 * @return the doc number of this ImmigrationDocument
	 */
	@AutoEscape
	public String getDocNumber();

	/**
	 * Sets the doc number of this ImmigrationDocument.
	 *
	 * @param docNumber the doc number of this ImmigrationDocument
	 */
	public void setDocNumber(String docNumber);

	/**
	 * Returns the issued date of this ImmigrationDocument.
	 *
	 * @return the issued date of this ImmigrationDocument
	 */
	public Date getIssuedDate();

	/**
	 * Sets the issued date of this ImmigrationDocument.
	 *
	 * @param issuedDate the issued date of this ImmigrationDocument
	 */
	public void setIssuedDate(Date issuedDate);

	/**
	 * Returns the expiry date of this ImmigrationDocument.
	 *
	 * @return the expiry date of this ImmigrationDocument
	 */
	public Date getExpiryDate();

	/**
	 * Sets the expiry date of this ImmigrationDocument.
	 *
	 * @param expiryDate the expiry date of this ImmigrationDocument
	 */
	public void setExpiryDate(Date expiryDate);

	/**
	 * Returns the eligible status of this ImmigrationDocument.
	 *
	 * @return the eligible status of this ImmigrationDocument
	 */
	@AutoEscape
	public String getEligibleStatus();

	/**
	 * Sets the eligible status of this ImmigrationDocument.
	 *
	 * @param eligibleStatus the eligible status of this ImmigrationDocument
	 */
	public void setEligibleStatus(String eligibleStatus);

	/**
	 * Returns the issued by of this ImmigrationDocument.
	 *
	 * @return the issued by of this ImmigrationDocument
	 */
	public long getIssuedBy();

	/**
	 * Sets the issued by of this ImmigrationDocument.
	 *
	 * @param issuedBy the issued by of this ImmigrationDocument
	 */
	public void setIssuedBy(long issuedBy);

	/**
	 * Returns the eligible review date of this ImmigrationDocument.
	 *
	 * @return the eligible review date of this ImmigrationDocument
	 */
	public Date getEligibleReviewDate();

	/**
	 * Sets the eligible review date of this ImmigrationDocument.
	 *
	 * @param eligibleReviewDate the eligible review date of this ImmigrationDocument
	 */
	public void setEligibleReviewDate(Date eligibleReviewDate);

	/**
	 * Returns the comments of this ImmigrationDocument.
	 *
	 * @return the comments of this ImmigrationDocument
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this ImmigrationDocument.
	 *
	 * @param comments the comments of this ImmigrationDocument
	 */
	public void setComments(String comments);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EmpImmigrationDocument empImmigrationDocument);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpImmigrationDocument> toCacheModel();

	@Override
	public EmpImmigrationDocument toEscapedModel();

	@Override
	public EmpImmigrationDocument toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}