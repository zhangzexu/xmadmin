package com.xunmkj.modules.system.service.dto;

import lombok.Data;
import com.xunmkj.annotation.Query;

/**
 * @author Zheng Jie
 * 公共查询类
 */
@Data
public class DictQueryCriteria {

    @Query(blurry = "name,remark")
    private String blurry;
}
