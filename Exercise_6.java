
// EXERCISE 6:

class InvalidInputException extends Exception{
    public String toString(){
        return "cannot add 8 & 9....!";
    }    
    public String getmesString(){
        return "i am getmessage()";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Inputed value cannot be greater than 100000...!";
    }    
    public String getmesString(){
        return "i am getmessage()";
    }
}
class MaxMultiplyException extends Exception{
    public String toString(){
        return "input can not be greater than 7000...!";
    }    
    public String getmesString(){
        return "i am getmessage()";
    }
}
class divideException extends Exception{
    public String toString(){
        return "cannot be divided by zero..!";
    }    
    public String getmesString(){
        return "i am getmessage()";
    }
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException,MaxInputException{
        if (a>100000||b>100000) {
            throw new MaxInputException();
        }
        else if (a==8||b==9) {
            throw new InvalidInputException();
        }
        return a+b;
    }
    double substract(double a, double b) throws MaxInputException{
        if (a>100000||b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException,MaxMultiplyException{
        if (a>100000||b>100000) {
            throw new MaxInputException();
        } 
        else if(a>7000||b>7000){
            throw new MaxMultiplyException();
        }
        return a*b;
    }
    double divide(double a, double b) throws MaxInputException,divideException{
        if (a>100000||b>100000) {
          throw new MaxInputException();  
        }
        else if (b==0) {
            throw new divideException();
        }
        return a/b;
    }
}
public class Exercise_6 {
    public static void main(String[] args) throws InvalidInputException,MaxInputException,MaxMultiplyException,divideException {

        CustomCalculator cc = new CustomCalculator();
        // cc.add(8, 9);
        // cc.substract(2, 100000000);
        // cc.multiply(55555, 0);
        cc.divide(40, 0);
    }
}