package cn.itdivine.pattern.create.singleton.enumobj;

/**
 * 枚举：
 *     1、只应用启动时加载一次
 */
public enum ServiceCode {

    SYSTEM_NORMAL(200,"系统正常"),
    INVALID_PARAM(401,"无效参数"),
    SYSTEM_ERROR(500,"服务异常");

    /**
     * 枚举只能有私有的构造方法，应用初始化时加载
     * @param code
     * @param desc
     */
    private ServiceCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
