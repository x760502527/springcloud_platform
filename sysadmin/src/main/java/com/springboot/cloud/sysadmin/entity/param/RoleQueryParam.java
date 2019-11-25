package com.springboot.cloud.sysadmin.entity.param;

import com.springboot.cloud.common.web.entity.param.BaseParam;
import com.springboot.cloud.sysadmin.entity.po.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleQueryParam extends BaseParam<Role> {
    private String code;
    private String name;
}
