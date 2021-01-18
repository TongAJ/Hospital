package com.his.hospital.controller;

import com.his.hospital.domain.MedicalQueue;
import com.his.hospital.service.IHospitalService;
import com.his.hospital.util.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 门诊医生 主流程DemoController
 *
 * @author tong-aj
 * <p>
 * Create: 2021-01-18 10:39
 */

@RestController
public class HospitalController {

    private final IHospitalService hospitalService;

    public HospitalController(IHospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    /**
     * Description: 就诊队列
     * Param: []
     * return: java.lang.String
     * Author: tong-aj
     * Date: 2021/1/18
     */
    @GetMapping("getMedicalQueue")
    public BaseResult<MedicalQueue> getMedicalQueue(String name, String deptCode, String queueType) {
        return BaseResult.success(hospitalService.getMedicalQueue(name, deptCode, queueType));
    }
}
