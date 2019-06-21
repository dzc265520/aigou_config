package cn.itsource.aigou.util;

public class AjaxResult {
    private Boolean succsee=true;
    private String masg="操作成功";
    public static  AjaxResult me(){
        return new AjaxResult();
    }
    public Boolean getSuccsee() {
        return succsee;
    }

    public AjaxResult setSuccsee(Boolean succsee) {
        this.succsee = succsee;
        return this;

    }

    public String getMasg() {
        return masg;
    }

    public AjaxResult setMasg(String masg) {
        this.masg = masg;
        return this;
    }
}
