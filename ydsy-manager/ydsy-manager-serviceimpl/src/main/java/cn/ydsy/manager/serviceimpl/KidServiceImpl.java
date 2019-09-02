/*package cn.ydsy.manager.serviceimpl;

import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.mapper.TbKidMapper;
import cn.ydsy.manager.mapper.TbWxuserMapper;
import cn.ydsy.manager.model.dbo.TbKid;
import cn.ydsy.manager.model.dbo.TbWxuser;
import cn.ydsy.manager.model.dto.KidDTO;
import cn.ydsy.manager.model.dto.WxUserDTO;
import cn.ydsy.manager.service.KidService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(interfaceClass = KidService.class)
public class KidServiceImpl extends BaseServiceImpl<TbKidMapper, TbKid, KidDTO> implements KidService {
    @Autowired
    private TbKidMapper tbKidMapper;
    @Override
    public MyResult getAllKids(Long userid) {
        List<TbKid> list = tbKidMapper.getAllKids(userid);
        if (list.size() == 0){
            return MyResult.error("当前没有小孩");
        }
        for (TbKid kid : list) {
            kid.setAddtime(null);
            kid.setIsdelete(null);
        }
        return MyResult.ok(list);
    }

    @Override
    public MyResult addKid(KidDTO kid) {
        if (tbKidMapper.addKid(kid) != 0){
            return MyResult.ok("修改成功");
        }
        return MyResult.error("修改失败");
    }
}*/
