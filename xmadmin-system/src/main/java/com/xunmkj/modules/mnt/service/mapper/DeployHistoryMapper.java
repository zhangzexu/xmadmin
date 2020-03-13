package com.xunmkj.modules.mnt.service.mapper;

import com.xunmkj.base.BaseMapper;
import com.xunmkj.modules.mnt.service.dto.DeployHistoryDto;
import com.xunmkj.modules.mnt.domain.DeployHistory;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeployHistoryMapper extends BaseMapper<DeployHistoryDto, DeployHistory> {

}
