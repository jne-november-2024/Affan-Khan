class CustException extends Exception {
    public CustException(String str) {
        super(str);  
    }
}

class Excep8 {
    public static void main(String args[]) {
        int i = 0, result = 0;
        int j = 18;

        try {
            if (i == 0) {
                
                throw new CustException("in cust");
            }

            
            result = j / i;

        } catch (CustException e) {
     
            result = j / 1;
            System.out.println("Caught custom exception: " + e.getMessage());
        } catch (Exception e) {
         
            System.err.println("Exception: " + e);
        }

        // Output the result
        System.out.println("Result is --> " + result);
        System.out.println("End of execution");
    }
}
