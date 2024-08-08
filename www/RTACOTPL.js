var exec = require('cordova/exec');
var RTACOTPL={
    checkOTPLPrinterPaper:function(fnSuccess, fnError){
        exec(fnSuccess, fnError, "RTAC", "checkOTPLPrinterPaper");
    },
    printOTPLImage:function(fnSuccess, fnError,imageString){
        exec(fnSuccess, fnError, "RTAC", "printBitmap",[imageString]);
    },
}
module.exports = RTACOTPL;
