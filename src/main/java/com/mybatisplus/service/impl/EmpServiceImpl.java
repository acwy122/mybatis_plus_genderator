package com.mybatisplus.service.impl;

import com.mybatisplus.bean.Emp;
import com.mybatisplus.dao.EmpMapper;
import com.mybatisplus.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author biao
 * @since 2022-05-22
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
