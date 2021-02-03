package com.dream.home.controller.tenant;

import com.dream.home.common.result.CommonResult;
import com.dream.home.entity.user.tenant.Tenant;
import com.dream.home.service.impl.tenant.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
