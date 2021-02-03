package com.dream.home.mapper.tenant;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.home.entity.user.tenant.Tenant;
import org.springframework.stereotype.Repository;

/**
 * 租户-dao
 *
 * @author jovi
 */
@Repository
public interface ITenantMapper extends BaseMapper<Tenant> {
}
