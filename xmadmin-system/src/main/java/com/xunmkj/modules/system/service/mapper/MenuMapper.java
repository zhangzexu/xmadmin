package com.xunmkj.modules.system.service.mapper;

import com.xunmkj.base.BaseMapper;
import com.xunmkj.modules.system.domain.Menu;
import com.xunmkj.modules.system.service.dto.MenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends BaseMapper<MenuDto, Menu> {

}
