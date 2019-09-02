package cn.ydsy.manager.utils;

import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.enums.MyEnum;

public class MyResultUtil {
    public static MyResult success(Object data){
        MyResult myResult = new MyResult();
        myResult.setStatus(0);
        myResult.setMsg("成功");
        myResult.setData(data);
        return myResult;
    }
    public static MyResult success(){
        MyResult myResult = new MyResult();
        myResult.setStatus(0);
        myResult.setMsg("成功");
        return myResult;
    }
    public static MyResult error(MyEnum myEnum){
        MyResult myResult = new MyResult();
        myResult.setStatus(myEnum.getStatus());
        myResult.setMsg(myEnum.getMsg());
        return myResult;
    }
}