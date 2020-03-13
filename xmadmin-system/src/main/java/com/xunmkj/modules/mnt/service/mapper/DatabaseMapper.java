package com.xunmkj.modules.mnt.service.mapper;

import com.xunmkj.base.BaseMapper;
import com.xunmkj.modules.mnt.service.dto.DatabaseDto;
import com.xunmkj.modules.mnt.domain.Database;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DatabaseMapper extends BaseMapper<DatabaseDto, Database> {

}
