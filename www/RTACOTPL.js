var exec = require('cordova/exec');
var RTACOTPL={
    checkOTPLPrinterPaper:function(fnSuccess, fnError){
        exec(fnSuccess, fnError, "RTACOTPL", "checkOTPLPrinterPaper");
    },
    printOTPLImage:function(fnSuccess, fnError,imageString){
        exec(fnSuccess, fnError, "RTACOTPL", "printBitmap",[imageString]);
    },
}
module.exports = RTACOTPL;
