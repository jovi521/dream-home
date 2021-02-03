package com.dream.home.controller.tenant;

import com.dream.home.common.result.CommonResult;
import com.dream.home.entity.user.tenant.Tenant;
import com.dream.home.service.impl.tenant.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 租户-controller
 *
 * @author jovi
 */
@RestController
@RequestMapping("/tenant")
public class TenantController {

    private final TenantServiceImpl tenantService;

    @Autowired
    public TenantController(TenantServiceImpl tenantService) {
        this.tenantService = tenantService;
    }

    @GetMapping("/getById/{id}")
    public CommonResult<?> getById(@PathVariable("id") Integer id) {
        Tenant tenant = tenantService.getById(id);
        return CommonResult.success(tenant);
    }

    @PostMapping("/save")
    public CommonResult<?> save(@RequestBody Tenant tenant) {
        boolean flag = tenantService.save(tenant);
        return CommonResult.success(flag);
    }

    @PostMapping("/updateById")
    public CommonResult<?> updateById(@RequestBody Tenant tenant) {
        boolean flag = tenantService.updateById(tenant);
        return CommonResult.success(flag);
    }
}
