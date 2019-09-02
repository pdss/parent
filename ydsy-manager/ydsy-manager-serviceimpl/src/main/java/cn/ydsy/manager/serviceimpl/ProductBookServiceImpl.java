package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbProductbookMapper;
import cn.ydsy.manager.mapper.TbSchoolMapper;
import cn.ydsy.manager.model.dbo.TbProductbook;
import cn.ydsy.manager.model.dbo.TbSchool;
import cn.ydsy.manager.model.dto.ProductBookDTO;
import cn.ydsy.manager.model.dto.SchoolDTO;
import cn.ydsy.manager.service.ProductBookService;
import cn.ydsy.manager.service.SchoolService;
import cn.ydsy.manager.utils.TransactionUtils;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;


@Service(interfaceClass = ProductBookService.class)
public class ProductBookServiceImpl extends BaseServiceImpl<TbProductbookMapper, TbProductbook, ProductBookDTO> implements ProductBookService {




}
