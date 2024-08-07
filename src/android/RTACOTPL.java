package in.rtac.RTAC;

import android.content.Intent;
import android.net.Uri;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import in.rtac.otpl.otpl;
import android.app.Activity;
import android.view.WindowManager;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class RTACOTPL  extends CordovaPlugin {
    private in.rtac.RTAC.RTACOTPL mContext;
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        switch(action){
            case "printBitmap":
                String imageString = args.getString(0);
                printOTPLBitmap(callbackContext, imageString);
                return true;
            case "checkOTPLPrinterPaper":
                checkOTPLPrinterPaper(callbackContext);
                return true;
            default:
                return false;
        }
    }
    void checkOTPLPrinterPaper(CallbackContext callbackContext) throws JSONException {
        otpl OTPL = new otpl(this.cordova.getActivity());
        JSONObject r = new JSONObject();
        r.put("hasPaper", OTPL.ifHavePaper());
        callbackContext.success(r.toString());
    }
    void printOTPLBitmap(CallbackContext callbackContext,String base64) throws JSONException {
        otpl OTPL = new otpl(this.cordova.getActivity());
        OTPL.printBitmap(base64);
        callbackContext.success();
        return;
    }
}
