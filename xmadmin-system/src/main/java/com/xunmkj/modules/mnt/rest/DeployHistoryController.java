package com.xunmkj.modules.mnt.rest;

import com.xunmkj.aop.log.Log;
import com.xunmkj.modules.mnt.service.DeployHistoryService;
import com.xunmkj.modules.mnt.service.dto.DeployHistoryQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Api(tags = "部署历史管理")
@RestController
@RequestMapping("/api/deployHistory")
public class DeployHistoryController {

    private final DeployHistoryService deployhistoryService;

    public DeployHistoryController(DeployHistoryService deployhistoryService) {
        this.deployhistoryService = deployhistoryService;
    }

    @Log("查询部署历史")
    @ApiOperation(value = "查询部署历史")
    @GetMapping
	@PreAuthorize("@el.check('deployHistory:list')")
    public ResponseEntity getDeployHistorys(DeployHistoryQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(deployhistoryService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @Log("删除DeployHistory")
    @ApiOperation(value = "删除部署历史")
	@DeleteMapping(value = "/{id}")
    @PreAuthorize("hasAnyRole('deployHistory:del')")
    public ResponseEntity delete(@PathVariable String id){
        deployhistoryService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
