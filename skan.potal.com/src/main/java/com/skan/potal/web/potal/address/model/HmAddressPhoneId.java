package com.skan.potal.web.potal.address.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 주소록 전화번호부 composite - id 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Embeddable
public class HmAddressPhoneId implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 주소록 관리. */
	@ManyToOne
	@JoinColumn(name="hmMgNum")
	private HmMngAddress hmMngAddress;

	/** 순번. */
	private Long hmPhoNo;

	/**
	 * 생성자.
	 */
	public HmAddressPhoneId() {
	}

	/**
	 * @param hmMngAddress2
	 */
	public HmAddressPhoneId(HmMngAddress hmMngAddress) {
		this.hmMngAddress = hmMngAddress;
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
	 * 순번을 설정합니다..
	 * 
	 * @param hmPhoNo
	 *            순번
	 */
	public void setHmPhoNo(Long hmPhoNo) {
		this.hmPhoNo = hmPhoNo;
	}

	/**
	 * 순번을 가져옵니다..
	 * 
	 * @return 순번
	 */
	public Long getHmPhoNo() {
		return this.hmPhoNo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmMngAddress == null) ? 0 : hmMngAddress.hashCode());
		result = prime * result + ((hmPhoNo == null) ? 0 : hmPhoNo.hashCode());
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
		HmAddressPhoneId other = (HmAddressPhoneId) obj;
		if (hmMngAddress == null) {
			if (other.hmMngAddress != null) {
				return false;
			}
		} else if (!hmMngAddress.equals(other.hmMngAddress)) {
			return false;
		}
		if (hmPhoNo == null) {
			if (other.hmPhoNo != null) {
				return false;
			}
		} else if (!hmPhoNo.equals(other.hmPhoNo)) {
			return false;
		}
		return true;
	}

}
