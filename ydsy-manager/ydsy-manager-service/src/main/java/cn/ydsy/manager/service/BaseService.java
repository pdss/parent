package cn.ydsy.manager.service;


import cn.ydsy.manager.model.dbo.BaseDBO;
import cn.ydsy.manager.model.dto.BaseDTO;
import tk.mybatis.mapper.entity.Example;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface BaseService<T extends BaseDTO, M extends tk.mybatis.mapper.common.Mapper<V>, V extends BaseDBO> {

    boolean add(T var1);


    boolean addBatch(Collection<T> entityList);

    boolean addOrUpdateBatch(Collection<T> entityList);

    boolean remove(Example example);

    boolean removeById(long id);

    boolean remove(Map<String, Object> parameters);

    boolean removeByIds(Collection<Long> var1);

    boolean deleteById(long id);

    boolean delete(Map<String, Object> parameters);

    boolean deleteByIds(Collection<Long> entityList);

    boolean delete(Example example);

    boolean updateById(T var1);

    boolean update(T var1, Map<String, Object> parameters);

    boolean updateBatchById(Collection<T> entityList);

    boolean addOrUpdate(T var1);

    T getById(long var1);

    List<T> listByIds(Collection<Long> var1);

    T getOne(Map<String, Object> parameters);

    int count(Map<String, Object> parameters);

    int count(Example example);

    List<T> list(Map<String, Object> parameters, String[] orderby, Integer isAsc);

    cn.ydsy.common.model.Pagination<T> page(cn.ydsy.common.model.PageParameter var1, Map<String, Object> parameters, String[] orderby, Integer isAsc);

    List<T> list(Example example);

    T getOne(Example example);

    cn.ydsy.common.model.Pagination<T> page(cn.ydsy.common.model.PageParameter page, Example example);

    cn.ydsy.common.model.Pagination<T> query(cn.ydsy.common.model.PageParameter page, Map<String, Object> filters, String[] sorts, Integer[] isAsc) throws Exception;

    List<T> query(Map<String, Object> filters, String[] sorts, Integer[] isAsc);


}
