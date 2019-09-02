package cn.ydsy.manager.model.dto;

import cn.ydsy.manager.model.dbo.TbBanner;
import cn.ydsy.manager.model.dbo.TbIndexcategory;
import lombok.Data;

import java.util.List;

@Data
public class IndexCategoryDTO extends TbIndexcategory implements BaseDTO {


    private List<IndexCategoryDTO> SubCategorys;


}
