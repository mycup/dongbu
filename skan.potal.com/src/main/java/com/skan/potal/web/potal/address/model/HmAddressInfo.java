package com.skan.potal.web.potal.address.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 주소 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table
public class HmAddressInfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 주소 composite - id. */
	@EmbeddedId private HmAddressInfoId hmAddressInfoId;

	/** 주소록 관리. */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hmMgNum",insertable=false, updatable=false)
	private HmMngAddress hmMngAddress;

	/** 구분. */
	private String hmType;

	/** 주소정보. */
	private String hmAddInfo;

	/**
	 * 생성자.
	 */
	public HmAddressInfo() {
	}

	/**
	 * 주소 composite - id을 설정합니다..
	 * 
	 * @param hmAddressInfoId
	 *            주소 composite - id
	 */
	public void setHmAddressInfoId(HmAddressInfoId hmAddressInfoId) {
		this.hmAddressInfoId = hmAddressInfoId;
	}

	/**
	 * 주소 composite - id을 가져옵니다..
	 * 
	 * @return 주소 composite - id
	 */
	public HmAddressInfoId getHmAddressInfoId() {
		return this.hmAddressInfoId;
	}

	/**
	 * 주소록 관리을 설정합니다..
	 * 
	 * @param hmMngAddress
	 *            주소록 관리
	 */
	public void setHmMngAddress(HmMngAddress hmMngAddress) {
		this.hmMngAddress = hmMngAddress;
	}

	/**
	 * 주소록 관리을 가져옵니다..
	 * 
	 * @return 주소록 관리
	 */
	public HmMngAddress getHmMngAddress() {
		return this.hmMngAddress;
	}

	/**
	 * 구분을 설정합니다..
	 * 
	 * @param hmType
	 *            구분
	 */
	public void setHmType(String hmType) {
		this.hmType = hmType;
	}

	/**
	 * 구분을 가져옵니다..
	 * 
	 * @return 구분
	 */
	public String getHmType() {
		return this.hmType;
	}

	/**
	 * 주소정보을 설정합니다..
	 * 
	 * @param hmAddInfo
	 *            주소정보
	 */
	public void setHmAddInfo(String hmAddInfo) {
		this.hmAddInfo = hmAddInfo;
	}

	/**
	 * 주소정보을 가져옵니다..
	 * 
	 * @return 주소정보
	 */
	public String getHmAddInfo() {
		return this.hmAddInfo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmAddressInfoId == null) ? 0 : hmAddressInfoId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		HmAddressInfo other = (HmAddressInfo) obj;
		if (hmAddressInfoId == null) {
			if (other.hmAddressInfoId != null) {
				return false;
			}
		} else if (!hmAddressInfoId.equals(other.hmAddressInfoId)) {
			return false;
		}
		return true;
	}

}
