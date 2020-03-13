package com.xunmkj.modules.mnt.service.dto;

import com.xunmkj.annotation.Query;
import lombok.Data;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Data
public class DatabaseQueryCriteria{

	/**
	 * 模糊
	 */
    @Query(type = Query.Type.INNER_LIKE)
    private String name;

	/**
	 * 精确
	 */
    @Query
    private String jdbcUrl;
}
