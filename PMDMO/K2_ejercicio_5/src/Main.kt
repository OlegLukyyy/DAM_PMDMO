fun main(){
    var isReady= true;
    var isProcessing= false;
    var isExpensive= true;

    var shortCircuitResult= isProcessing && isExpensive
    var fullEvalResult= isProcessing and isExpensive
    var isNotReady= !isReady

    print("$shortCircuitResult $fullEvalResult $isNotReady ")
}