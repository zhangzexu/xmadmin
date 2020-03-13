package com.xunmkj.modules.mnt.service.impl;

import cn.hutool.core.util.IdUtil;
import com.xunmkj.modules.mnt.repository.DeployHistoryRepository;
import com.xunmkj.modules.mnt.domain.DeployHistory;
import com.xunmkj.modules.mnt.service.DeployHistoryService;
import com.xunmkj.modules.mnt.service.dto.DeployHistoryDto;
import com.xunmkj.modules.mnt.service.dto.DeployHistoryQueryCriteria;
import com.xunmkj.modules.mnt.service.mapper.DeployHistoryMapper;
import com.xunmkj.utils.PageUtil;
import com.xunmkj.utils.QueryHelp;
import com.xunmkj.utils.ValidationUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DeployHistoryServiceImpl implements DeployHistoryService {

    private final DeployHistoryRepository deployhistoryRepository;

    private final DeployHistoryMapper deployhistoryMapper;

    public DeployHistoryServiceImpl(DeployHistoryRepository deployhistoryRepository, DeployHistoryMapper deployhistoryMapper) {
        this.deployhistoryRepository = deployhistoryRepository;
        this.deployhistoryMapper = deployhistoryMapper;
    }

    @Override
    public Object queryAll(DeployHistoryQueryCriteria criteria, Pageable pageable){
        Page<DeployHistory> page = deployhistoryRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(deployhistoryMapper::toDto));
    }

    @Override
    public Object queryAll(DeployHistoryQueryCriteria criteria){
        return deployhistoryMapper.toDto(deployhistoryRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    public DeployHistoryDto findById(String id) {
        DeployHistory deployhistory = deployhistoryRepository.findById(id).orElseGet(DeployHistory::new);
        ValidationUtil.isNull(deployhistory.getId(),"DeployHistory","id",id);
        return deployhistoryMapper.toDto(deployhistory);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DeployHistoryDto create(DeployHistory resources) {
        resources.setId(IdUtil.simpleUUID());
        return deployhistoryMapper.toDto(deployhistoryRepository.save(resources));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) {
        deployhistoryRepository.deleteById(id);
    }
}
