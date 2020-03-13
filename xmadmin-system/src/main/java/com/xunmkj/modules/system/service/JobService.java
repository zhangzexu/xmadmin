package com.xunmkj.modules.system.service;

import com.xunmkj.modules.system.domain.Job;
import com.xunmkj.modules.system.service.dto.JobDto;
import com.xunmkj.modules.system.service.dto.JobQueryCriteria;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
* @author Zheng Jie
* @date 2019-03-29
*/
public interface JobService {

    /**
     * 根据ID查询
     * @param id /
     * @return /
     */
    JobDto findById(Long id);

    /**
     * 创建
     * @param resources /
     * @return /
     */
    JobDto create(Job resources);

    /**
     * 编辑
     * @param resources /
     */
    void update(Job resources);

    /**
     * 删除
     * @param id /
     */
    void delete(Long id);

    /**
     * 分页查询
     * @param criteria 条件
     * @param pageable 分页参数
     * @return /
     */
    Map<String,Object> queryAll(JobQueryCriteria criteria, Pageable pageable);

    /**
     * 查询全部数据
     * @param criteria /
     * @return /
     */
    List<JobDto> queryAll(JobQueryCriteria criteria);

    /**
     * 导出数据
     * @param queryAll 待导出的数据
     * @param response /
     * @throws IOException /
     */
    void download(List<JobDto> queryAll, HttpServletResponse response) throws IOException;
}