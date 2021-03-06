package com.springboot.cloud.sysadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.cloud.sysadmin.dao.UserRoleMapper;
import com.springboot.cloud.sysadmin.entity.po.UserRole;
import com.springboot.cloud.sysadmin.service.IUserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserRoleService extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    @Override
    public boolean saveBatch(String userId, Set<String> roleIds) {
        if (CollectionUtils.isEmpty(roleIds))
            return false;
        Set<UserRole> userRoles = roleIds.stream().map(roleId -> new UserRole(userId, roleId)).collect(Collectors.toSet());
        return saveBatch(userRoles);
    }

    @Override
    public boolean saveOrUpdateBatch(String userId, Set<String> roleIds) {
        if (CollectionUtils.isEmpty(roleIds))
            return false;
        Set<UserRole> userRoles = roleIds.stream().map(roleId -> new UserRole(userId, roleId)).collect(Collectors.toSet());
        return saveOrUpdateBatch(userRoles);
    }

    @Override
    public boolean removeByUserId(String userId) {
        QueryWrapper<UserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(UserRole::getUserId, userId);
        return remove(queryWrapper);
    }

    @Override
    public Set<String> queryByUserId(String userId) {
        QueryWrapper<UserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        List<UserRole> userRoleList = list(queryWrapper);
        return userRoleList.stream().map(UserRole::getRoleId).collect(Collectors.toSet());
    }
}
