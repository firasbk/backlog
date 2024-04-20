package com.task.ddd.service;
import com.task.ddd.entity.*;
import com.task.ddd.repository.BacklogItemRepository;
import com.task.ddd.repository.TeamRepository;
import org.springframework.transaction.annotation.Transactional;

public class ProductBacklogItemService {
    @Transactional
    public void assignTeamMemberToTask(
            String aTenantId,
            String aBacklogItemId,
            String aTaskId,
            String aTeamMemberId) {
        BacklogItemRepository backlogItemRepository = new BacklogItemRepository();
        BacklogItem backlogItem =
                backlogItemRepository.backlogItemOfId(
                        new TenantId(aTenantId),
                        new BacklogItemId(aBacklogItemId));
        TeamRepository teamRepository = new TeamRepository();
        Team ofTeam =
                teamRepository.teamOfId(
                        backlogItem.tenantId(),
                        backlogItem.teamId());
        backlogItem.assignTeamMemberToTask(
                new TeamMemberId(aTeamMemberId),
                ofTeam,
                new TaskId(aTaskId));

    }
}