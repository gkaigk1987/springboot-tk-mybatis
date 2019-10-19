package com.gk.tkmybatis.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/10/19
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
