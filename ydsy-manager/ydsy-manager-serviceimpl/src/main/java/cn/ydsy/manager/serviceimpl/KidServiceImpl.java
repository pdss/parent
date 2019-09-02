package cn.ydsy.manager.serviceimpl;

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

    @Override
    public List<KidDTO> getAllKids(Long userid) {
        List<KidDTO> list = baseMapper.getAllKids(userid);
        if (list.size() == 0){
            return null;
        }
        return list;
    }

    @Override
    public MyResult addKid(KidDTO kid) {
        if (this.add(kid)){
            return MyResult.ok("上传小孩信息成功");
        }
        return MyResult.error("上传小孩信息失败");
    }

    @Override
    public MyResult updateKid(KidDTO kid) {
        if(this.updateById(kid)){
            return MyResult.ok("更新小孩信息成功");
        }
        return MyResult.error("更新小孩信息失败");
    }

    @Override
    public MyResult deleteKid(int id) {
        if(baseMapper.deleteById(id)){
            return MyResult.ok("删除小孩成功");
        }
//        if(this.deleteById(id)){
        return MyResult.error("删除小孩失败");
    }
}
