package com.xunmkj.service.mapper;

import com.xunmkj.base.BaseMapper;
import com.xunmkj.service.dto.LocalStorageDto;
import com.xunmkj.domain.LocalStorage;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-09-05
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocalStorageMapper extends BaseMapper<LocalStorageDto, LocalStorage> {

}