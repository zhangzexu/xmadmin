package com.xunmkj.modules.mnt.service;

import com.xunmkj.modules.mnt.service.dto.AppDto;
import com.xunmkj.modules.mnt.service.dto.AppQueryCriteria;
import com.xunmkj.modules.mnt.domain.App;
import org.springframework.data.domain.Pageable;

/**
* @author zhanghouying
* @date 2019-08-24
*/
public interface AppService {

    /**
     * 分页查询
     * @param criteria 条件
     * @param pageable 分页参数
     * @return /
     */
    Object queryAll(AppQueryCriteria criteria, Pageable pageable);

    /**
     * 查询全部数据
     * @param criteria 条件
     * @return /
     */
    Object queryAll(AppQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id /
     * @return /
     */
    AppDto findById(Long id);

    /**
     * 创建
     * @param resources /
     * @return /
     */
    AppDto create(App resources);

    /**
     * 编辑
     * @param resources /
     */
    void update(App resources);

    /**
     * 删除
     * @param id /
     */
    void delete(Long id);
}
