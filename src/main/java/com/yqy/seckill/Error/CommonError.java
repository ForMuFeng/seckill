package com.yqy.seckill.Error;

public interface CommonError {
    public int getErrorCode();
    public String getErrMsg();
    public CommonError setErrMsg(String msg);

}
