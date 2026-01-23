class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        
        if( operation == null ){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        else if(operation.isEmpty() ){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else{
            switch (operation) {
                case "+":
                    int addition = operand1 + operand2;
                    return operand1 + " + " + operand2 + " = " + addition;

                case "*":    
                    int multiplication = operand1 * operand2;
                    return operand1 + " * " + operand2 + " = " + multiplication;

                case "/":
                    if (operand2 == 0) {
    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
}
                    int division = operand1 / operand2;
                    return operand1 + " / " + operand2 + " = " + division;
                default :
                    throw new IllegalOperationException("Operation " + "'"+operation +"'"+ " does not exist") ;
            } 
        }
        
     }
}