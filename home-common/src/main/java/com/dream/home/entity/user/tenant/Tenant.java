package com.dream.home.entity.user.tenant;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 租户实体类
 *
 * @author jovi
 */
@TableName
@Data
public class Tenant implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "tenant_name")
    private String tenantName;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * deleteFlag 比较特殊，再修改的时候不用指定默认值，由 MP 本身自带的 GlobalConfig.DbConfig setLogicDeleteField 自动根据默认值修改即可
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleteFlag;

    /**
     * version 比较特殊，再修改的时候不用指定默认值，由 MP 本身自带的 OptimisticLockerInnerInterceptor 自动加 1
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
