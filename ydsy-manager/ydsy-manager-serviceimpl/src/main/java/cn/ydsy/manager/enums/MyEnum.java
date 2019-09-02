package cn.ydsy.manager.enums;

import lombok.Getter;

@Getter
public enum MyEnum {
    CODE_IS_NULL(101,"code为空"),
    CODE_ERROR(102,"获取code异常");
    private int status;
    private String msg;
    MyEnum(int status,String msg){
        this.status = status;
        this.msg = msg;
    }
}