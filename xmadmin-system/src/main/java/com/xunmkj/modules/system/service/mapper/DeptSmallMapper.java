package com.xunmkj.modules.system.service.mapper;

import com.xunmkj.base.BaseMapper;
import com.xunmkj.modules.system.domain.Dept;
import com.xunmkj.modules.system.service.dto.DeptSmallDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends BaseMapper<DeptSmallDto, Dept> {

}