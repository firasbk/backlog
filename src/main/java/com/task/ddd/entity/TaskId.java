package com.task.ddd.entity;

public class TaskId extends ConcurrencySafeEntity{
    String id;
    public TaskId(String taskId) {
        this.id = taskId;
    }
}
