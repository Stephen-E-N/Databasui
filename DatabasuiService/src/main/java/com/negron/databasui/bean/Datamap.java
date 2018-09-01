package com.negron.databasui.bean;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Datamap")
public class Datamap {
	
	@Id
	private String _id;
	private String dataCategoryId;
	private String data;
	private Integer dataSize;
	private Timestamp timeAdded;
	private Timestamp timeModified;
	
	public Datamap() {
		super();
	}

	public Datamap(String id, String dataCategoryId, String data, Integer dataSize, Timestamp timeAdded,
			Timestamp timeModified) {
		super();
		this._id = id;
		this.dataCategoryId = dataCategoryId;
		this.data = data;
		this.dataSize = dataSize;
		this.timeAdded = timeAdded;
		this.timeModified = timeModified;
	}

	public Datamap(String dataCategoryId, String data, Integer dataSize, Timestamp timeAdded, Timestamp timeModified) {
		super();
		this.dataCategoryId = dataCategoryId;
		this.data = data;
		this.dataSize = dataSize;
		this.timeAdded = timeAdded;
		this.timeModified = timeModified;
	}

	public Datamap(String dataCategoryId, String data, Integer dataSize) {
		super();
		this.dataCategoryId = dataCategoryId;
		this.data = data;
		this.dataSize = dataSize;
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getDataCategoryId() {
		return dataCategoryId;
	}

	public void setDataCategoryId(String dataCategoryId) {
		this.dataCategoryId = dataCategoryId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getDataSize() {
		return dataSize;
	}

	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	public Timestamp getTimeAdded() {
		return timeAdded;
	}

	public void setTimeAdded(Timestamp timeAdded) {
		this.timeAdded = timeAdded;
	}

	public Timestamp getTimeModified() {
		return timeModified;
	}

	public void setTimeModified(Timestamp timeModified) {
		this.timeModified = timeModified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((dataCategoryId == null) ? 0 : dataCategoryId.hashCode());
		result = prime * result + ((dataSize == null) ? 0 : dataSize.hashCode());
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result + ((timeAdded == null) ? 0 : timeAdded.hashCode());
		result = prime * result + ((timeModified == null) ? 0 : timeModified.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datamap other = (Datamap) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (dataCategoryId == null) {
			if (other.dataCategoryId != null)
				return false;
		} else if (!dataCategoryId.equals(other.dataCategoryId))
			return false;
		if (dataSize == null) {
			if (other.dataSize != null)
				return false;
		} else if (!dataSize.equals(other.dataSize))
			return false;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (timeAdded == null) {
			if (other.timeAdded != null)
				return false;
		} else if (!timeAdded.equals(other.timeAdded))
			return false;
		if (timeModified == null) {
			if (other.timeModified != null)
				return false;
		} else if (!timeModified.equals(other.timeModified))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Datamap [id=" + _id + ", dataCategoryId=" + dataCategoryId + ", data=" + data + ", dataSize=" + dataSize
				+ ", timeAdded=" + timeAdded + ", timeModified=" + timeModified + "]";
	}
	
}
