/**
 * <pre>
 * Class Name  : CattleCureInfoRepository.java
 * Description : 
 * Modification Information
 *
 *    수정일　　　 　　  수정자　　　     수정내용
 *    ────────────   ─────────   ───────────────────────────────
 *    2016. 1. 11.          ask               최초생성
 * </pre>
 *
 * @author ahn
 * @since 2016. 1. 11.
 * @version 
 *
 * Copyright (C) 2016 by SKAN.COMPANY All right reserved.
 */
package com.skan.potal.web.potal.cattle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skan.potal.web.potal.cattle.model.HmCattleCureInfo;
import com.skan.potal.web.potal.cattle.model.HmCattleCureInfoId;

/**
 * @author ahn
 *
 */
@Repository
public interface CattleCureInfoRepository extends JpaRepository<HmCattleCureInfo, HmCattleCureInfoId> {

}
