package com.xunmkj.modules.mnt.service;

import com.xunmkj.modules.mnt.service.dto.ServerDeployDto;
import com.xunmkj.modules.mnt.service.dto.ServerDeployQueryCriteria;
import com.xunmkj.modules.mnt.domain.ServerDeploy;
import org.springframework.data.domain.Pageable;

/**
* @author zhanghouying
* @date 2019-08-24
*/
public interface ServerDeployService {

    /**
     * 分页查询
     * @param criteria 条件
     * @param pageable 分页参数
     * @return /
     */
    Object queryAll(ServerDeployQueryCriteria criteria, Pageable pageable);

    /**
     * 查询全部数据
     * @param criteria 条件
     * @return /
     */
    Object queryAll(ServerDeployQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id /
     * @return /
     */
    ServerDeployDto findById(Long id);

    /**
     * 创建
     * @param resources /
     * @return /
     */
	ServerDeployDto create(ServerDeploy resources);

    /**
     * 编辑
     * @param resources /
     */
    void update(ServerDeploy resources);

    /**
     * 删除
     * @param id /
     */
    void delete(Long id);

    /**
     * 根据IP查询
     * @param ip /
     * @return /
     */
    ServerDeployDto findByIp(String ip);

	/**
	 * 测试登录服务器
	 * @param resources
	 * @return
	 */
	Boolean testConnect(ServerDeploy resources);
}
