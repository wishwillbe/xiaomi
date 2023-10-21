package com.example.xiaomi.view;

import lombok.Data;

@Data
public class ResultView<T> { //传入标注是否为T型
    private Integer code;
    private T data;
    private String msg;
    private T rows;
    private Integer total;

    public static ResultView successData(Object data){
        ResultView resultView=new ResultView();
        resultView.setCode(200);
        resultView.setData(data);
        resultView.setMsg("操作成功");
        return resultView;
    }
    public static ResultView successData(){
        ResultView resultView=new ResultView();
        resultView.setCode(200);
        resultView.setMsg("操作成功");
        return resultView;
    }

    public static ResultView successRows(Object rows){
        ResultView resultView=new ResultView();
        resultView.setCode(200);
        resultView.setRows(rows);
        resultView.setMsg("操作成功");
        return resultView;
    }

    public static ResultView successRows(Object rows,Integer code){
        ResultView resultView=new ResultView();
        resultView.setCode(code);
        resultView.setRows(rows);
        resultView.setMsg("操作成功");
        return resultView;
    }

    public static ResultView fail(Integer code,String msg){
        ResultView resultView=new ResultView();
        resultView.setMsg(msg);
        resultView.setCode(code);
        return resultView;
    }

    public static ResultView fail(String msg){
        ResultView resultView=new ResultView();
        resultView.setMsg(msg);
        resultView.setCode(500);
        return resultView;
    }

}
