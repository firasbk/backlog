package com.task.ddd;

import com.task.ddd.entity.*;
import com.task.ddd.repository.BacklogItemRepository;
import com.task.ddd.repository.TeamRepository;
import com.task.ddd.service.ProductBacklogItemService;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ProductBacklogItemServiceTest {
    @Test
    public void testAssignTeamMemberToTask() {
        String tenantId = "12345";
        String backlogItemId = "67890";
        String taskId = "11111";
        String teamMemberId = "22222";
        ProductBacklogItemService productBacklogItemService = new
                ProductBacklogItemService();
        BacklogItemRepository backlogItemRepository = new BacklogItemRepository();
        TeamRepository teamRepository = new TeamRepository();
        TenantId tenantIdObj = new TenantId(tenantId);
        BacklogItemId backlogItemIdObj = new BacklogItemId(backlogItemId);
        TaskId taskIdObj = new TaskId(taskId);
        TeamMemberId teamMemberIdObj = new TeamMemberId(teamMemberId);
        BacklogItem backlogItem = mock(BacklogItem.class);

        Team team = mock(Team.class);
        when(backlogItemRepository.backlogItemOfId(tenantIdObj, backlogItemIdObj))
                .thenReturn(backlogItem);
        when(teamRepository.teamOfId(tenantIdObj, team.getTeamId()))
                .thenReturn(team);
        productBacklogItemService.assignTeamMemberToTask(
                tenantId, backlogItemId, taskId, teamMemberId);
        verify(backlogItem).assignTeamMemberToTask(
                teamMemberIdObj, team, taskIdObj);

    }
}