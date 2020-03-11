package com.coal.cn.service.impl;

import com.coal.cn.bean.Role;
import com.coal.cn.mapper.RoleMapper;
import com.coal.cn.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author wencheng
 * @since 2020-03-11
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
