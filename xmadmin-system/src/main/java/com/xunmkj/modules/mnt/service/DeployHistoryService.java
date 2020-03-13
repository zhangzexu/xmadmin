package com.xunmkj.modules.mnt.service;

import com.xunmkj.modules.mnt.service.dto.DeployHistoryDto;
import com.xunmkj.modules.mnt.service.dto.DeployHistoryQueryCriteria;
import com.xunmkj.modules.mnt.domain.DeployHistory;
import org.springframework.data.domain.Pageable;

/**
 * @author zhanghouying
 */
public interface DeployHistoryService {

    /**
     * 分页查询
     * @param criteria 条件
     * @param pageable 分页参数
     * @return /
     */
    Object queryAll(DeployHistoryQueryCriteria criteria, Pageable pageable);

    /**
     * 查询全部
     * @param criteria 条件
     * @return /
     */
    Object queryAll(DeployHistoryQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id /
     * @return /
     */
    DeployHistoryDto findById(String id);

    /**
     * 创建
     * @param resources /
     * @return /
     */
    DeployHistoryDto create(DeployHistory resources);

    /**
     * 删除
     * @param id /
     */
    void delete(String id);
}
