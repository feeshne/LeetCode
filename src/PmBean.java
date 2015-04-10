/**
 * Created by Feeshne on 2015/4/10.
 */
public class PmBean {
    int errNum;
    String retMsg;
    RetData retData;

    class RetData {
        String city;
        String time;
        int aqi;
        String level;
        String core;
    }

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public RetData getRetData() {
        return retData;
    }

    public void setRetData(RetData retData) {
        this.retData = retData;
    }
}
