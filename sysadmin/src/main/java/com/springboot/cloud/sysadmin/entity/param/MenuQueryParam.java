package com.springboot.cloud.sysadmin.entity.param;

import com.springboot.cloud.common.web.entity.param.BaseParam;
import com.springboot.cloud.sysadmin.entity.po.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuQueryParam extends BaseParam<Menu> {
    private String name;
}
