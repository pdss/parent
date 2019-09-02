package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbBannerMapper;
import cn.ydsy.manager.mapper.TbIndexcategoryMapper;
import cn.ydsy.manager.model.dbo.TbBanner;
import cn.ydsy.manager.model.dbo.TbIndexcategory;
import cn.ydsy.manager.model.dto.BannerDTO;
import cn.ydsy.manager.model.dto.IndexCategoryDTO;
import cn.ydsy.manager.service.BannerService;
import cn.ydsy.manager.service.IndexCategoryService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;
import java.util.stream.Collectors;

@Service(interfaceClass = IndexCategoryService.class)
public class IndexCategoryServiceImpl extends BaseServiceImpl<TbIndexcategoryMapper, TbIndexcategory, IndexCategoryDTO> implements IndexCategoryService {


    @Override
    public List<IndexCategoryDTO> select2Level() {
        var dbos =  this.baseMapper.selectByExample(this.sqlBuilder()
                .andWhere(Sqls.custom().andBetween("level",2,3)
                        .andEqualTo("isdelete",0).andEqualTo("status",1)).build());

        var list = (List<IndexCategoryDTO>) this.beanListMap(dbos,this.currentDTOClass());

//        var level2 = list.stream().filter((e)-> e.getLevel()==2).sorted((a,b)->a.getSort().compareTo(b.getSort())).collect(Collectors.toList());
        var level2 = list.stream().filter((e)-> e.getLevel()==2).collect(Collectors.toList());
        level2.forEach((e)->{
//            e.setSubCategorys(list.stream().filter((s)->s.getParentid()==e.getId()).sorted((a,b)->a.getSort().compareTo(b.getSort())).collect(Collectors.toList()));
            e.setSubCategorys(list.stream().filter((s)->s.getParentid()==e.getId()).collect(Collectors.toList()));

        });

        return level2;
    }
}
