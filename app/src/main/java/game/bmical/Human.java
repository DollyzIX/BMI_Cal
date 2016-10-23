package game.bmical;

import java.util.*;


/**
 * Created by Ja on 10/23/2016.
 */
public class Human {
    private String result = null;
    int  num = Integer.parseInt(result);
    Scanner Height = new Scanner(String.valueOf(R.id.editText));
    Scanner Weight = new Scanner(String.valueOf(R.id.editText2));

}
    public String getResult(){

        int H = Integer.parseInt(Height);
        int W = Integer.parseInt(Weight);
        int H100 = h/100;
        int result1=0;
        result1 = W/(H100*H100);
        result1.toString(result);
        return result;

    }
protected void getMessage () {

    if (result1 < 18.5) {
        return Message = "น้ำหนักน้อยกว่าปกติ (ผอม)";
    } else if
        (resul1t >= 18.5 || result1 < 25){
        return Message1 = "น้ำหนักน้อยกว่าปกติ (ผอม)";
    }else if (result1>=25 || result1<30){
        return Message2 = "น้ำหนักน้อยกว่าปกติ (ผอม)";
    }else if  (result1 >= 30){
        return  Message3 = "น้ำหนักน้อยกว่าปกติ (ผอม)";

    }

}

