package com.gjw.common.util;

import com.gjw.common.vo.PageVo;
import com.gjw.common.vo.ResultVO;

import java.util.List;

/**
 * @Auther: zz-gjw
 * @Date: 2019/1/15 11:37
 * @Description:
 */
public class ResultUtil {
    //一般都是新增或修改或删除操作
    public static ResultVO exec(int count, Object obj){
        ResultVO resultVO=new ResultVO();
        if (count>0){
            resultVO.setCode(1);
            resultVO.setMsg("操作成功");
            resultVO.setData(obj);
        }else{
            resultVO.setCode(1001);
            resultVO.setMsg("操作失败");
        }
        return resultVO;
    }
    public static ResultVO execOK(){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("OK");
        return resultVO;
    }
    public static ResultVO execERROR(){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1002);
        resultVO.setMsg("ERROR");
        return resultVO;
    }
    public static ResultVO execERROR(Object obj){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1002);
        resultVO.setMsg("ERROR");
        resultVO.setData(obj);
        return resultVO;
    }
    public static ResultVO execOK(Object obj){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("OK");
        resultVO.setData(obj);
        return resultVO;
    }
    public static <T>PageVo<T> execPage(int page, int size, int count, List<T> data){
        PageVo<T> pageVo=new PageVo<>();
        pageVo.setData(data);
        pageVo.setCurrpage(page);
        pageVo.setSize(size);
        pageVo.setCount(count);
        return pageVo;
    }
}
