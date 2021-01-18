package com.his.hospital.service;

import com.his.hospital.domain.MedicalQueue;

import java.util.List;

/**
 * Description:
 *
 * @author tong-aj
 * <p>
 * Create: 2021-01-18 10:43
 */
public interface IHospitalService {

    /**
     * 根据姓名和队列类型获取队列集合
     * @param name 姓名
     * @param deptCode 科室代码
     * @param queueType 队列类型：候诊，就诊，已诊
     * @return 队列集合
     */
    List<MedicalQueue> getMedicalQueue(String name, String deptCode, String queueType);
}
