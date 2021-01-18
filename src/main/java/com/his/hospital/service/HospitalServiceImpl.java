package com.his.hospital.service;

import com.his.hospital.domain.MedicalQueue;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author tong-aj
 * <p>
 * Create: 2021-01-18 10:44
 */
@Service
public class HospitalServiceImpl implements IHospitalService {

    /**
     * @param name 姓名
     * @param deptCode 科室代码
     * @param queueType 队列类型：候诊，就诊，已诊
     * @return 队列集合
     */
    @Override
    public List<MedicalQueue> getMedicalQueue(String name, String deptCode, String queueType) {
        return null;
    }
}
