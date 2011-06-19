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

package com.liferay.portlet.expando.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.model.ExpandoValueModel;
import com.liferay.portlet.expando.model.ExpandoValueSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the ExpandoValue service. Represents a row in the &quot;ExpandoValue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.expando.model.ExpandoValueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExpandoValueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExpandoValueImpl
 * @see com.liferay.portlet.expando.model.ExpandoValue
 * @see com.liferay.portlet.expando.model.ExpandoValueModel
 * @generated
 */
@JSON(strict = true)
public class ExpandoValueModelImpl extends BaseModelImpl<ExpandoValue>
	implements ExpandoValueModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a expando value model instance should use the {@link com.liferay.portlet.expando.model.ExpandoValue} interface instead.
	 */
	public static final String TABLE_NAME = "ExpandoValue";
	public static final Object[][] TABLE_COLUMNS = {
			{ "valueId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "tableId", Types.BIGINT },
			{ "columnId", Types.BIGINT },
			{ "rowId_", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "data_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table ExpandoValue (valueId LONG not null primary key,companyId LONG,tableId LONG,columnId LONG,rowId_ LONG,classNameId LONG,classPK LONG,data_ STRING null)";
	public static final String TABLE_SQL_DROP = "drop table ExpandoValue";
	public static final String ORDER_BY_JPQL = " ORDER BY expandoValue.tableId ASC, expandoValue.rowId ASC, expandoValue.columnId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ExpandoValue.tableId ASC, ExpandoValue.rowId_ ASC, ExpandoValue.columnId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.expando.model.ExpandoValue"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.expando.model.ExpandoValue"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ExpandoValue toModel(ExpandoValueSoap soapModel) {
		ExpandoValue model = new ExpandoValueImpl();

		model.setValueId(soapModel.getValueId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setTableId(soapModel.getTableId());
		model.setColumnId(soapModel.getColumnId());
		model.setRowId(soapModel.getRowId());
		model.setClassNameId(soapModel.getClassNameId());
		model.setClassPK(soapModel.getClassPK());
		model.setData(soapModel.getData());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ExpandoValue> toModels(ExpandoValueSoap[] soapModels) {
		List<ExpandoValue> models = new ArrayList<ExpandoValue>(soapModels.length);

		for (ExpandoValueSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return ExpandoValue.class;
	}

	public String getModelClassName() {
		return ExpandoValue.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.expando.model.ExpandoValue"));

	public ExpandoValueModelImpl() {
	}

	public long getPrimaryKey() {
		return _valueId;
	}

	public void setPrimaryKey(long primaryKey) {
		setValueId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_valueId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@JSON
	public long getValueId() {
		return _valueId;
	}

	public void setValueId(long valueId) {
		_valueId = valueId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public long getTableId() {
		return _tableId;
	}

	public void setTableId(long tableId) {
		if (!_setOriginalTableId) {
			_setOriginalTableId = true;

			_originalTableId = _tableId;
		}

		_tableId = tableId;
	}

	public long getOriginalTableId() {
		return _originalTableId;
	}

	@JSON
	public long getColumnId() {
		return _columnId;
	}

	public void setColumnId(long columnId) {
		if (!_setOriginalColumnId) {
			_setOriginalColumnId = true;

			_originalColumnId = _columnId;
		}

		_columnId = columnId;
	}

	public long getOriginalColumnId() {
		return _originalColumnId;
	}

	@JSON
	public long getRowId() {
		return _rowId;
	}

	public void setRowId(long rowId) {
		if (!_setOriginalRowId) {
			_setOriginalRowId = true;

			_originalRowId = _rowId;
		}

		_rowId = rowId;
	}

	public long getOriginalRowId() {
		return _originalRowId;
	}

	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	@JSON
	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	@JSON
	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		if (!_setOriginalClassPK) {
			_setOriginalClassPK = true;

			_originalClassPK = _classPK;
		}

		_classPK = classPK;
	}

	public long getOriginalClassPK() {
		return _originalClassPK;
	}

	@JSON
	public String getData() {
		if (_data == null) {
			return StringPool.BLANK;
		}
		else {
			return _data;
		}
	}

	public void setData(String data) {
		_data = data;
	}

	@Override
	public ExpandoValue toEscapedModel() {
		if (isEscapedModel()) {
			return (ExpandoValue)this;
		}
		else {
			return (ExpandoValue)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	@Override
	public Object clone() {
		ExpandoValueImpl expandoValueImpl = new ExpandoValueImpl();

		expandoValueImpl.setValueId(getValueId());
		expandoValueImpl.setCompanyId(getCompanyId());
		expandoValueImpl.setTableId(getTableId());
		expandoValueImpl.setColumnId(getColumnId());
		expandoValueImpl.setRowId(getRowId());
		expandoValueImpl.setClassNameId(getClassNameId());
		expandoValueImpl.setClassPK(getClassPK());
		expandoValueImpl.setData(getData());

		expandoValueImpl.resetOriginalValues();

		return expandoValueImpl;
	}

	public int compareTo(ExpandoValue expandoValue) {
		int value = 0;

		if (getTableId() < expandoValue.getTableId()) {
			value = -1;
		}
		else if (getTableId() > expandoValue.getTableId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getRowId() < expandoValue.getRowId()) {
			value = -1;
		}
		else if (getRowId() > expandoValue.getRowId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getColumnId() < expandoValue.getColumnId()) {
			value = -1;
		}
		else if (getColumnId() > expandoValue.getColumnId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ExpandoValue expandoValue = null;

		try {
			expandoValue = (ExpandoValue)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = expandoValue.getPrimaryKey();

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
		ExpandoValueModelImpl expandoValueModelImpl = this;

		expandoValueModelImpl._originalTableId = expandoValueModelImpl._tableId;

		expandoValueModelImpl._setOriginalTableId = false;

		expandoValueModelImpl._originalColumnId = expandoValueModelImpl._columnId;

		expandoValueModelImpl._setOriginalColumnId = false;

		expandoValueModelImpl._originalRowId = expandoValueModelImpl._rowId;

		expandoValueModelImpl._setOriginalRowId = false;

		expandoValueModelImpl._originalClassPK = expandoValueModelImpl._classPK;

		expandoValueModelImpl._setOriginalClassPK = false;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{valueId=");
		sb.append(getValueId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", tableId=");
		sb.append(getTableId());
		sb.append(", columnId=");
		sb.append(getColumnId());
		sb.append(", rowId=");
		sb.append(getRowId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", data=");
		sb.append(getData());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.expando.model.ExpandoValue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>valueId</column-name><column-value><![CDATA[");
		sb.append(getValueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tableId</column-name><column-value><![CDATA[");
		sb.append(getTableId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>columnId</column-name><column-value><![CDATA[");
		sb.append(getColumnId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rowId</column-name><column-value><![CDATA[");
		sb.append(getRowId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data</column-name><column-value><![CDATA[");
		sb.append(getData());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ExpandoValue.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ExpandoValue.class
		};
	private long _valueId;
	private long _companyId;
	private long _tableId;
	private long _originalTableId;
	private boolean _setOriginalTableId;
	private long _columnId;
	private long _originalColumnId;
	private boolean _setOriginalColumnId;
	private long _rowId;
	private long _originalRowId;
	private boolean _setOriginalRowId;
	private long _classNameId;
	private long _classPK;
	private long _originalClassPK;
	private boolean _setOriginalClassPK;
	private String _data;
}