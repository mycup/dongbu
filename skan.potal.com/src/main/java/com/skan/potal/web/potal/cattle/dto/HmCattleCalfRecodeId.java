package com.skan.potal.web.potal.cattle.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 송아지 기록 composite - id 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Embeddable
public class HmCattleCalfRecodeId implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 한우(암소/수소) 개체관리기록부. */
	@ManyToOne
	@JoinColumn(name="entityDiscernNo",insertable=false, updatable=false)
	private HmCattleRegister hmCattleRegister;

	/** 회차. */
	private Long thNo;

	/**
	 * 생성자.
	 */
	public HmCattleCalfRecodeId() {
	}

	/**
	 * 한우(암소/수소) 개체관리기록부을 설정합니다..
	 * 
	 * @param hmCattleRegister
	 *            한우(암소/수소) 개체관리기록부
	 */
	public void setHmCattleRegister(HmCattleRegister hmCattleRegister) {
		this.hmCattleRegister = hmCattleRegister;
	}

	/**
	 * 한우(암소/수소) 개체관리기록부을 가져옵니다..
	 * 
	 * @return 한우(암소/수소) 개체관리기록부
	 */
	public HmCattleRegister getHmCattleRegister() {
		return this.hmCattleRegister;
	}

	/**
	 * 회차을 설정합니다..
	 * 
	 * @param thNo
	 *            회차
	 */
	public void setThNo(Long thNo) {
		this.thNo = thNo;
	}

	/**
	 * 회차을 가져옵니다..
	 * 
	 * @return 회차
	 */
	public Long getThNo() {
		return this.thNo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hmCattleRegister == null) ? 0 : hmCattleRegister.hashCode());
		result = prime * result + ((thNo == null) ? 0 : thNo.hashCode());
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
		HmCattleCalfRecodeId other = (HmCattleCalfRecodeId) obj;
		if (hmCattleRegister == null) {
			if (other.hmCattleRegister != null) {
				return false;
			}
		} else if (!hmCattleRegister.equals(other.hmCattleRegister)) {
			return false;
		}
		if (thNo == null) {
			if (other.thNo != null) {
				return false;
			}
		} else if (!thNo.equals(other.thNo)) {
			return false;
		}
		return true;
	}

}
