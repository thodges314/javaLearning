/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author Java
 */
public class bin2Dec {

    int returnValue = 0;

    public bin2Dec(String binaryString) throws BinaryFormatException {
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            switch (binaryString.charAt(i)) {
                case '1':
                    returnValue += (Math.pow(2.0, (length - 1 - i)));
                    break;
                case '0':
                    break;
                default:
                    throw new BinaryFormatException(binaryString);
            }
        }

    }

    public int inDec() {
        return returnValue;
    }
}
