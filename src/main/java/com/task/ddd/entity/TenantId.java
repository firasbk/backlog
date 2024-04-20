package com.task.ddd.entity;

public class TenantId extends ConcurrencySafeEntity{
    String id;
    public TenantId(String tenantId) {
        this.id = tenantId;
    }
}