package com.xunmkj.modules.mnt.service.dto;

import com.xunmkj.annotation.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Data
public class DeployHistoryQueryCriteria{

	/**
	 * 精确
	 */
	@Query(blurry = "appName,ip,deployUser,deployId")
	private String blurry;

	@Query(type = Query.Type.BETWEEN)
	private List<Timestamp> deployDate;
}
