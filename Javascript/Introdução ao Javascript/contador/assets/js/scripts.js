let currentNumberWrapper = document.getElementById("currentNumber");
let currentNumber = 0

function increment() {
    currentNumber = currentNumber + 1;
    currentNumberWrapper.innerHTML = currentNumber;
    
    changeColor (currentNumber);
}

function decrement() {
    currentNumber = currentNumber - 1;
    currentNumberWrapper.innerHTML = currentNumber;
    
    changeColor (currentNumber);
}

function changeColor (currentNumber){
    if (currentNumber < 0){
        document.getElementById('currentNumber').className = "negativo";
    } else {
        document.getElementById('currentNumber').className = "positivo";
    }
}