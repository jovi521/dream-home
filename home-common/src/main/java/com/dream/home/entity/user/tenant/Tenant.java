package com.dream.home.entity.user.tenant;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * 租户实体类
 *
 * @author jovi
 */
@TableName(value = "t_tenant")
@Data
public class Tenant {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "tenant_name")
    private String tenantName;

    @TableLogic(delval = "0", value = "1")
    private Integer deleteFlag;

    @Version
    private Integer version;
}
