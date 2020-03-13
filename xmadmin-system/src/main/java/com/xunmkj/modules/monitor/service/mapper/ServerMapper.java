package com.xunmkj.modules.monitor.service.mapper;

import com.xunmkj.base.BaseMapper;
import com.xunmkj.modules.monitor.domain.Server;
import com.xunmkj.modules.monitor.service.dto.ServerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zhang houying
* @date 2019-11-03
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServerMapper extends BaseMapper<ServerDTO, Server> {

}
