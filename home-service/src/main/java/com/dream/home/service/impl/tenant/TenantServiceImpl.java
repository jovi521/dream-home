package com.dream.home.service.impl.tenant;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.home.entity.user.tenant.Tenant;
import com.dream.home.mapper.tenant.ITenantMapper;
import com.dream.home.service.tenant.ITenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * 租户-serviceImpl
 *
 * @author jovi
 */
@Service
public class TenantServiceImpl implements ITenantService {

    private final ITenantMapper tenantMapper;

    @Autowired
    public TenantServiceImpl(ITenantMapper tenantMapper) {
        this.tenantMapper = tenantMapper;
    }

    @Override
    public boolean saveBatch(Collection<Tenant> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Tenant> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Tenant> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Tenant entity) {
        return false;
    }

    @Override
    public Tenant getOne(Wrapper<Tenant> queryWrapper, boolean throwEx) {
        return tenantMapper.selectOne(queryWrapper);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Tenant> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Tenant> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Tenant> getBaseMapper() {
        return tenantMapper;
    }

    @Override
    public Class<Tenant> getEntityClass() {
        return null;
    }
}
