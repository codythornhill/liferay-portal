/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.announcements.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.announcements.model.AnnouncementsDelivery;
import com.liferay.portlet.announcements.model.AnnouncementsDeliveryModel;
import com.liferay.portlet.announcements.model.AnnouncementsDeliverySoap;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the AnnouncementsDelivery service. Represents a row in the &quot;AnnouncementsDelivery&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.announcements.model.AnnouncementsDeliveryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AnnouncementsDeliveryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnouncementsDeliveryImpl
 * @see com.liferay.portlet.announcements.model.AnnouncementsDelivery
 * @see com.liferay.portlet.announcements.model.AnnouncementsDeliveryModel
 * @generated
 */
@JSON(strict = true)
public class AnnouncementsDeliveryModelImpl extends BaseModelImpl<AnnouncementsDelivery>
	implements AnnouncementsDeliveryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a announcements delivery model instance should use the {@link com.liferay.portlet.announcements.model.AnnouncementsDelivery} interface instead.
	 */
	public static final String TABLE_NAME = "AnnouncementsDelivery";
	public static final Object[][] TABLE_COLUMNS = {
			{ "deliveryId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "type_", Types.VARCHAR },
			{ "email", Types.BOOLEAN },
			{ "sms", Types.BOOLEAN },
			{ "website", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table AnnouncementsDelivery (deliveryId LONG not null primary key,companyId LONG,userId LONG,type_ VARCHAR(75) null,email BOOLEAN,sms BOOLEAN,website BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table AnnouncementsDelivery";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.announcements.model.AnnouncementsDelivery"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.announcements.model.AnnouncementsDelivery"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AnnouncementsDelivery toModel(
		AnnouncementsDeliverySoap soapModel) {
		AnnouncementsDelivery model = new AnnouncementsDeliveryImpl();

		model.setDeliveryId(soapModel.getDeliveryId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setType(soapModel.getType());
		model.setEmail(soapModel.getEmail());
		model.setSms(soapModel.getSms());
		model.setWebsite(soapModel.getWebsite());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AnnouncementsDelivery> toModels(
		AnnouncementsDeliverySoap[] soapModels) {
		List<AnnouncementsDelivery> models = new ArrayList<AnnouncementsDelivery>(soapModels.length);

		for (AnnouncementsDeliverySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return AnnouncementsDelivery.class;
	}

	public String getModelClassName() {
		return AnnouncementsDelivery.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.announcements.model.AnnouncementsDelivery"));

	public AnnouncementsDeliveryModelImpl() {
	}

	public long getPrimaryKey() {
		return _deliveryId;
	}

	public void setPrimaryKey(long primaryKey) {
		setDeliveryId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_deliveryId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@JSON
	public long getDeliveryId() {
		return _deliveryId;
	}

	public void setDeliveryId(long deliveryId) {
		_deliveryId = deliveryId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	public void setType(String type) {
		if (_originalType == null) {
			_originalType = _type;
		}

		_type = type;
	}

	public String getOriginalType() {
		return GetterUtil.getString(_originalType);
	}

	@JSON
	public boolean getEmail() {
		return _email;
	}

	public boolean isEmail() {
		return _email;
	}

	public void setEmail(boolean email) {
		_email = email;
	}

	@JSON
	public boolean getSms() {
		return _sms;
	}

	public boolean isSms() {
		return _sms;
	}

	public void setSms(boolean sms) {
		_sms = sms;
	}

	@JSON
	public boolean getWebsite() {
		return _website;
	}

	public boolean isWebsite() {
		return _website;
	}

	public void setWebsite(boolean website) {
		_website = website;
	}

	@Override
	public AnnouncementsDelivery toEscapedModel() {
		if (isEscapedModel()) {
			return (AnnouncementsDelivery)this;
		}
		else {
			return (AnnouncementsDelivery)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					AnnouncementsDelivery.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		AnnouncementsDeliveryImpl announcementsDeliveryImpl = new AnnouncementsDeliveryImpl();

		announcementsDeliveryImpl.setDeliveryId(getDeliveryId());
		announcementsDeliveryImpl.setCompanyId(getCompanyId());
		announcementsDeliveryImpl.setUserId(getUserId());
		announcementsDeliveryImpl.setType(getType());
		announcementsDeliveryImpl.setEmail(getEmail());
		announcementsDeliveryImpl.setSms(getSms());
		announcementsDeliveryImpl.setWebsite(getWebsite());

		announcementsDeliveryImpl.resetOriginalValues();

		return announcementsDeliveryImpl;
	}

	public int compareTo(AnnouncementsDelivery announcementsDelivery) {
		long primaryKey = announcementsDelivery.getPrimaryKey();

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
		if (obj == null) {
			return false;
		}

		AnnouncementsDelivery announcementsDelivery = null;

		try {
			announcementsDelivery = (AnnouncementsDelivery)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = announcementsDelivery.getPrimaryKey();

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
		AnnouncementsDeliveryModelImpl announcementsDeliveryModelImpl = this;

		announcementsDeliveryModelImpl._originalUserId = announcementsDeliveryModelImpl._userId;

		announcementsDeliveryModelImpl._setOriginalUserId = false;

		announcementsDeliveryModelImpl._originalType = announcementsDeliveryModelImpl._type;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{deliveryId=");
		sb.append(getDeliveryId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", sms=");
		sb.append(getSms());
		sb.append(", website=");
		sb.append(getWebsite());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.portlet.announcements.model.AnnouncementsDelivery");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>deliveryId</column-name><column-value><![CDATA[");
		sb.append(getDeliveryId());
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
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sms</column-name><column-value><![CDATA[");
		sb.append(getSms());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>website</column-name><column-value><![CDATA[");
		sb.append(getWebsite());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AnnouncementsDelivery.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			AnnouncementsDelivery.class
		};
	private long _deliveryId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _type;
	private String _originalType;
	private boolean _email;
	private boolean _sms;
	private boolean _website;
	private transient ExpandoBridge _expandoBridge;
}